
public class MaxNum {
	public static int maxSubArray(int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            maxSum = Math.max(maxSum, sum);
            // re-set sum when < 0 (no need to keep neg value)
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
	        
	
	public static void main(String args[]){
		int[] A = {-1,1};
		System.out.println(MaxNum.maxSubArray(A));
	}
}
