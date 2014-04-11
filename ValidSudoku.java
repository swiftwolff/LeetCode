import java.util.ArrayList;
import java.util.HashSet;


public class ValidSudoku {
	
	public static boolean isValidSudoku(char[][] board) {
		
		int len = board.length;
		if(len==0){
			return false;
		}
		//check horizontal 
       for(int i=0;i<board.length;i++){
    	   HashSet<Character> table = new HashSet<Character>();
    	   for(int j=0;j<board[0].length;j++){
    		   if(board[i][j]=='.'){
    			   continue;
    		   }
    		   if(table.add(board[i][j])==false){
    			   System.out.println("here1");
    			   System.out.println("i is " + i);
    			   System.out.println("j is "+ j);
    			   return false;
    		   }
    	   }
       }
	   //check vertical
       for(int j=0;j<board[0].length;j++){
    	   HashSet<Character> table = new HashSet<Character>();
    	   for(int i=0;i<board.length;i++){
    		   if(board[i][j]=='.'){
    			   continue;
    		   }
    		   if(table.add(board[i][j])==false){
    			   System.out.println("here2");
    			   System.out.println("i is " + i);
    			   System.out.println("j is "+ j);
    			   return false;
    		   }
    	   }
       }
       
       //check small boxes
       for(int i=0;i<len;i+=3){
    	   HashSet<Character> table = new HashSet<Character>();
    	   for(int k=0;k<len;k++){ //row	
    		   if(k%3==0){
    			   table.clear();
    		   }
    		   for(int j=i;j<i+3;j++){  //col
    			   if(j>=3 && j<6){
    				   System.out.println(table);
    			   }
    			   if(board[k][j]=='.'){
        			   continue;
        		   }
    			   System.out.println(table);
    			   if(table.add(board[k][j])==false){
    				   System.out.println("here3");
    				   System.out.println("k is " + k);
        			   System.out.println("j is "+ j);
        			   System.out.println(table);
        			   System.out.println(board[k][j]);
    				   return false;
    			   }
    		   }
    	   }
       }
		
		return true;
    }
	
	public static char[][] testCase(ArrayList<String> testcase){
		char[][] build = new char[9][9];
		int k = 0;
		int l = 0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				build[i][j] = testcase.get(k).charAt(l);
				l++;
			}
			l=0;
			k++;
		}
		return build;
	}
	
	public static void main(String args[]){
		ArrayList<String> testcase = new ArrayList<String>();	
		testcase.add("....5..1.");
		testcase.add(".4.3.....");
		testcase.add(".....3..1");
		testcase.add("8......2.");
		testcase.add("..2.7....");
		testcase.add(".15......");
		testcase.add(".....2...");
		testcase.add(".2.9.....");
		testcase.add("..4......");
		
		char[][] one = testCase(testcase);
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(one[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(isValidSudoku(one));
		
		
		
		
//		int len = 9;
//		for(int i=0;i<len;i+=3){
//	    	   for(int k=0;k<len;k++){
//	    		   for(int j=i;j<i+3;j++){
//	    			   System.out.println("row " + k);
//	    			   System.out.println("col " + j);
//	    		   }
//	    	   }
//	       }
		
	}
}
