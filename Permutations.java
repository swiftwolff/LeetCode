import java.util.ArrayList;

public class Permutations{
	
	public static ArrayList<ArrayList<Integer>> permute(int[] A){
		
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		outergenerate(all,A,0);
		
		return all ;
	}
	
	public static void generate(ArrayList<ArrayList<Integer>> all, int[] A, int start){
		
		if (all.contains(convert(A))){
			return;
		}
		all.add(convert(A));
		for(int i=start+1;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				swap(A,i,j);
				generate(all,A,start+1);
				swap(A,i,j);
			}
		}
		
		return;
	}
	
	public static void outergenerate(ArrayList<ArrayList<Integer>> all, int[] A, int start){
		int i =0;
		for (int j=0;j<A.length;j++){
			swap(A,i,j);
			generate(all,A,start);
			swap(A,i,j);
		}
		
		
	}
	
	public static void swap(int[] A,int i,int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		return;
	}
	
	public static ArrayList<Integer> convert(int[] A){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i=0; i<A.length;i++){
			res.add(A[i]);
		}
		return res;
	}
	

	public static void main(String args[]){
		int[] A = {1,2,3,4,5};
		System.out.println(Permutations.permute(A));
		
	}
}