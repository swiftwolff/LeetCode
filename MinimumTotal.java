import java.util.ArrayList;

public class MinimumTotal {
	
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle){  //not correct
		
		if(triangle.size()==0){
			return 0;
		}
		int record = 0;
		int min = 0;
		int sum = triangle.get(0).get(0);
		
		for(int i=1;i<triangle.size();i++){
			min = Math.min(triangle.get(i).get(record), triangle.get(i).get(record+1));
			record = min==triangle.get(i).get(record)? record:record+1;
			sum+= min;
		}
	
		return sum;
	}
	
	public static int minimumTotalTwo(ArrayList<ArrayList<Integer>> triangle) {
		if(triangle.size()==0){
			return 0;
		}
		int[] pathSum = new int[triangle.size()];
		int row = triangle.size()-1;
		
		for(int i=row;i>-1;i--){
			for(int j=0;j<triangle.get(i).size();j++){
				if(i==row){
					pathSum[j] = triangle.get(row).get(j);  //populate the base
				}else{
					pathSum[j] = Math.min(pathSum[j],pathSum[j+1])+triangle.get(i).get(j);  //compares base and update to new col
				}
			}
		}
		
        return pathSum[0];
    }
	
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(4);
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(6);
		c.add(5);
		c.add(7);
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(4);
		d.add(1);
		d.add(8);
		d.add(3);
		triangle.add(a);
		triangle.add(b);
		triangle.add(c);
		triangle.add(d);
		System.out.println(minimumTotal(triangle));
		System.out.println(minimumTotalTwo(triangle));
	}
}
