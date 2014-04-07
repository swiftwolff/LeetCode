import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Anagram {
	public static ArrayList<String> anagrams(String[] strs) {
        
        ArrayList<String> res = new ArrayList<String>();
        if(strs.length<=1){
            return res;
        }
        HashMap<String,String> table = new HashMap<String,String>();
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String tmp = new String(c);
            if(table.containsKey(tmp)){
                if(table.get(tmp)!=null){
                    res.add(table.get(tmp));
                    table.put(tmp,null);
                }
                res.add(strs[i]);
            }else{
                table.put(tmp,strs[i]);
            }
            
        }
        return res;
    }
	
	public static void main(String args[]){
		String[] words={"art","cat","rat","banana","tar","act"}; 
		System.out.println(anagrams(words));
		
	}
}

//need to to string reverse
//need to do matrix problem