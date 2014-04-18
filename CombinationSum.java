import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
	
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> store = new ArrayList<Integer>();
		if(candidates.length==0){
			res.add(store);
			return res;
		}   
        Arrays.sort(candidates);
        for(int i=0;i<candidates.length;i++){
        	if(candidates[i]==target){
    			ArrayList<Integer> tmp = new ArrayList<Integer>();
    			tmp.add(candidates[i]);
    			res.add(tmp);
    			continue;
    		}
        	combinationSumHelper(candidates,i,0,target,store,res);
        }
        
        return res;
    }
	
	public static void combinationSumHelper(int[] candidates, int cur, int sum, int target, ArrayList<Integer> store,ArrayList<ArrayList<Integer>> res){
		
		if(cur==candidates.length||sum > target){
			return;
		}
		ArrayList<Integer> tmp = new ArrayList<Integer>(store);
		tmp.add(candidates[cur]);
		sum+=candidates[cur];
		if(sum==target){
			res.add(tmp);
		}
		combinationSumHelper(candidates,cur,sum,target,tmp,res);
		for(int i=cur+1;i<candidates.length;i++){
			combinationSumHelper(candidates,i,sum,target,tmp,res);
		}
		
	}
	
    public static void combinationSumMod(int[] candidates, int target) {  //DP version
    // Start typing your Java solution below
    // DO NOT write main() function
    int dp[]=new int[target+1];
    dp[0]=1;
    
    for(int i=0;i<candidates.length;i++)
    for(int s=0;s<target+1;s++){
        if(s>=candidates[i]) dp[s]=dp[s-candidates[i]]+dp[s];
    }
    System.out.println(dp[target]);
    return;
}
    
    
	
	public static void main(String args[]){
		
		int[] num = {2,3,6,7};
		System.out.println(combinationSum(num,7));
		
	}
}
