
public class DistinctSubsequence {
	public int numDistinct(String S, String T) {
        if(S.length()==0||T.length()==0) return 0;
        
        int[][] DP = new int[T.length()+1][S.length()+1];
        
        for(int i=0;i<DP.length;i++){
            DP[i][0] = 0;
        }
        
        for(int j=0;j<DP[0].length;j++){
            DP[0][j] = 1;
        }
        
        for(int i=1;i<DP.length;i++){
            for(int j=1;j<DP[0].length;j++){
                if(T.charAt(i-1)==S.charAt(j-1)){
                    DP[i][j] = DP[i][j-1] + DP[i-1][j-1];
                }else{
                    DP[i][j] = DP[i][j-1];
                }
            }
        }
        
        return DP[T.length()][S.length()];
    }
	
	public static void main(String args[]){
		String S ="eee";
		String T ="eee";
		DistinctSubsequence solution = new DistinctSubsequence();
		System.out.println(solution.numDistinct(S, T));
		String a = "abc";
		if(a.substring(3,3).length()==0) System.out.println("Yes");
//		System.out.println(a.substring(3,3));
	}
}
