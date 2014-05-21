import java.util.ArrayList;
import java.util.HashMap;
public class GenerateParentheses {
//	public static ArrayList<String> generateParenthesis(int n) {
//		ArrayList<String> res = new ArrayList<String>();
//		if(n==0){
//			return res;
//		}
//        if(n==1){
//        	res.add("()");
//        	return res;
//        }
//	      int left = n;
//	      int right = n;
//	      
//		  generateParenthesisHelper(left,right,"",res);
//		  
//	      return res;
//	}
//	   
//	public static void generateParenthesisHelper(int left, int right, String curStr,ArrayList<String> res){
//		
//		if(left==0 && right==0){
//			res.add(curStr);
//			return;
//		}
//		
//		if(left>0){
//			String tmp = curStr+"(";
//			generateParenthesisHelper(left-1,right,tmp,res);
//		}
//		if(right > left){
//			String tmptwo = curStr+")";
//			generateParenthesisHelper(left,right-1,tmptwo,res);
//		}
//	
//		return;
//	}
	   
	public ArrayList<String> generateParenth(int num){
	    
        ArrayList<String> res = new ArrayList<String>();
        if(num<=0) return res;
        String s = "";
        generateParenthHelper(s,num,num,res);
        return res;
    }

    public void generateParenthHelper(String s, int left, int right, ArrayList<String> res){
    
        if(left==0 && right==0){
            res.add(s);
        }
        
        if(left!=0){  
        	String tmpleft = s+"(";
            generateParenthHelper(tmpleft,left-1,right,res);
        }
        if(left<right){
        	String tmpright = s + ")";
            generateParenthHelper(tmpright,left,right-1,res);
        }
      
        return;
    }
	public static void main(String args[]){
		GenerateParentheses solution = new GenerateParentheses();
		System.out.println(solution.generateParenth(3));
	}
}
