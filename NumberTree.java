
public class NumberTree {
	
	public static int numTree(int n){
		if (n==0){
			return 2;
		}
		
		if (n==1){
			return 1;
		}
		
		if (n==2){
			return 2;
		}
		
		if (n==3){
			return 5;
		}
				
		return numTree(n-1)*n;		
	}
	
	
	
	
	public static void main(String args[]){
		System.out.println(NumberTree.numTree(6));
	}
	
	
	
}
