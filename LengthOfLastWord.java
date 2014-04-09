
public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s){
		if (s == null || s.length() == 0) {  
            return 0;  
        }  
        int len = s.length();  
        int count = 0;  
        for (int i = len - 1; i > -1; i--) {  
            if (s.charAt(i) != ' ') {  
                count++;  
            }  
            if(s.charAt(i)==' '&&count != 0){  
                return count;  
            }  
        }  
        return count;  
	}
	public static void main(String args[]){
		String s = "     man    ";
		
//		System.out.println(lengthOfLastWord(s));
		System.out.println(lengthOfLastWord(s));
		
	}
}
