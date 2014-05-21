import java.util.ArrayList;


public class PermutationString {
	public ArrayList<String> permutation(String s){
		ArrayList<String> res = new ArrayList<String>();
        if(s.length()==0 || s==null) return res;
        
        char[] c = s.toCharArray();
        permutationHelper(c,0,res);
    
        return res;
    }

    public void permutationHelper(char[] c, int cur, ArrayList<String> res){
    
        if(cur==c.length-1){
            String tmp = new String(c);
            res.add(tmp);
            return;
        }
        
        for(int i=cur;i<c.length;i++){
            swap(c,i,cur);
            permutationHelper(c,cur+1,res);
            swap(c,i,cur);
        }
        return;
    }
    
    public void swap(char[] c, int a, int b){
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
        return;
    }
    
    public static void main(String args[]){
    	String s = "abc";
    	PermutationString solution = new PermutationString();
    	System.out.println(solution.permutation(s));
    }
}
