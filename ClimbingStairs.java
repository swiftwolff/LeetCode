
public class ClimbingStairs {
	    public static int climbStairs(int n) {
	        if (n<0){
	            return 0;
	        }
	        
	        int[] table = new int[n+1];
	        return climb(n,table);
	    }
	    
	    public static int climb(int n,int[] table){
	        
	        if (table[n]!=0){
	            return table[n];
	        }
	        
	        if (n<0){
	            return 0;
	        }
	        if (n == 0){
	            return 1;
	        }
	        
	        if (n == 1){
	            return 1;
	        }
	        
	        table[n] = climbStairs(n-1)+climbStairs(n-2);
	        
	        return table[n];
	    }
	    public static void main(String args[]){
	    	System.out.println(ClimbingStairs.climbStairs(4));
	    }
	
}
