import java.util.Arrays;


public class SingleNumber {
	public static int singleNumber(int[] A) {
	       if (A.length==1){
	           return A[0];
	       }
	       Arrays.sort(A);
	       for(int i=0;i<A.length-1;i+=2){
	    	      	  
	           if (A[i]-A[i+1]!=0){
	               return A[i];
	           }     
	           if (i+2 == A.length-1){
	    		   System.out.print("I am here!");
	        	   System.out.println();
	    		   return A[A.length-1];
	    	   }
	       }
	       return -1;
	    }
	    
	    public static void main(String args[]){
	    	int[] A = {2,2,1};
	    	System.out.print(SingleNumber.singleNumber(A));
	    }
}
