
public class ElementsNotInArray {
	public static void repetitions(int A[], int n){
		for(int i=0;i<n;i++){
			A[A[i]%n] += n;
		}
		for(int i=0;i<n;i++){
			int freq = A[i]/n;
			int elem = i;
			System.out.printf(" element= %d freq = %d",elem,freq);
		}
	}
	public static void main(String args[]){
		int A[] = {2,2,2,3};
		repetitions(A,4);
	}
}
