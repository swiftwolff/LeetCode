import java.util.HashMap;
public class SortColors {
	public static void sort(int[] A){
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0,0);
		map.put(1,0);
		map.put(2,0);
	
		for (int i=0;i<A.length;i++){
			map.put(A[i],map.get(A[i])+1);
		}
		
//		System.out.println(map);
		int start = 0;
		for (int j:map.keySet()){
			
			for (int k=start;k<map.get(j)+start;k++){
//				System.out.println(k);
//				System.out.println(j);
				A[k] = j;
			}
			start += map.get(j);
		}
	}
	
	public static void sortII(int[] A){
		
	}
	
	
	public static void main(String args[]){
		int[] A = {1,1,1,0,0,0,0,2,2,2,0};
		SortColors.sort(A);
		for (int i: A){
			System.out.println(i);
		}
	}
}
