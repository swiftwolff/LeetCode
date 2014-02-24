import java.util.HashMap;
public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target){
		
		HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
		int[] res = new int[2];
		for(int i=0;i<numbers.length;i++){
			if (visited.containsKey(target - numbers[i])){
				res[0] = visited.get(target-numbers[i])+1;
				res[1] = ++i;
			}
			visited.put(numbers[i], i);
			
		}
		
		return res;
	}

	
	public static void main(String args[]){
		int[] A = {2,7,11,15};
		int[] B = new int[2];
		B = TwoSum.twoSum(A, 9);
		for (int i=0;i<B.length;i++){
			System.out.println(B[i]);
		}
		
		
	}
}
