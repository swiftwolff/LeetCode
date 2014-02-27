
public class SearchInsertPosition {
	public static int searchInsert(int[] A, int target) {
        
        return bsearch(A,0,A.length-1,target);
        
    }
	
	public static int bsearch(int[] A, int start, int end, int target){
		
		if (start > end){
			if (target > A[start-1]){
				return start;
			}else{
				return end+1;
			}
		}
		int mid = (start + end) /2;

		if (target==A[mid]){
			return mid;
		}else if(target<A[mid]){
			return bsearch(A,start,mid-1,target);
		}else{	
			return bsearch(A,mid+1,end,target);
		}

	}
	public static void main(String args[]){
		int[] a = {1,4,8,9};
		System.out.println(SearchInsertPosition.searchInsert(a, 7));
	}
}
