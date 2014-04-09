
public class SearchInRotatedSortedArray {
	public static int search(int[] A, int target) {
        
        if (A.length==0){
            return -1;
        }
        return modBinarySearch(A,0,A.length-1,target);
    }
    
    public static int modBinarySearch(int[] A,int start, int end, int target){
        
        if(start > end){
            return -1;
        }
        
        int mid = (start + end) /2;
        if (A[mid]==target){
            return mid;
        }
        
        if(A[mid]>=A[start]){
            if(target<=A[mid]&&target>=A[start]){
                return modBinarySearch(A,start,mid-1,target);
            }else{
                return modBinarySearch(A,mid+1,end,target);
            }
        }else{
             if(target>=A[mid]&&target<=A[end]){
                return modBinarySearch(A,mid+1,end,target);
            }else{
                return modBinarySearch(A,start,mid-1,target);
            }
        }
    }
    
    public static void main(String args[]){
    	int[] A = {3,1};
    	System.out.println(search(A,1));
    	
    }
    
}
