
public class JumpGameII {
	
	
//	public static int jump(int[] A){
//		if(A.length<=1){
//			return 0;
//		}
//		return jumpHelper(A,0,A.length-1,0);
//	}
//	
//	public static int jumpHelper(int[] A, int cur, int end,int count){
//		count++;
//		if(A[cur]==0){
//			return Integer.MAX_VALUE;
//		}
//		if(A[cur]>=end){
//			return count;
//		}	
//		int min = Integer.MAX_VALUE;
//		int start = 0;
//		for(int i=cur+1;i<A[cur];i++){		
//			start = Math.min(min, jumpHelper(A,i,end-i,count));		
//		}
//		return start;
//	}
	
	public static int jump(int[] A) {  //With this solution , you always jump to the farthest (find the max in the array)
        if (A==null||A.length==0){
            return -1;
        }
        
        if (A.length==1){
            return 0;
        }
        
        int minStep=0;
        
        int start=0;
        // current longest distance the jump can reach
        int end=A[start];
        
        // if current longest distance plus current postion passed the length of array
        // then return current minStep + 1;
        if (start+end>=A.length-1){
            return minStep+1;
        }
        
        while(end<A.length-1){
            minStep++;
            
            // record farest position can be reached by jump from position within current farest position
            int max=0;
            
            for (int i=start; i<=end; i++){
                int current=i+A[i];
                // pass the total length, return minStep+1, 
                
                if (current>=A.length-1){
                    return minStep+1;
                }
                
                max=Math.max(max, current);
            }
            // update start position(items in array are not negative, so end+1 is exist)
            start=end+1;
            // update the most far position can reached for next jump
            end=max;
        }
 
        return minStep;
    }
	
	public static void main(String args[]){
		int[] A = {2,3,1,1,4};
		System.out.println(jump(A));
	}
}
