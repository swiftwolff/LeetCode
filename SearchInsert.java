
public class SearchInsert {
	    public static int searchInsert(int[] A, int target) {
	        if (A.length==0) return 0;
	        return binarySearch(A,target,0,A.length-1);
	    }
	    
	    public static int binarySearch(int[] A, int target, int start, int end){
	        if (start >= end && A[start]!=target){

	        	if (A[start]>target) return start;
		        else return start + 1;
	        }
	        
	        int mid = (start + end) /2;
	        
	        if (A[mid]==target) return mid;
	        else if(A[mid]>target) return binarySearch(A,target,start, mid-1);
	        else return binarySearch(A,target,mid+1,end);
	        
	    }
	    
	    public static void main(String args[]){
	    	int[] A = {1,3,5,7,9};
	    	System.out.println(SearchInsert.searchInsert(A, 6));
	    }
	    
}
