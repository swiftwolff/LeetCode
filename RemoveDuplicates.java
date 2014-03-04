
public class RemoveDuplicates {
	public static int removeDuplicates(int[] A) {

        
        if (A.length<=1){
            return A.length;
        }
        
        int j = 0;
        int k = 0;
        
        for (int i =0;i<A.length;i++){
            j = i + 1;
            k = j;
            if (j==A.length){
            	return i+1;
            }
            if (A[i]>A[j]){
                j = i;
                break;
            }
            
            while(j < A.length && A[i]==A[j]){
                j++;
            }
            
            if (j==A.length){
                return i+1;
            }
            
            while(j<A.length){
                swap(A,k,j);
                j++;
                k++;
            }
        }
        
        return j+1;

        
    }
    
    public static void swap(int[]A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public static void main(String args[]){
    	int[] A = {1,2};
    	System.out.println(RemoveDuplicates.removeDuplicates(A));
    	for(int i:A){
    		System.out.println(i);
    	}
    }
}
