import java.util.ArrayList;

public class Permutation {
	public ArrayList<String> permute(String s){
		ArrayList<String> res = new ArrayList<String>();
		char[] c = s.toCharArray();
		permuteHelper(c,0,res);
		return res;
	}
	
	public void permuteHelper(char[] c, int index, ArrayList<String> res){
		
		if(index>c.length-1){
			res.add(new String(c));
			return;
		}
		
		for(int i=index;i<c.length;i++){	
			swap(c,i,index);
			permuteHelper(c,index+1,res);
			swap(c,i,index);	
		}
		return;
	}
	
	public void swap(char[] c, int a, int b){
		char tmp = c[a];
		c[a] = c[b];
		c[b] = tmp;
	}
	
	public static void main(String args[]){
		Permutation solution = new Permutation();
		System.out.println(solution.permute("abcd").size());
		
	}
	
}
