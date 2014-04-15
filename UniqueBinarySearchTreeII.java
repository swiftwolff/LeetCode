
public class UniqueBinarySearchTreeII {
	
	public int uniqueBST(int n){
		
		if(n==0){
			return 1;
		}
		
		if(n==1){
			return 1;
		}
		
		
		
		int left = uniqueBST(n-1);
		int right = uniqueBST(n+1);
		
		int sum = left*right;
		
		return 0;
	}
	
	
	
	
	public static void main(String args[]){
		
	}
}
