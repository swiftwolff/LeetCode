import java.util.ArrayList;
import java.util.List;

class SpiralMatrix{
//	public static List<Integer> spiralOrder(int[][] matrix){
//		
//		ArrayList<Integer> res = new ArrayList<Integer>();
//		if(matrix==null||matrix.length==0||matrix[0].length==0){
//			return res;
//		}
//
//		int rlen = matrix.length;
//		int clen = matrix[0].length;
//		
//		if(rlen==1){
//			for(int i=0;i<clen;i++){
//				res.add(matrix[0][i]);
//			}
//			return res;
//		}
//		if(clen==1){
//			for(int i=0;i<rlen;i++){
//				res.add(matrix[i][0]);
//			}
//			return res;
//		}
//		
//		int loop = (int) Math.ceil((double)Math.min(rlen, clen)/2);
//		for(int i=0;i<loop;i++){
//			for(int t=i;t<clen-i;t++){
//				res.add(matrix[i][t]);
//				System.out.println("1:" + matrix[i][t]);
//			}
//			
//			for(int r=i+1;r<rlen-i;r++){
//				res.add(matrix[r][clen-i-1]);
//				System.out.println("2:" + matrix[r][clen-i-1]);
//			}
//			
//			for(int b=clen-i-1-1;b>=i;b--){
//				res.add(matrix[rlen-i-1][b]);
//				System.out.println("3:" + matrix[rlen-i-1][b]);
//			}
//
//			for(int l=rlen-i-1-1;l>i;l--){
//				res.add(matrix[l][i]);
//				System.out.println("4:" + matrix[l][i]);
//			}
//
//		}		
//
//		return res;
//	}
	
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(matrix == null || matrix.length == 0) return result;
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            //if one row/column left, no circle can be formed
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix[x++][y]);
                }
                break;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
 
            //right - move down
            for(int i=0;i<m-1;i++){
                result.add(matrix[x++][y]);
            }
 
            //bottom - move left
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
 
            //left - move up
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return result;
    }
	public static void main(String args[]){
//		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
//		int[][] matrix = {{1},{2},{3}};
		int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(spiralOrder(matrix));
	}
}
