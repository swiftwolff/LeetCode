import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SubsetsII {
	public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        res.add(tmp);
        if(num.length==0){
        	return res;
        }
        Arrays.sort(num);
        subsetsWithDupHelper(num, 0, 0, false, res);

        return res;
    }
    
    public static void subsetsWithDupHelper(int[] num, int cur, int prevPos, boolean dup, ArrayList<ArrayList<Integer>> res){
        if(cur > num.length-1){
            return;
        }
        int size = res.size();
        if(dup){
            for(int i=prevPos;i<size;i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>(res.get(i));
            tmp.add(num[cur]);
            Collections.sort(tmp);  
            res.add(tmp);
            }
        }else{
            for(int i=0;i<size;i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>(res.get(i));
            tmp.add(num[cur]);
            Collections.sort(tmp);  
            res.add(tmp);
        }
        }
        if(cur < num.length-1 && num[cur]==num[cur+1]){
            subsetsWithDupHelper(num,cur+1,size,true,res);
        }else{
            subsetsWithDupHelper(num,cur+1,size,false,res);
        }
        
    }
    public static void main(String args[]){
    	int[] A = {4,4,4,1,4};
    	System.out.println(subsetsWithDup(A));
    }
}
