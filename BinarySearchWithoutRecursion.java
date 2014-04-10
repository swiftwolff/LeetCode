
public class BinarySearchWithoutRecursion {
	
	public static int binarySearch(int[] A, int target){
		int start = 0;
		int end = A.length-1;
		int mid = (start + end) /2 ;
		
		while (start <= end){
			mid = (start+end)/2;
			
			if (A[mid]==target){
				return mid;
			}
			if(A[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		int[] A = {1,2,3,4,5};
		System.out.println(binarySearch(A,6));
	}
}
