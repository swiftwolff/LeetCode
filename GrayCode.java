import java.util.ArrayList;
public class GrayCode {
	
	public static ArrayList<Integer> graycode(int n){
		ArrayList<Integer> table = new ArrayList<Integer>();
		int base = 0;
		int length = 0;
		table.add(0);
		table.add(1);
	
		for (int i=1;i<n;i++){
			base = 1<<i;
			length = table.size();
			for (int j=length-1;j>-1;j--){
				table.add(table.get(j)+base);
			}
		}
	
		
		return table;
	}
	
	public static void main(String args[]){
		System.out.println(graycode(3));
		
	}
	
}
