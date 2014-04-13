
public class UniquePathII {
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid){
		
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		int [][] cnt = new int[m][n];
		if(obstacleGrid[0][0]==1){
			cnt[0][0] = 0;  //set the block to 0
		}else{
			cnt[0][0] = 1;
		}
		
		if(obstacleGrid[m-1][n-1]==1){  //if the last step is blocked, no path through
			return 0;
		}
		
		for(int i=1;i<m;i++){  //going down
			if(obstacleGrid[i][0]!=1&&cnt[i-1][0]!=0){ //cnt[i-1][0] means there is a block before
				cnt[i][0] = 1;
			}
		}
		
		
		for(int i=1;i<n;i++){  //going right
			if(obstacleGrid[0][i]!=1&&cnt[0][i-1]!=0){  //cnt[0][i-1] means there is a block before
				cnt[0][i] = 1;
			}
		}
		
		//start at 1, 1
		for(int i=1;i<m;i++){//row
			for(int j=1;j<n;j++){  //column
				if(obstacleGrid[i-1][j]!=1){  //if current is not a block, add prev
					cnt[i][j]+=cnt[i-1][j];
				}
				if(obstacleGrid[i][j-1]!=1){  //if current is not a block, add prev
					cnt[i][j] += cnt[i][j-1];
				}
			}
		}
		
		return cnt[m-1][n-1];
	}
	
	public static void main(String args[]){
		int[][] testcase ={{0,0,0},{0,1,0},{0,0,0}};

		System.out.println(uniquePathsWithObstacles(testcase));
	}
}
