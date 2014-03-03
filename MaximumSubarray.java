
public class MaximumSubarray {
	public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
            if (sum+A[i]>max){
                max = sum+A[i];
                sum+=A[i];
            }
            else if(sum+A[i]>0){
                sum+= A[i];
            }
            else{
                sum = 0;
            }
        }
        
        return max;
    }
}
