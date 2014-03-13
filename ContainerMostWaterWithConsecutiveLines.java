
public class ContainerMostWaterWithConsecutiveLines {
	public  static  int maxArea( int [] height){
        int curHeight = Integer.MAX_VALUE;
        int area = Integer.MIN_VALUE;
        int x = 0;
        for(int i=0;i<height.length;i++){
        	if(height[i]==0){
        		curHeight = Math.max(curHeight, height[i]);
        		x = Math.min(x, i);
        		continue;
        	}
        	curHeight = Math.min(curHeight,height[i]);
        	area = Math.max(area, (i-x)*curHeight);
        	x = i;
        	curHeight = height[i];
        }
        return area;
    }
	public static void main(String args[]){
		int[] A = {1,3,0,0,5};
		System.out.println(maxArea(A));
	}
}
