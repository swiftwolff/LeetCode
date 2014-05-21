import java.util.ArrayList;

public class GenerateSet {
	public ArrayList<String> generateSet(int[] nums){
        ArrayList<String> res = new ArrayList<String>();
        if(nums.length==0) return res;
        res.add("");
        generateSetHelper(nums,0,res);
    
        return res;
    }
    
    public void generateSetHelper(int[] nums, int cur, ArrayList<String> res){
        if(cur==nums.length){
            return;
        }
        int stop = res.size();
        for(int i=0;i<stop;i++){
            String tmp = res.get(i)+nums[cur];
            res.add(tmp);
        }
        generateSetHelper(nums,cur+1,res);
        return;
    }
    public static void main(String args[]){
    	int[] nums = {1,2,3};
    	GenerateSet solution = new GenerateSet();
    	System.out.println(solution.generateSet(nums));
    }
}
