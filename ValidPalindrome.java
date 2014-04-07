import java.util.HashSet;
public class ValidPalindrome {
	
	public static boolean isValidPalindrome(String s){
		if(s.length()==0){
			return true;
		}
		s = s.toLowerCase();
		int i=0;
		int j=s.length()-1;
		while(i<j){
			while(i<j&&s.substring(i,i+1).matches(("\\W"))){
				System.out.println("first");
				i++;
			}
			while(i<j&&s.substring(j,j+1).matches(("\\W"))){
				System.out.println("second");
				j--;
			}
			//deal with i>j
			if(i<j&&s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		
		
		return true;
	}
	
	public static void main(String args[]){
		System.out.println(isValidPalindrome(".,"));
		String s = ".";
//		System.out.println(s.substring(0,1));
//		String[] a = s.split(".");
//		System.out.println(!s.matches("\\w"));
	}
}
