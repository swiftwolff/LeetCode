import java.util.Arrays;

public class RotateImage {
	
	public static void rotateImage(int[][] square){
		if (square.length==0){
			return;
		}
		int first;
		int last;
		int offset;
		for(int layer=0;layer<square.length/2;layer++){
			first = layer;
			last = square.length-1-layer;
			
			for(int i=first;i<last;i++){
				offset = i-first;
				
				int tmp = square[first][i];
				square[first][i] = square[last-offset][first];
				square[last-offset][first] = square[last][last-offset];
				square[last][last-offset] = square[i][last];
				square[i][last] = tmp;
			}
			
		}
	}
	
	public static void rotate(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return;
        }
        
        for(int i=0;i<matrix.length/2;i++){
            
            int first = i;
            int last = matrix.length-i-1;
            
            for(int j=i;j<last;j++){
            	int offset = j-i;
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[j][last];
                matrix[j][last] = tmp;
                
            }
        }
    }
	
	public static void main(String args[]){
		int[][] A={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(A);
//		rotateImage(A);
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				System.out.print(A[i][j]);
			}
		}
		
	}
}
