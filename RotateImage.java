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
	
	
	public static void main(String args[]){
		int[][] A={{1,2,3},{4,5,6},{7,8,9}};
		
		rotateImage(A);
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				System.out.print(A[i][j]);
			}
		}
		
	}
}
