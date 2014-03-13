
public class Search2DMatrix {
public static boolean searchMatrix(int[][] matrix, int target) {
        
        //corner cases
        int row = matrix.length;
        int column = matrix[0].length;
        int level[] = new int[row];
        int location = 0;

        for (int i=0;i<row;i++){
            level[i] = matrix[i][column-1];
        }

        location = bsearchIndex(level,0,level.length-1,target);
        System.out.println(location);

        return bsearch(matrix[location],0,column-1,target);
        
        
    }
    
    public static int bsearchIndex(int[] A, int start, int end, int target){
    	System.out.println("start "+start);
    	System.out.println("end "+end);
        if (start > end){
            if (end < 0){
                return start;
            }
            if (start > A.length-1){
                return end;
            }
            if (A[end]>target){
                return end-1;
            }
            
            return end+1;
        }
        int mid = (start+end)/2;
        if (A[mid]==target){
            return mid;
        }
        else if(target < A[mid]){
            return bsearchIndex(A,start,mid-1,target);
        }
        return bsearchIndex(A,mid+1,end,target);
    }
    public static boolean bsearch(int[] A, int start, int end, int target){
        if (start > end){
            return false;
        }
        int mid = (start+end)/2;
        if (A[mid]==target){
            return true;
        }
        else if(target < A[mid]){
            return bsearch(A,start,mid-1,target);
        }
        return bsearch(A,mid+1,end,target);
    }
    
    public static void main(String args[]){
    	int[][] A = {{1,1}};
    	int[] B = {1};
    	System.out.println(searchMatrix(A, 2));
    }
}
