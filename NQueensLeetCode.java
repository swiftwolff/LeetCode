import java.util.ArrayList;
public class NQueensLeetCode {
    public static ArrayList<String[]> solveNQueens(int n) {
        int[] board = new int[n];
        ArrayList<int[]> res = new ArrayList<int[]>();
        ArrayList<String[]> ans = new ArrayList<String[]>();
        if(n==0){
        	return ans;
        }
        for(int i=0;i<n;i++){
            board[0] = i;
            solveNQueensHelper(1,n,board,res);
        }
        
        for(int[] i:res){
        	ans.add(printBoards(i));
        }
        return ans;
    }
    
    public static void solveNQueensHelper(int row, int n,int[] board,ArrayList<int[]> res){
        if(row>n-1){
            res.add(board);
            return;
        }
        int[] tmp = board.clone();
        for(int j=0;j<n;j++){  // new col
            for(int i=0;i<row;i++){//check all the prev rows
                if(tmp[i]==j || Math.abs(row-i)==Math.abs(tmp[i]-j)){
                	break;
                }
                if(i==row-1){  //This is the KEY to make it work!
                	tmp[row] = j;
                    solveNQueensHelper(row+1,n,tmp,res);
                }
            }
            
        }
        return;
    }
    
    public static String[] printBoards(int[] board){
    	ArrayList<StringBuffer> res = new ArrayList<StringBuffer>();
    	for(int i=0;i<board.length;i++){
    		StringBuffer row = new StringBuffer();
    		for(int j=0;j<board.length;j++){
    			row.append('.');
    		}
    		res.add(row);
    	}
    	
    	for(int i=0;i<res.size();i++){
    		res.get(i).replace(board[i],board[i]+1,"Q");
    	}
    	String[] ans = new String[board.length];
    	for(int i=0;i<board.length;i++){
    		ans[i] = res.get(i).toString();
    	}
    	
    	return ans;
    }
    
    
    public static void main(String args[]){
    	ArrayList<String[]> check = new ArrayList<String[]>();
    	check = solveNQueens(4);
    	for(String[] s:check){
    		for(int i=0;i<s.length;i++){
    			System.out.println(s[i]);
    		}
    	}
//    	System.out.println(solveNQueens(4));
    }
}
