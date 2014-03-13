public class ContainerMostWater {
	public static int maxArea(int[] height){
		if (height.length<=1){
			return 0;
		}
       int start = 0;
       int end = height.length-1;
       int area = 0;
       int curHeight = Integer.MIN_VALUE;
       
       while (start < end){
    	   curHeight = Math.min(height[start], height[end]);
    	   area = Math.max(area, (end-start)*curHeight);
    	   
    	   if (height[start]<height[end]){
    		   start++;
    	   }else{
    		   end--;
    	   }   
       }
		return area;
		
	}
	public static void main(String args[]){
		int[] A = {1,3,100,100,5};
		System.out.println(maxArea(A));

	}
}
