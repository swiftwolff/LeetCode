import java.util.ArrayList;

public class Permutations{
	
	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (num.length==0){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            res.add(tmp);
            return res;
        }
        if (num.length==1){
            res.add(arryToLst(num));
            return res;
        }
        build(num,0,num.length,res);
        return res;
    }
    
    public static void build(int[] num, int k, int n, ArrayList<ArrayList<Integer>> res){
        if (k==n){
            res.add(arryToLst(num));
        }
        
        for (int i=k;i<num.length;i++){
            swap(num,i,k);
            build(num,k+1,n,res);
            swap(num,i,k);
        }
        
    }
    
    public static void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    
    public static ArrayList<Integer> arryToLst(int[] num){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i=0;i<num.length;i++){
            res.add(num[i]);
        }
        return res;
    }

	public static void main(String args[]){
		int[] A = {1,2,3};
//		permute(A);
		System.out.println(permute(A));
		
	}
}