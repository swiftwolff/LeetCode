
public class MinimumPathSum {
	
	public static int minPathSum(int[][] grid) {
		
		if (grid.length==0||grid[0].length==0){
			return 0;
		}
		
		int[][] sumgrid = new int[grid.length][grid[0].length];
		int j = 0;
		sumgrid[0][0] = grid[0][0];
		//horizontal
		for (int i=1;i<grid[0].length;i++){
			sumgrid[j][i] = grid[j][i]+sumgrid[j][i-1];
		}
		//vertical
		for (int k=1;k<grid.length;k++){
			sumgrid[k][j] = grid[k][j]+sumgrid[k-1][j];
		}
		
		if(grid.length==1||grid[0].length==1){
			return sumgrid[grid.length-1][grid[0].length-1];
		}
		int x = 1;
		int y = 1;

		while(x<grid[0].length && y<grid.length){
			sumgrid[y][x] = grid[y][x]+Math.min(grid[y-1][x], grid[y][x-1]);
			if(x+1==grid[0].length){
				y++;
				x--;
			}else{
				x++;
			}
		}
		return sumgrid[grid.length-1][grid[0].length-1];
    }
	
	public static void main(String args[]){
		int[][] grid = {{8},{9},{10}};
		System.out.println(minPathSum(grid));
	}
}
