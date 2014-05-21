import java.util.HashSet;
import java.util.Set;


public class WordBreak {
	
	//TLE
	public boolean wordBreak(String s, Set<String> dict) {
        if(s.length()==0||dict.size()==0) return false;
        
        return wordBreakHelper(s,1,dict);
    }
    
    public boolean wordBreakHelper(String s, int pos, Set<String> dict){
        if(s.length()==0){
            return true;
        }
        if(pos>s.length()){
            return false;
        }
        String first = s.substring(0,pos);
        if(dict.contains(first)){
            return wordBreakHelper(s.substring(pos,s.length()),1,dict) || wordBreakHelper(s,pos+1,dict);
        }
        return wordBreakHelper(s,pos+1,dict);
    }
    
    //Using DP
    
    
    public static void main(String args[]){
    	Set<String> dict = new HashSet<String>();
    	dict.add("a");
    	dict.add("aa");
    	dict.add("aaa");
    	dict.add("aaaa");
    	dict.add("aaaaa");
    	dict.add("aaaaaa");
    	dict.add("aaaaaaa");
    	WordBreak solution = new WordBreak();
    	System.out.println(solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", dict));
    }
}
