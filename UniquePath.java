public class UniquePath {
	
	public static int unique(int m,int n){
		
		if(m==0||n==0){
			return 0;
		}
		if(m==1||n==1){
			return 1;
		}
		int[][] matrix = new int[m][n];
		for(int i=m-1;i>-1;i--){ //populates row
			matrix[i][n-1] = 1;
		}
		for(int j=n-1;j>-1;j--){ //populates col
			matrix[m-1][j] = 1;
		}
		
		for(int i=m-2;i>-1;i--){
			for(int j=n-2;j>-1;j--){
				matrix[i][j] = matrix[i+1][j] + matrix[i][j+1];
			}
		}
		
		return matrix[0][0];
	}
	
	
	public static void main(String args[]){

		System.out.println(unique(3,3));
	}
}
