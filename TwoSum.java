import java.util.HashMap;
public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length<=1){
            return new int[2];
        }
        HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i=0;i<numbers.length;i++){
            if(store.containsKey(numbers[i])){
                res[0] = store.get(numbers[i])+1;
                res[1] = i+1;
                return res;
            }else{
                store.put(target - numbers[i],i);
            }
        }
        
    return res;
    }

	
	public static void main(String args[]){
		int[] A = {3,2,4};
		twoSum(A,6);
	}
}
