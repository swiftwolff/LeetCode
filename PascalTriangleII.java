import java.util.ArrayList;

public class PascalTriangleII {
	public static ArrayList<Integer> getRow(int rowIndex) {
        int[] res = new int[rowIndex+1];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        res[0] = 1;
        if(rowIndex==0){
            ans.add(res[0]);
            return ans;
        }
        for(int i=0;i<rowIndex+1;i++){
            for(int j=i;j>0;j--){//going backward to update the prev
                res[j] = res[j] + res[j-1];
            }
        }

        for(int i:res){
            ans.add(i);
        }
        
        return ans;
    }
	public static void main(String args[]){
		System.out.println(getRow(0));
	}
}
