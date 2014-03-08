import java.util.ArrayList;

public class Permutations{
	
	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		if (num.length==0||num.length==1){
			return all;
		}
		
		if (num.length==1){
			all.add(saveToArray(num));
			return all;
		}
		
		build(num,0,num.length,all);
		return all;
    }
	
	public static void build(int[] num, int k, int n,ArrayList<ArrayList<Integer>> all){
		if (k==n){
			all.add(saveToArray(num));
		}
		
		for (int i=k;i<n;i++){
			swap(num,i,k);
			build(num,k+1,n,all);
			swap(num,i,k);
		}
		
	}
	
	public static void swap(int[] A,int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static ArrayList<Integer> saveToArray(int[] num){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i=0;i<num.length;i++){
			res.add(num[i]);
		}
		return res;
	}

	public static void main(String args[]){
		int[] A = {1,2,3,4};
//		permute(A);
		System.out.println(permute(A).size());
		
	}
}