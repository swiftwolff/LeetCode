
public class SearchRotatedSortedArrayII {
	
	public static boolean search(int[] A,int target){
		
		if(A.length==0){
			return false;
		}
		
		return searchHelper(A,0,A.length-1,target);
	}
	
	public static boolean searchHelper(int[] A, int start, int end, int target){
		
		if(start > end){
			return false;
		}
		int mid = (start+end)/2;
		
		if(A[mid]==target){
			return true;
		}
		
		if(A[mid]<A[start]){
			if(target>A[mid] && target<=A[end]){
				return searchHelper(A,mid+1,end,target);
			}else{
				return searchHelper(A,start,mid-1,target);
			}
		}else{
			if(target>A[start] && target<A[mid]){
				return searchHelper(A,start,mid-1,target);
			}else{
				return searchHelper(A,mid+1,end,target);
			}
		}

	}
	
	
	public static void main(String args[]){
		int[] A = {1};
		System.out.println(search(A,3));
	}
}
