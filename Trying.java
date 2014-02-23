
public class Trying {
	
	    public static int singleNumber(int[] A) {
	    	
	        if (A.length==0||A.length==1){
	            try{
	            	return A[0];
	            }catch(Exception e){
	            	
	            	return 0;
	        }
	        }
	          
	        int res = A[0];
	        for (int i=1;i<A.length;i++){
	            res = res ^ A[i];
	        }
	        
	        return res;
	        
	}
	    
	public static void main(String args[]){
		int[] A = {};
		
		System.out.println(Trying.singleNumber(A));
		
	}
}
