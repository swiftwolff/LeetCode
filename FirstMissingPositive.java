import java.util.HashMap;


public class FirstMissingPositive {
	
	public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A==null||A.length==0) return 1;
        int i=0; 
        while (i<A.length){
        	
        	// Strongly be care of that beside check A[i]!=i, also check A[A[i]]!=A[i]
        	// in case [1,1], if only check A[i]=i, there will be infinity loop
        	
            if (A[i]>=0 &&A[i]<A.length&&A[i]!=i&&A[A[i]]!=A[i]){
            	
                // must assign A[A[i]] to temp instead of A[i] to temp or will infinity loop
                // int temp=A[i];
                // A[i]=A[A[i]];
                //A[A[i]]=temp;
                // see A[i] in A[A[i]] and A[i] has been changed 
                // so temp will never been sign to the place you want
                
                int temp=A[A[i]];
                A[A[i]]=A[i];
                A[i]=temp;
                
            }
            else{
                i++;
            }
            
        }
        
        for (int j=1; j<A.length; j++){
            if (A[j]!=j) return j;
        }
        
         // after above for loop mean for each position the value is equal to its index
            // then if A[0]==A.length mean the missing position should be A.length+1
            // the missing position is A.length;
        if (A[0]==A.length) return A.length+1;
        
        else {
            return A.length;
        }
        
        
  }
	
	
	public static void main(String args[]){
		int[] A = {4,2,5,1,1,5};
		FirstMissingPositive solution = new FirstMissingPositive();
		System.out.println(solution.firstMissingPositive(A));
	}
}
