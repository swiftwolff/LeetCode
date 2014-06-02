import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {
	
//	public static ArrayList<ArrayList<Integer>> ThreeSumFind(int[] arry){
//		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
//		if(arry.length<=2){
//			return res;
//		}
//		Arrays.sort(arry);
//		int negate = 0;
//		int start=0;
//		int end=arry.length-1;
//		for(int i=0;i<arry.length;i++){
//			negate = -arry[i];
//			start = i+1;
//			end = arry.length-1;
//			if(i > 0&&arry[i]==arry[i-1]){
//				continue;
//			}
//			while(start < end){
//				if(arry[start] + arry[end] == negate){
//					ArrayList<Integer> tmp = new ArrayList<Integer>();				
//					tmp.add(arry[i]);
//					tmp.add(arry[start]);
//					tmp.add(arry[end]);
//					res.add(tmp);
//					start++;
//					end--;
//					while(start < end && arry[start]==arry[start-1]){
//						start++;
//					}
//					while(start < end && arry[end]==arry[end+1]){
//						end--;
//					}	
//				}else if(negate > arry[start]+arry[end]){
//					start++;
//				}
//				else{
//					end--;
//				}
//		}
//			
//		}
//		
//		return res;
//		
//	}
	public static ArrayList<ArrayList<Integer>> ThreeSumFind(int[] num){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(num.length==0||num==null) return null;
		Arrays.sort(num);
		for(int i=0;i<num.length-2;i++){
			int start = i+1;
			int end = num.length-1;
			if(i>=1&&num[i]==num[i-1]) continue;
			while(start<end){
				if(start>=i+2 && num[start]==num[start-1]){
					start++;
					continue;
				}
				int total = num[i]+num[start]+num[end];
				if(total<0){
					start++;
				}else if(total>0){
					end--;
				}else{
					ArrayList<Integer> ans = new ArrayList<Integer>(Arrays.asList(num[i],num[start],num[end]));
					res.add(ans);
					start++;
				}
			}
		}
		
		return res;
		
	}
	public static void main(String args[]){
		int[] A = {-1,0,1,2,-1,-4};
//		int[] B = {-4,-1,-1,0,1,2};
		int[] B = {0,0,0,0};
		System.out.println(ThreeSumFind(A));
	}
}
