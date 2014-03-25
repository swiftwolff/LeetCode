
//
/**[]
 [1,2,3,4]
 [5,6,7,8]
[9,10,11,12]
[13,14,15,16]
**/
//
public class MatrixPrint {
	
	public static void printMatrix(int[][]matrix,int n){
		
		  for(int i = 0;i<2*n-1;i++){
			  int z = i>n-1? i-n+1:0;
			  for(int j=z;j<=i-z;j++){
				  System.out.println(matrix[i-j][j]);
			  }
		  }
	}
	
	public static void main(String args[]){
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		printMatrix(A,3);
		
	}
}
