import java.util.Arrays;


public class TrappingRainWater {
	public int trap(int[] A) {
        //corner case
        if(A.length==0){
            return 0;
        }
        //find out the max state from left to right
        int[] left = new int[A.length];
        //max state from right to left
        int[] right = new int[A.length];

        left[0] = A[0];
        for(int i=1;i<A.length;i++){
            left[i] = Math.max(left[i-1],A[i]);
        }
        right[A.length-1] = A[A.length-1];
        for(int i=A.length-2;i>-1;i--){
            right[i] = Math.max(right[i+1],A[i]);
        }
        int sum = 0;
        for(int i=1;i<A.length-1;i++){
            sum+= Math.min(left[i],right[i])-A[i];
        }
        return sum;
    }
	public static void main(String args[]){
		int[] A = {2,1,0,2};
		TrappingRainWater solution = new TrappingRainWater();
		System.out.println(solution.trap(A));
	}
  
}
