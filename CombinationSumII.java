import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CombinationSumII {
	public static ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if (num==null||num.length==0){
            return result;
        }      
        ArrayList<Integer> current=new ArrayList<Integer>();  
        int start=0; 
        Arrays.sort(num);   
        buildResult(num,start, target, current, result);
        
        return result;
        
    }
    
    private static void buildResult(int[] num, int start, int target, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result){
        if (target==0){
            ArrayList<Integer> temp=new ArrayList<Integer>(current);
            result.add(temp);     
            return;
        }
 
        
        for (int i=start; i<num.length; i++){
            if (num[i]>target){
                continue;
            }       
            current.add(num[i]);
            buildResult(num,i+1, target-num[i], current,result);
            current.remove(current.size()-1);
            while(i+1<num.length && num[i]==num[i+1]){
                i++;
            }
        }
		 
	 }
	 
	
	public static void main(String args[]){
		int[] num = {10,1,2,7,6,1,5};
//		HashSet<ArrayList<Integer>> table = new HashSet<ArrayList<Integer>>();
//       {1,1}
//		for(int i=0;i<2;i++){
//			ArrayList<Integer> a = new ArrayList<Integer>();
//			a.add(num[i]);
//			System.out.println(table.add(a));
//		}
		System.out.println(combinationSum2(num, 8));
	}
}
