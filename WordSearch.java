
public class WordSearch {
	public static boolean exist(char[][] board,String word){
		if(board==null||word.length()==0||word==null){
			return false;
		}
		boolean res = false;
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(board[i][j]==word.charAt(0)){
					char tmp = board[i][j];
					board[i][j] = ' ';
					res = existHelper(board,i,j,word.substring(1,word.length()));
					if (res) return true;
					board[i][j] = tmp;
				}
			}
		}
		
		return res;
	}
	
	public static boolean existHelper(char[][] board,int i,int j,String word){
		if(word.length()==0){
			return true;
		}
		
		boolean res = false;
		for(int r=i-1;r<=i+1;r+=2){
			if(r<0||r>board.length-1) continue;
			if(board[r][j]==word.charAt(0)){
				char tmp = board[r][j];
				board[r][j] = ' ';
				res = existHelper(board,r,j,word.substring(1,word.length()));
				if (res) return true;
				board[r][j] = tmp;
			}
		}
		for(int c=j-1;c<=j+1;c+=2){
			if(c<0||c>board[0].length-1) continue;
			if(board[i][c]==word.charAt(0)){
				char tmp = board[i][c];
				board[i][c] = ' ';
				res = existHelper(board,i,c,word.substring(1,word.length()));
				if (res) return true;
				board[i][c] = tmp;
			}
			
		}
		
		return res;
		
	}
	
	
	public static void main(String args[]){
		char[][] board = {{'C','A','A'},{'A','A','A'},{'A','A','B'}};
		
		System.out.println(exist(board, "AAB"));
		
	}
}
