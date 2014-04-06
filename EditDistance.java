
public class EditDistance {
	
	public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        if(n==0||m==0){
            return n==0?m:n;
        }
        
        int[][] matrix = new int[m+1][n+1];
        //row
        for(int i=0;i<=m;i++){
            matrix[i][0] = i;
        }
        //column
        for(int j=0;j<=n;j++){
            matrix[0][j] = j;
        }
        
        for(int i=0;i<m;i++){
            char one = word1.charAt(i);
            for(int j=0;j<n;j++){
                char two = word2.charAt(j);
                if(one==two){
                    matrix[i+1][j+1] = matrix[i][j];
                }else{
                    int replace = matrix[i][j+1] + 1;
                    int insert = matrix[i][j] + 1;
                    int delete = matrix[i+1][j] + 1;
                    
                    int tmp = replace <= insert?replace:insert;
                    matrix[i+1][j+1] = tmp<=delete?tmp:insert;
                }
            }
        }
        return matrix[m][n];
    }
	public static void main(String args[]){
		System.out.println(minDistance("a","ab"));
	}
}
