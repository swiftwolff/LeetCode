
public class FindKthSmallest {
	
	public static int kthSmall(int[] A,int k,int start, int end){
		int j = partition(A,start,end);
		if(A[k]==A[j]){
			return A[k];
		}else if(A[k]<A[j]){
			return kthSmall(A,k,start,j-1);
		}else{
			return kthSmall(A,k,j+1,end);
		}
	}
	
	public static int partition(int[] A,int start,int end){
	
		int pivot = start;
		int i = start+1;
		int j = end;
		
		while(i<=j){
			if(lesseq(A,pivot,i)){
				if(lesseq(A,j,pivot)){
					swap(A,i,j);
				}
				j--;
			}
			i++;	
		}
		
		swap(A,pivot,j);
		return j;
	}
	
	public static void swap(int[] A,int i,int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static boolean lesseq(int[] A, int i,int j){
		if(A[i]>A[j])
			return false;
		return true;
	}
	
	public static void main(String args[]){
		int[] A={6,8,1,9,2};

		System.out.println(kthSmall(A,1,0,4));

	}
}
