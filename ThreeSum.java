import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {
	
	public static ArrayList<ArrayList<Integer>> ThreeSumFind(int[] arry){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(arry.length<=2){
			return res;
		}
		Arrays.sort(arry);
		int negate = 0;
		int start=0;
		int end=arry.length-1;
		for(int i=0;i<arry.length;i++){
			negate = -arry[i];
			start = i+1;
			end = arry.length-1;
			while(start < end){
				if(arry[start] + arry[end] == negate){
					ArrayList<Integer> tmp = new ArrayList<Integer>();				
					tmp.add(arry[i]);
					tmp.add(arry[start]);
					tmp.add(arry[end]);
					res.add(tmp);
					start++;
					end--;
					while(start < end && arry[start]==arry[start-1]){
						start++;
					}
					while(start < end && arry[end]==arry[end+1]){
						end--;
					}	
				}else if(negate > arry[start]+arry[end]){
					start++;
				}
				else{
					end--;
				}
		}
			
		}
		
		return res;
		
	}
	
	public static void main(String args[]){
		int[] A = {-2,-1,0,1,1};
		System.out.println(ThreeSumFind(A));
	}
}
