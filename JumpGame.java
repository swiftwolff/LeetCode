
public class JumpGame {
	
	public static boolean canJump(int[] A) {
		if(A.length==0){
            return false;
        }
		if(A.length==1){
			return true;
		}
        int indexLen = A.length-1;
        System.out.println(indexLen);
        int cur = 0;
        while(cur < indexLen){
            cur+=A[cur];
            if(cur>indexLen){
                return true;
            }
            if(A[cur]==0 && cur!=indexLen){
                return false;
            }
            if(cur==indexLen){
                return true;
            }
        }       
        return false;   
	}
	
	public static void main(String args[]){
		int[]A = {2,0};
		System.out.println(canJump(A));
	}
}
