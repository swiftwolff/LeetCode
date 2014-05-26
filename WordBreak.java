import java.util.HashSet;
import java.util.Set;


public class WordBreak {
	
	//TLE
	public boolean wordBreakRecursion(String s, Set<String> dict) {
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
    public boolean wordBreak(String s, Set<String> dict) {
        if(s.length()==0||dict.size()==0) return false;
        boolean [] canBreak = new boolean[s.length()+1];
        canBreak[0] = true;
        for(int i=0;i<s.length();i++){
        	if(canBreak[i]==false){
        		continue;
        	}
        	for(String dictS:dict){  //iterate words in dict
        		int len = dictS.length();  //find length of the word
        		int end = i +len; //ith char plus length of the word
        		if(end>s.length()){
        			continue;
        		}
        		if(s.substring(i,end).equals(dictS)){
        			canBreak[end] = true;
        		}
        	}
        }
        
        return canBreak[s.length()];
    }
    
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
    	String a = "abcd";
    	System.out.println(a.substring(2));
    	System.out.println(solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dict));
    }
}
