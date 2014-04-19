import java.util.ArrayList;
public class PalindromePartitioning {
	
	public static ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		if(s==null||s.length()==0){
			return res;
		}
		int cur = 0;
		int end = cur+1;
		while(end<=s.length()){
			String check = s.substring(cur,end);
			if(isPalidrome(check)){
				ArrayList<String> tmp = new ArrayList<String>();
				tmp.add(check);
				partitionHelper(s,end,tmp,res);
			}
			end++;
		}
		return res;
	}
	
	public static void partitionHelper(String s, int prev, ArrayList<String> current,ArrayList<ArrayList<String>> res){
        if(prev>s.length()-1){
        	res.add(current);
        	return;
        }
        int cur = prev;
		int end = cur+1;
		while(end<=s.length()){
			String check = s.substring(cur,end);
			if(isPalidrome(check)){
				ArrayList<String> tmp = new ArrayList<String>(current);
				tmp.add(check);
				partitionHelper(s,end,tmp,res);
			}
			end++;
		}
    }
	
	public static boolean isPalidrome(String s){
	        int start = 0;
	        int end = s.length()-1;
	        while(start < end){
	            if(!s.substring(start,start+1).equals(s.substring(end,end+1))){
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }
	
	
	public static void main(String args[]){
		String check = "aba";
		System.out.println(partition(check));
	}
}
