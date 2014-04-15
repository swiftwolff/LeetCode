
public class UniqueBinarySearchTree {
	
	public static int numTrees(int n) {
        if (n==0||n==1){
            return 1;
        }
        
        if (n==2){
            return 2;
        }
        
        int left = 0;
        int right =0;
        int sum = 0;
        
        for(int i=1;i<=n;i++){
            left = numTrees(i-1);
            right = numTrees(n-i);
            sum += left*right;
        }
        
        return sum;  
    }
	
	public static void main(String args[]){
		
	}
}
