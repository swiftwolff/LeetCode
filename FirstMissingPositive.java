import java.util.Arrays;

public class FirstMissingPositive {
	
	public int firstMissingPositive(int[] A) {
		if (A==null||A.length==0) return 1;
		int i = 0;
		while(i<A.length){
			if(A[i]>0 && A[i]<A.length-1 && A[i]!= i && A[A[i]]!=A[i]){
				swap(A,i,A[i]);
			}else{
				i++;
			}
		}
		
		for(int j=1;j<A.length;j++){
			if(A[j]!=j){
				return j;
			}
		}
		if (A[0]==A.length) return A.length+1;
        
        else {
            return A.length;
        }

  }
	public void swap(int[] A, int a, int b){
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
	}
	
	
	public static void main(String args[]){
		int[] A = {2,1};
		FirstMissingPositive solution = new FirstMissingPositive();
		System.out.println(solution.firstMissingPositive(A));
	}
}
