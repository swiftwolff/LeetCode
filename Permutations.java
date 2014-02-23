import java.util.ArrayList;
public class Permutations {
	
	public static ArrayList<ArrayList<Integer>> perm(int[] A){
		ArrayList<ArrayList<Integer>> permutations = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> first = new ArrayList<Integer>();
		for (int i=0;i<A.length;i++){
			first.add(A[i]);
		}
		
		int i = 0;
		for (int j =0;j<A.length;j++){
			ArrayList<Integer> temp = (ArrayList<Integer>)first.clone();
			temp = swap(temp, i, j);
			System.out.println(temp);
			generatePerm(permutations, temp,1);
		}
		
		return permutations;
	}
	
	public static void generatePerm(ArrayList<ArrayList<Integer>> permutations, ArrayList<Integer> A, int start){
		
		if (start==A.size()-1){
			return;
		}

		for(int i=start;i<A.size();i++){
			for(int j=i+1; j<A.size();j++){
//				System.out.println("i is " + i);
//				System.out.println("j is " + j);
				ArrayList<Integer> temp = (ArrayList<Integer>) A.clone();
				temp = swap(temp,i,j); //this will change our reference b/c it is swapped....
				System.out.println(temp);
				permutations.add(temp);
				
				generatePerm(permutations,temp,start+1);
			}
			
		}
		return;
	}
	
	
	public static ArrayList<Integer> swap(ArrayList<Integer> A, int i, int j){
		
		int tmp = A.get(i);
		A.set(i,A.get(j));
		A.set(j,tmp);
		return A;
	}
	
	public static void main(String args[]){
		int[] A= {1,2,3,4};
		
		System.out.print(Permutations.perm(A));
	}
}
