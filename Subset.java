import java.util.ArrayList;
import java.util.Arrays;


public class Subset {
	
	public static ArrayList<ArrayList<Integer>> subsets(int[] S){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> item = new ArrayList<Integer>();
		res.add(item);
		if(S.length==0){
			return res;
		}
		Arrays.sort(S);
		subsetsHelper(S,0,1,res);
		return res;
	}
	
	public static void subsetsHelper(int[] S, int cur, int stop,ArrayList<ArrayList<Integer>> res){
		if(cur>S.length-1){
			return;
		}
		
		for(int i=0;i<stop;i++){
			ArrayList<Integer> tmp = new ArrayList<Integer>(res.get(i));
			tmp.add(S[cur]);
			res.add(tmp);
		}
		
		subsetsHelper(S,cur+1,res.size(),res);
		
	}
	
	public static void main(String args[]){
		int[] S = {4,1,0};
		System.out.println(subsets(S));
	}
}
