
public class PrintSquareDiagonally {
	
	public static void printMatrixDiagClean(int[][] matrix){
	    
        if(matrix.length==0||matrix[0].length==0) return;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int a=0;
        int b=0;
        //first half includes middle
        for(int i=0;i<=m;i++){
            b = 0;
            for(int j=i;j>=0&&b<=n;j--){
                
                System.out.print(" ");
//                System.out.println("i is "+i);
//                System.out.println("j is "+j);
//                System.out.println("b is "+b);
                System.out.print(matrix[j][b]);
                System.out.print(" ");
                b++;
            }
            System.out.println();
        }
        //bottom half without middle
        
        for(int i=1;i<=n;i++){
        	a = m; // row will always be like this
            b=i;
            for(int j=i;j<=n;j++){
                System.out.print(" ");
                System.out.print(matrix[a][b]);
                System.out.print(" ");
                a--;
                b++;
            }
            System.out.println();
        }
    
    return;
    }
	//opposite side
	public static void printMatrixDiag(int[][] matrix){
	    
        if(matrix.length==0 && matrix[0].length==0) return;
        //first half of the triangle
        int a;
        for(int i=0;i<matrix.length && i<matrix[0].length;i++){
            a=i;
            for(int j=0;j<=i;j++){
//              System.out.println("j is "+j);
//              System.out.println("a is "+a);
              System.out.print(matrix[j][a] + " "); 
              a--;
            }
            System.out.println();
        }
    
        //second half without the mid line
        int b;
        for(int i=1;i<Math.max(matrix[0].length,matrix.length);i++){
            b=i;
            for(int j=matrix[0].length-1;j>-1;j--){
                System.out.print(matrix[b][j]+ " ");
                b++;
                if(b>matrix.length-1) break;
            }
            System.out.println();
        }
        return;
    }

	public static void main(String[] args) {
		int [][] ipArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
		printMatrixDiag(ipArray);

	}
}
