import java.util.Arrays;


public class MaximumSubarray {
//	public int maxSubArray(int[] A) {
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for(int i=0;i<A.length;i++){
//            if(A[i]>max){
//                max = A[i];
//            }
//            if (sum+A[i]>max){
//                max = sum+A[i];
//                sum+=A[i];
//            }
//            else if(sum+A[i]>0){
//                sum+= A[i];
//            }
//            else{
//                sum = 0;
//            }
//        }
//        
//        return max;
//    }
	public static int maxSubarry(int[] arry){
	    
        if(arry.length==0) return 0;
        int max = Integer.MIN_VALUE;
        int[] maxSub = new int[arry.length];
        maxSub[0] = arry[0];
        
        for(int i=1; i<arry.length;i++){
            if(arry[i] + maxSub[i-1] > arry[i]){
                maxSub[i] = arry[i]+maxSub[i-1];
            }else{
                maxSub[i] = arry[i];
            }
            
            if(maxSub[i]> max) max = maxSub[i];
        }
        System.out.println(Arrays.toString(maxSub));
        return max;
    
    }
	public static void main(String args[]){
		int[] A= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubarry(A));
	}
}
