
public class ClimbLadder {

	    public static int climbStairs(int n) {
	        int[] store = new int[n+1];
	        
	        return combination(n,store);
	    }
	    
	    public static int combination(int n,int[] store){
	        
	        if (n < 0){
	            return 0;
	        }
	        if (n==0){
	            return 1;
	        }
	        if (store[n]!=0){
	            return store[n];
	        }else{
	            store[n] = combination(n-1,store) + combination(n-2,store);
	        }
	        return store[n];
	    }
	    
	    public static void main(String args[]){
	    	int n = 3;
	    	System.out.println(ClimbLadder.climbStairs(n));
	    }
}
