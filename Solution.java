import java.util.Scanner;
public class Solution {
	public void answer(){
		System.out.println("Enter inputs belw:");
		
	    Scanner in = new Scanner(System.in);
	    int m = in.nextInt();
	    int n = in.nextInt();
	    
	    int[][] matrix = new int[m][n];
	    for(int i=0;i<m;i++){ //row
	    	for(int j=0;j<n;j++){ //col
	    		matrix[i][j] = in.nextInt();
	    	}
	    }
	    int[][] minTime = timeCal(matrix,m,n);
	    int employees = in.nextInt();
	    int[] answer = new int[employees];
	    for(int i=0;i<employees;i++){
	    	int employeesRow = in.nextInt();
	    	int employeesCol = in.nextInt();
	    	answer[i] = minTime[employeesRow][employeesCol];
	    }
	    
	    for(int i:answer){
	    	System.out.println(i);
	    }
	}
	
	public int[][] timeCal(int[][] matrix, int m, int n){
		
		for(int i=m-2;i>-1;i--){
			matrix[i][n-1] += matrix[i+1][n-1];
		}
		
		for(int j=n-2;j>-1;j--){
			matrix[m-1][j] += matrix[m-1][j+1];
		}
		
		for(int i=m-2;i>-1;i--){
			for(int j=n-2;j>-1;j--){
				matrix[i][j] += Math.min(matrix[i][j+1], matrix[i+1][j]); 
			}
		}
		
		return matrix;
	}
	
	public static void main(String args[]){
		Solution s = new Solution();
		s.answer();
	}
}
