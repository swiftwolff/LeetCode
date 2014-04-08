
public class RemoveDuplicatesfromSortedArrayII {
	
	public static int removeDuplicates(int[] A) {
	        
	        if (A.length<=2){
	            return A.length;
	        }
	        int prev = 1;
	        int cur = 2;
	        
	        while(cur <= A.length-1){
	            if(A[prev]==A[cur] && A[prev-1]==A[cur]){  //we need to check prev-1 too
	                cur++;
	            }else{
	                prev++;
	                A[prev] = A[cur];
	                cur++;
	            }
	        }
	        
	        return prev+1;
	        
	 }
	
	
	public static void main(String args[]){
		int[] A = {1,2,2};
		System.out.println(removeDuplicates(A));
		for(int i:A){
			System.out.println(i);
		}
	}
}
