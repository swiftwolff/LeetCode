
public class matrixRegionSum {
	
	public int matrixSumRegion(int[][] matrix, int[] a, int[] b){  //m and n represent two points
		
		int[][] sumMatrix = new int[matrix.length][matrix[0].length];
		sumMatrix[0][0] = matrix[0][0];
		
		for(int i=1;i<matrix.length;i++){
			sumMatrix[i][0] = matrix[i][0] + sumMatrix[i-1][0];
		}
		for(int j=1;j<matrix[0].length;j++){
			sumMatrix[0][j] = matrix[0][j] + sumMatrix[0][j-1];
		}

		for(int i=1;i<matrix.length;i++){
			int preCol = matrix[i][0];
			for(int j=1;j<matrix[0].length;j++){
				sumMatrix[i][j] = matrix[i][j] + sumMatrix[i-1][j] + preCol; 
				preCol = preCol + matrix[i][j];
			}
		}
		
		int rowmin = Math.min(a[0], b[0]);
		int rowmax = Math.max(a[0], b[0]);
		int colmin = Math.min(a[1], b[1]);  //this is wrong
		int colmax = Math.max(a[1], b[1]);
		
      for(int i=0;i<matrix.length;i++){
    	for(int j=0;j<matrix[0].length;j++){
    		System.out.println(sumMatrix[i][j]);
    	}
    }
		System.out.println("start calculating");
		int total = sumMatrix[rowmax][colmax];
		int upper = sumMatrix[rowmin-1][colmax];
		int left = sumMatrix[rowmax][colmin-1];
		int overlap = sumMatrix[rowmin-1][colmin-1];
		return total-upper-left+overlap;
		
	}
	public static void main(String args[]){	
		
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[] a = {1,2};
		int[] b = {2,2};
		matrixRegionSum solution = new matrixRegionSum();
		System.out.println(solution.matrixSumRegion(matrix, a, b));
	}
	
}
