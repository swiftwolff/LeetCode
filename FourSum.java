import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class FourSum {
	
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		HashSet<ArrayList<Integer>> ret = new HashSet<ArrayList<Integer>>();
		
		if(num.length==0){
			return new ArrayList<ArrayList<Integer>>();
		}
		Arrays.sort(num);
		int k = 0;
		int l = num.length-1;
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				k = j+1;
				while(k<l){
					if(target<(num[i]+num[j]+num[k]+num[l])){
						l--;
					}else if(target>(num[i]+num[j]+num[k]+num[l])){
						k++;
					}else{
						ArrayList<Integer> tmp = new ArrayList<Integer>();
						tmp.add(num[i]);
						tmp.add(num[j]);
						tmp.add(num[k]);
						tmp.add(num[l]);
						ret.add(tmp);
						k++;
					}
				}
				l=num.length-1;
			}
		}
		
		return new ArrayList<ArrayList<Integer>>(ret);
    }
	
	public static void main(String args[]){
		int[] num = {0,0,0,0,0,0,0};
		FourSum solution = new FourSum();
		System.out.println(solution.fourSum(num, 0));
	}
}
