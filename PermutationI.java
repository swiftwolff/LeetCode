import java.util.ArrayList;

public class PermutationI {
	    public static ArrayList<ArrayList<Integer>> permute(int[] num) {

	        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();  //initalize arraylist to save
	        ArrayList<Integer> tmp = new ArrayList<Integer>();  //initialize arraylist for number holding
	        int n = num.length;
	        boolean[] visited = new boolean[n];  //created a visited table
	        
	        permuteImp(res, tmp, num, visited);
	        
	        return res;
	    }
	    private static void permuteImp(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int[] num, boolean[] visited){
	        if(tmp.size() == num.length){  //check tmp size equals to given array
	            res.add(new ArrayList<Integer>(tmp));  //create arraylist from int[]?
	            return;
	        }
	        for(int i=0; i<num.length; i++){ //iterate int[] num array
	            if(!visited[i]){
	                tmp.add(num[i]);
	                visited[i] = true;
	                permuteImp(res, tmp, num, visited);
	                visited[i] = false;
	                tmp.remove(tmp.size()-1);
	            }
	        }
	    }
	    
	    public static void main(String args[]){
	    	int[] A = {1,2,3};
	    	System.out.println(PermutationI.permute(A));
	    }

}
