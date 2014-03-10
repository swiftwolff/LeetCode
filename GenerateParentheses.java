import java.util.ArrayList;
import java.util.HashMap;
public class GenerateParentheses {
	public static ArrayList<String> generateParenthesis(int n) {
        
	      ArrayList<String> res = new ArrayList<String>();
	      if (n<=0){
	          return res;
	      }
	      String parenth = "";
	      for (int i=0;i<n;i++){
	          parenth += "()";
	      }
	      
	      char[] parenthArry = parenth.toCharArray();
	      HashMap<String,Integer> table = new HashMap<String,Integer>();
	      generate(parenthArry,res,table);
	      return res;
	      
	    }
	    
	    public static void generate(char[] parenthArry, ArrayList<String> res, HashMap<String,Integer> table){
	        
	        String tmp = new String(parenthArry);
	        if(table.get(tmp)!=null){
	            return;
	        }
	        table.put(tmp,0);
	        res.add(tmp);
	
	        for (int j=0;j<parenthArry.length;j++){
	          if (j==parenthArry.length-1){
	              break;
	          }
	          if(parenthArry[j]==')'&&parenthArry[j+1]=='('){
	              swap(parenthArry,j,j+1);
	              generate(parenthArry,res,table);
	              swap(parenthArry,j,j+1);
	          }
	        }
	        return;
	    }
	    
	    public static void swap(char[] A,int i,int j){
	        char tmp = A[i];
	        A[i] = A[j];
	        A[j] = tmp;
	    }

	
	public static void main(String args[]){
		System.out.println(generateParenthesis(3));
	}
}
