public class UniquePath {
	
	public static int unique(int m,int n){
		int[][] grid =new int[m][n];
		
		for(int i=0;i<m;i++){  //the reason we populate the grid with 1 is that, it takes 1 distinct step to the next
			grid[0][i] = 1;
		}
		for (int j=0;j<n;j++){ //same here 
			grid[j][0] = 1;
		}
		
		int x = 1;
		int y = 1;
		
		while(x<m && y<n){
			grid[y][x] = grid[y-1][x]+grid[y][x-1];
			if (x+1==m){
				y++;
				x--;
			}else{
				x++;
			}
		}
		
		return grid[m-1][n-1];
	}
	
	
	public static void main(String args[]){

		System.out.println(unique(3,3));
	}
}
