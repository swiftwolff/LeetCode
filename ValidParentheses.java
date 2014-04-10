import java.util.HashMap;
import java.util.Stack;
public class ValidParentheses {
	
	public static boolean isValid(String s) {
        
        if(s.length()<=1||s.length()%2!=0){
            return false;
        }
        HashMap<Character,Integer> table = new HashMap<Character,Integer>();
        Stack<Character> store = new Stack<Character>();
        table.put('(', 1);
        table.put(')',-1);
        table.put('[', 2);
        table.put(']', -2);
        table.put('{', 3);
        table.put('}',-3);
        
        for(int i=0;i<s.length();i++){
        	if(table.get(s.charAt(i))>0){
        		store.push(s.charAt(i));
        	}else{
        		if(!store.isEmpty() && table.get(store.pop())+table.get(s.charAt(i))!=0){
        			return false;
        		}
        	}
        }
        if(!store.isEmpty()){
        	return false;
        }
        return true;
    }
    
    public static boolean isValidHelper(String s, int start, int end, HashMap<Character,Integer> table){
        
        if(start>end){
            return true;
        }
        
        if(start+2<=end && table.get(s.charAt(start))+table.get(s.charAt(start+1))==0){
        	return isValidHelper(s,start+2,end,table);
        }
        
        if(table.get(s.charAt(start))+table.get(s.charAt(end))==0){
            return isValidHelper(s,start+1,end-1,table);
        }else{
            int tmp = end;
            while(table.get(s.charAt(start))+table.get(s.charAt(end))!=0){
                end--;
                if(end<start){
                    return false;
                }
            }
            return isValidHelper(s,start,end,table) && isValidHelper(s,end+1,tmp,table);
        }
        
    }
	
	
	
	public static void main(String args[]){
		String s = "{{}}[][]{{}}";
		System.out.println(isValid(s));
	}
}
