public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
	        int[][] res = new int[n][n];
	        if(n==1){
	            res[0][0]=1;
	            return res;
	        }
	        int start = 1;
	        int row = 0;
	        int col = 0;

	        for(int i=n;i>0;i-=2){  //This is the key outer to inner
	        	if(i==1){
	        		res[row][col] = start;
	        		break;
	        	}
	            for(int j=0;j<i-1;j++){
	                res[row][col++] = start++;
	            }
	            for(int j=0;j<i-1;j++){
	                res[row++][col] = start++;
	            }
	            for(int j=0;j<i-1;j++){
	                res[row][col--] = start++;
	            }
	            for(int j=0;j<i-1;j++){
	                res[row--][col] = start++;
	            }
	            row++;
	            col++;
	        }

	        return res;
	}
	public static void main(String args[]){
		int[][] a = generateMatrix(5);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.println(a[i][j]);
			}
		}
	}
}
