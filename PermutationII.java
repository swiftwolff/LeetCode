import java.util.ArrayList;
import java.util.HashSet;


public class PermutationII {
	
	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> store = new ArrayList<Integer>();
		if(num.length==0){
			res.add(store);
			return res;
		}
		for(int i:num){
			store.add(i);
		}
		HashSet<ArrayList<Integer>> table = new HashSet<ArrayList<Integer>>();	
		permuteUniqueHelper(0,store,table,res);
		return res;
	}
	
	public static void permuteUniqueHelper(int cur, ArrayList<Integer> store, HashSet<ArrayList<Integer>> table, ArrayList<ArrayList<Integer>> res){
		
		if(cur>=store.size()-1){
			ArrayList<Integer> tmp = new ArrayList<Integer>(store);
			res.add(tmp);
			table.add(tmp);
			return;
		}
		ArrayList<Integer> tmp = new ArrayList<Integer>(store);
			for(int i=cur;i<store.size();i++){
				swap(tmp,i,cur);
				if(!table.contains(tmp)){
					permuteUniqueHelper(cur+1,tmp,table,res);
				}
				swap(tmp,i,cur);
			}
	}
	
	public static void swap(ArrayList<Integer>num, int a, int b){
		int tmp = num.get(a);
		num.set(a, num.get(b));
		num.set(b, tmp);
	}
	
	
	public static void main(String args[]){
		int[] num = {1,2,3};
		System.out.println(permuteUnique(num));
	}
}
