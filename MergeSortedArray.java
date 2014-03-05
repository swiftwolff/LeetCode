
public class MergeSortedArray {
	public static void merge(int A[], int m, int B[], int n) {
		if (m==0){
            for(int i=0;i<B.length;i++){
                A[i] = B[i];
            }
        }
        int lastA = m-1;
        int lastB = n-1;
        int last = m+n-1;
        
        while(last>=0&&lastB>=0){
            if(lastA<0){
                A[last] = B[lastB];
                lastB--;
                last--;
                continue;
            }
            
            if(A[lastA]<=B[lastB]){
                A[last] = B[lastB];
                lastB--;
                last--;
            }else{
                A[last] = A[lastA];
                lastA--;
                last--;
            }
        }
	}
    
    public static void main(String args[]){
    	int[] a = {2,0};
    	int[] b = {1};
    	
    	merge(a, 1, b, 1);

    	for(int i:a){
    		System.out.println(i);
    	}
    }
    
}
