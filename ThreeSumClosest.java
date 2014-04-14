import java.util.Arrays;


public class ThreeSumClosest {
	
	public static int threeSumClosest(int[] num, int target) {
		if(num.length==0){
			return 0;
		}
		
		if(num.length<3){
			int closest = 0;
			for(int i=0;i<num.length;i++){
				closest+=num[i];
			}
			return closest;
		}
		
        Arrays.sort(num);
        int start;
        int end;
        int closest = num[0]+num[1]+num[2];//cannot do Integer.MAX_VALUE b/c it will over flow
        
        for(int i=0;i<num.length-2;i++){
            start = i+1;
            end = num.length-1;
            while(start < end){
                int sum = num[i]+num[start]+num[end];
//                System.out.println(sum);
                if(sum==target){
                return sum;
                }
                if(Math.abs(target-sum)<Math.abs(closest-target)){
                	closest = sum;
                }
                
                if(sum<target){
                    start++;
                }else{
                    end--;
                }
            }
            
        }
        return closest;
    }
	
	public static void main(String args[]){
		int[] A = {-3,-2,-5,3,-4};
		System.out.println(threeSumClosest(A,-1));
//		System.out.println(Math.abs(Integer.MAX_VALUE + 1));
	}
}
