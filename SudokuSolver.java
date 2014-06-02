import java.util.HashSet;

public class SudokuSolver {
	
	public static void solveSudoku(char[][] board) {
        if(board==null) return;
		solveSudokuDFS(board,0,0);
		return;
    }
	
	public static boolean solveSudokuDFS(char[][] board, int i, int j){
		
		if(i>board.length-1 && j>board[0].length-1){
			return true;
		}
		
		if(i==board.length-1){
			return solveSudokuDFS(board,0,j+1);
			
		}
		
		if(j==board[0].length-1){
			return solveSudokuDFS(board,i+1,0);
		}
		
		if(board[i][j]!='.'){
			return solveSudokuDFS(board,i+1,j);
		}
		
		HashSet<Character> table = new HashSet<Character>();
		for(int r=0;r<9;r++){
			if(board[r][j]!='.'){
				table.add(board[r][j]);
			}
		}
		for(int c=0;c<9;c++){
			if(board[i][c]!='.'){
				table.add(board[i][c]);
			}	
		}
		//which grid?
		int rowStart = (i/3)*3;
		int colStart = (j/3)*3;
		for(int a=rowStart;a<rowStart+3;a++){
			for(int b=colStart;b<colStart+3;b++){
				if(board[a][b]!='.'){
					table.add(board[a][b]);
				}
			}
		}
		if(table.size()==9) return false;
		for(int start=1;start<=9;start++){
			char tmp = (char)(start+'0');
			if(!table.contains(tmp)){
				board[i][j] = tmp;
				System.out.println("trying "+ tmp + " at "+i +" "+ j);
				boolean res = solveSudokuDFS(board,i+1,j);
				System.out.println("Input: ------------------------------------");
				for(int g=0;g<9;g++){
					for(int z=0;z<9;z++){
					System.out.print(board[g][z]);
					System.out.print(" ");
					
					}
				System.out.println();
				}
				
				if(res){
					return true;
				}
				board[i][j] = '.';
			}
		}
		
		return false;
	}
	
//	public void solveSudoku(char[][] board){
//		if(board==null||board.length==0){
//			return;
//		}
//		solved(board);
//	}
	
//	private boolean solved(char[][] board){
//		for(int i=0;i<board.length;i++){
//			for(int j=0;j<board[0].length;j++){
//				if(board[i][j]=='.'){
//					for(char num='1';num<='9';num++){
//						if(isValid(board,i,j,num)){
//							board[i][j]=num;
//							if(solved(board)){
//								return true;
//							}
//							else{
//								board[i][j] = '.';
//							}
//							
//						}
//						return false;
//					}
//				}
//			}
//		}
//		return true;
//	}
	
	
	
	public static void solveSudokuGood(char[][] board) {
        if (board==null||board.length==0){
            return;
        }
        
        solved(board);
        
        
    }
    private static boolean solved(char[][] board){
      
        for(int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if (board[i][j]=='.'){
                    for (char num='1'; num<='9'; num++){
                        
                        if(isValid(board, i, j, num)){
                            // no conflict
                            board[i][j]=num;
                            
                            if (solved(board)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                            
                        }
                      
                    }
                    // if no proper number found, return false
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private static boolean isValid(char[][] board, int i, int j, char c){
     
        // check column
        for (int row=0; row<9; row++){
            if (board[row][j]==c){
                return false;
            }
           
             
        }
        
       // check row
        for (int col=0; col<9; col++){
            if (board[i][col]==c){
                return false;
            }
            
        }
      
        // check block
        for(int row=i/3*3; row<i/3*3+3; row++){
            for (int col=j/3*3; col<j/3*3+3; col++){
                if (board[row][col]==c){
                    return false;
                }
                
            }
        }
       
        return true;
        
    }
	
	public static void main(String args[]){
		
		String[] input = {"854219763","3....54.1","..1..398.","785126394","...538...",".3.......",".263..5..","513792648","47...1..."};
		char[][] board = new char[9][9];
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){			
				board[i][j] = input[i].charAt(j);
			}
		}
		
		solveSudoku(board);
//		solveSudokuGood(board);
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
			System.out.print(board[i][j]);
			System.out.print(" ");
			}
		System.out.println();
		}
		
		
	}
	
}
