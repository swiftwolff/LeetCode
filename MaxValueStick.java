import java.util.ArrayList;
public class MaxValueStick {
	public static int[] MaxValcut(int[] given){//Bottom up (Iterative)
		ArrayList<Integer> res = new ArrayList<Integer>();
		int[] DP=new int[given.length+1];
		int i,j;
		DP[0] = 0;
		for (i=1;i<given.length;i++){ //i is the length of rod going 1 by 1
			DP[i] = 0;
			for(j=1;j<=i;j++){ //j is the ways of cutting it
				if(DP[i-j]+given[j]>DP[i]){
					DP[i] = DP[i-j] + given[j];
				}
			}
		}
		return DP;
	}
	
	public static int[] MaxValcutTopDown(int[] given){
		int[] DP = new int[given.length+1];
		for(int i=1;i<given.length;i++){
			DP[i] = -1;
		}
		
		return given;
	}
	
	public static int[] MaxValcutTopDownHelper(int[] given){
		
		return given;
	}
	
	public static void main(String args[]){
		int[] given = {0,1,5,8,9,10,17,17,20,24,30};
		
	}
}
