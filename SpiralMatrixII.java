public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n<0) return null;
        
        int[][] res = new int[n][n];
        
        int start=1, x=0, y=0;
        for(int i=n;i>0;i-=2){
            if(i==1){
                res[x][y]=start;
            }else{
                for(int j=0;j<i-1;j++){
                    res[x][y++]=start++;   
                }
                for(int j=0;j<i-1;j++){
                    res[x++][y]=start++;
                }
                for(int j=0;j<i-1;j++){
                    res[x][y--]=start++;
                }
                for(int j=0;j<i-1;j++){
                    res[x--][y]=start++;
                }
                x++;
                y++;
            }
        }
        return res;
    }
	public static void main(String args[]){
		int[][] a = generateMatrix(3);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.println(a[i][j]);
			}
		}
	}
}
