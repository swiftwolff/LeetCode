
public class SearchInSortedRowAndColMatrix {
	public static boolean SearchMatrix(int[][] matrix, int target){
        if(matrix.length==0 || matrix[0].length==0) return false;
        int[] row = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
        	row[i] = matrix[i][0];
        }
        int rowIndex = bSearchIndex(row,0,row.length-1,target);
        if(rowIndex<0) return false;
        int[] col = new int[matrix[0].length];
        for(int j=0;j<matrix[0].length;j++){
        	col[j] = matrix[rowIndex][j];
        }
        
        int result = bSearchIndexNormal(col,0,col.length-1,target);
    
        if(result<0){
        	return false;
        }
        return true;
    }
	
	public static int bSearchIndexNormal(int[] arry, int start, int end, int target){
	    
        while(start <= end){
            int mid = (start + end)/2;
            if(arry[mid] == target) return mid;
            
            if(arry[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return -1;
        
    }
	
    public static int bSearchIndex(int[] arry, int start, int end, int target){
    
        while(start <= end){
            int mid = (start + end)/2;
            if(arry[mid] == target) return mid;
            
            if(arry[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return end;
        
    }
    
    public static void main(String args[]){
    	int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    	System.out.println(SearchMatrix(matrix,14));
    }
}
