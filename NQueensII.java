
public class NQueensII {
	
	public static int totalNQueens(int n){
		if (n==0){
			return 0;
		}
		int[] loc= new int[n];
		
		return build(loc,0,n);
	}
	
	public static int build(int[] loc, int cur, int n){
		if(cur==n){
			return 1;
		}
		int sum = 0;
		for (int i=0;i<n;i++){
			loc[cur] = i;
			if (isValid(loc,cur)){
				sum += build(loc,cur+1,n);
			}
		}
		return sum;
	}
	
	public static boolean isValid(int[] loc, int cur){
		for(int i=0;i<cur;i++){
			if(loc[i]==loc[cur]||Math.abs(i-cur)==Math.abs(loc[i]-loc[cur])){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		System.out.println(totalNQueens(4));
	}
}
