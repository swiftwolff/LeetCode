
public class MinimumPathSum {
	
	 public static int minPathSum(int[][] grid) {
	        if(grid.length==0||grid[0].length==0){
	            return -1;
	        }
	        
	        if(grid.length==1||grid[0].length==1){
	        	int sum = 0;
	        	if(grid[0].length==1){
	        		for(int i=0;i<grid.length;i++){
	        			sum+=grid[i][0];
	        		}
	        		return sum;
	        	}
	        	if(grid.length==1){
	        		for(int j=0;j<grid[0].length;j++){
	        			sum+=grid[0][j];
	        		}
	        		return sum;
	        	}
	        }
	        
	        for(int i=grid.length-2;i>-1;i--){
	        	grid[i][grid[0].length-1] += grid[i+1][grid[0].length-1];
	        }
	        
	        for(int j=grid[0].length-2;j>-1;j--){
	        	grid[grid.length-1][j] += grid[grid.length-1][j+1];
	        }
	         
	        for(int i=grid.length-2;i>-1;i--){
	            for(int j=grid[0].length-2;j>-1;j--){
	                grid[i][j] = grid[i][j] + Math.min(grid[i+1][j],grid[i][j+1]);
	            }
	        }
	        
	     return grid[0][0];   
	    }
	
	public static void main(String args[]){
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));
	}
}
