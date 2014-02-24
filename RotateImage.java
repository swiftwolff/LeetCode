public class RotateImage {
	
	public static void rotate(int[][] matrix){
		int i = matrix.length;
		int j = matrix[0].length;
		int m = 0;
		int n=0;
//		for (int n=0; n<matrix.length; n++){
			int tmp = matrix[m][n];
			matrix[m][n] = matrix[i-1][n];
			matrix[m][j-1] = tmp;
			matrix[i-1][j-1] = matrix[m][j-1];
			matrix[i-1][n] = matrix[i-1][j-1];
//			m++;
//			i--;
//			j--;
//		}
		return;
		
		
	}
	
	public static void printmatrix(int[][] matrix){
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.println(matrix[i][j]);
			}
		}
		
		
		
		
	}
	
	public static void main(String args[]){
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		RotateImage.printmatrix(matrix);
		RotateImage.rotate(matrix);
		System.out.println();
		RotateImage.printmatrix(matrix);
	}
}
