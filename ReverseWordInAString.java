
public class ReverseWordInAString {
	public static String reverseWordsWrong(String s) { //cannot handle edge cases
        if(s.length()==0){
            return s;
        }
        int empty = 0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)==' '){
        		empty++;
        	}
        }
        if(empty==s.length()){
        	return "";
        }
        char[] tmp = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        
        while(start<end){
            swap(tmp,start,end);
            start++;
            end--;
        }
       int cur=0;
       int next=0;
       while(cur<tmp.length){

    	   while(cur<tmp.length&&tmp[cur]==' '){
    		   cur++;
    	   }
    	   next = cur;
    	   while(next<tmp.length&&tmp[next]!=' '){
    		   next++;
    	   }
    	   swapLetters(tmp,cur,next-1);
    	   cur = next;
       }
       
       
        return new String(tmp);  
        
    }
	
	public static void swapLetters(char[] str, int a, int b){
		while(a<b){
			swap(str,a,b);
			a++;
			b--;
		}
	}
        
    public static void swap(char[] str, int a, int b){
        char tmp = str[a];
        str[a] = str[b];
        str[b] = tmp;
    }
    
    public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		String[] array = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = array.length - 1; i >= 0; --i) {
			if (!array[i].equals("")) {
				sb.append(array[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
    
    public static void main(String args[]){
    	String s = "   ";
    	System.out.println(reverseWords(s));
//    	System.out.println(s==null);
    }
}
