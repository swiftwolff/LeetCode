public class RotateImage {
	
	public static void rotateImage(int[][] square){
		if (square.length==0){
			return;
		}
		int n = square.length;
		int first;
		int last;
		int tmp;
		for(int layer=0;layer<n/2;layer++){
			first = layer;
			last = n-1-layer;
			for (int i=first;i<last;i++){
				tmp = square[first][first];
				square[first][first] = square[last][first];
				square[last][first] = square[last][last];
				square[last][last] = square[first][last];
				square[first][last] = tmp;
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
