import java.util.ArrayList;
import java.util.HashMap;
public class GenerateParentheses {
	public static ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> res = new ArrayList<String>();
		if(n==0){
			return res;
		}
        if(n==1){
        	res.add("()");
        	return res;
        }
	      int left = n;
	      int right = n;
	      
		  generateParenthesisHelper(left,right,"",res);
		  
	      return res;
	}
	   
	public static void generateParenthesisHelper(int left, int right, String curStr,ArrayList<String> res){
		
		if(left==0 && right==0){
			res.add(curStr);
			return;
		}
		
		if(left>0){
			String tmp = curStr+"(";
			generateParenthesisHelper(left-1,right,tmp,res);
		}
		if(right > left){
			String tmptwo = curStr+")";
			generateParenthesisHelper(left,right-1,tmptwo,res);
		}
	
		return;
	}
	
//	public  static  ArrayList<String> generateParenthesis( int  n) {  
//        ArrayList<String> list =  new  ArrayList<String>();  
//        rec(n,  0 ,  0 ,  "" , list);  
//        return  list;  
//    }  
//      
//    public  static  void  rec( int  n,  int  left,  int  right, String s, ArrayList<String> list){  
//        // invariant必須滿足左括號數目要大等於右括號數目  
//        if (left < right){  
//            return ;  
//        }  
//          
//        // 如果左右括號數目相等則添加到list  
//        if (left==n && right==n){  
//            list.add(s);  
//            return ;  
//        }  
//          
//        // 左括號已滿，只能添加右括號  
//        if (left == n){  
//            rec(n, left, right+ 1 , s+ ")" , list);  
//            return ;  
//        }  
//          
//        rec(n, left+ 1 , right, s+ "(" , list);      //繼續添加左括號  
//        rec(n, left, right+ 1 , s+ ")" , list);      //繼續添加右括號  
//    }  
	   
	
	public static void main(String args[]){
		System.out.println(generateParenthesis(3));
	}
}
