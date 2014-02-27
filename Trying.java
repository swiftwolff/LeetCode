import java.util.Queue;
import java.util.LinkedList;
public class Trying {
	
		
		public static int numTreesFinal(int n){
			
			return 0;
		}
	
	
	
	    public static int numTrees(int n) {
	        if (n==0||n==1){
	            return 1;
	        }
	        
	        if (n==2){
	            return 2;
	        }
	        
	        int left = 0;
	        int right =0;
	        int sum = 0;
	        
	        for(int i=1;i<=n;i++){
	            left = numTrees(i-1);
	            System.out.println("left: "+left);
	            right = numTrees(n-i);
	            System.out.println("right: "+right);
	            sum += left*right;
	            System.out.println("sum: "+sum);
	        }
	        
	        return sum;
	        
	        
	    }

	    
	public static void main(String args[]){
//		int[] A = {};
//		
//		System.out.println(Trying.singleNumber(A));
		System.out.println(Trying.numTrees(4));
	}
}
