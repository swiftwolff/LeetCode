
public class MinimumPathSum {
	
	public static int minPathSum(int[][] grid) {
		if(grid.length==0||grid[0].length==0){
			return 0;
		}		
		int x = grid[0].length;
		int y = grid.length;	
		int i = 0;
		int j = 0;
		int sum = 0;
		while(i<x&&j<y){
			sum+= grid[j][i];
			if(i==x-1){
				j++;
				continue;
			}
			if(j==y-1){
				i++;
				continue;
			}
			if(less(grid,j+1,i,j,i+1)){
				j++;
			}else if(grid[j+1][i]==grid[j][i+1]){
				continue;
			}else{
				i++;
			}
		}
        return sum;
    }
	
	public static boolean less(int[][] grid, int i, int j,int itwo,int jtwo){
		if(grid[i][j]>grid[itwo][jtwo]){
			return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		int[][] grid = {{2,1,6},{8,4,9}};
		System.out.println(minPathSum(grid));
	}
}
