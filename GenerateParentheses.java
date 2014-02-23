import java.util.ArrayList;
public class GenerateParentheses {
	
	public static ArrayList<String> generateParenthesis(int n) {

		String p = "()";
		ArrayList<String> parenth = new ArrayList<String>();
		String tmp = "";
		for (int i=0;i<n;i++){
			tmp += p;
		}

		generatehelperII(parenth,tmp);
        return parenth;
    }
	
	public static void generatehelper(ArrayList<String> parenth,String input){
		
		char[] c = input.toCharArray();
		for (int i=0;i<c.length-1;i++){
			if (c[i]==')' && c[i+1]=='('){
				String tmp = swap(c,i,i+1);
				if (parenth.contains(tmp)){
					return;
				}
				parenth.add(tmp);
				
				generatehelper(parenth,tmp);
			}
		}
		
		
		return;
	}
	
	public static String generatehelperII(ArrayList<String> parenth,String input){
		
		parenth.add(input);
		char[] c = input.toCharArray();
		for (int i=0;i<c.length-1;i++){
			if (c[i]==')' && c[i+1]=='('){
				String tmp = swap(c,i,i+1);
				if (parenth.contains(tmp)){
					continue;
				}
				generatehelperII(parenth,tmp);
			}
		}
		
		return input;
		
	}
	
	public static String swap(char[] c,int i, int j){
		char[] temp = c.clone();
		char tmp = temp[i];
		temp[i] = temp[j];
		temp[j] = tmp;

		return new String(temp);
		
	}
	
	public static void main(String args[]){
		System.out.println(GenerateParentheses.generateParenthesis(0));
	}
}
