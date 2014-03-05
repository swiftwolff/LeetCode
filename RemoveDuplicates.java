
public class RemoveDuplicates {
	public static int removeDuplicates(int[] A) {

        
		 if (A.length<=1){
	            return A.length;
	        }
	        
	        int i = 1;
	        int j = 1;
	        
	        while(j<A.length){
	            if(A[j]>A[i-1]){
	                A[i] = A[j];
	                i++;
	                j = i;
	            }else{
	                j++;
	            }
	        }
	        
	        return i;

        
    }

    public static void main(String args[]){
    	int[] A = {1,2};
    	System.out.println(RemoveDuplicates.removeDuplicates(A));
    	for(int i:A){
    		System.out.println(i);
    	}
    }
}
