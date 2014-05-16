import java.util.Arrays;


public class BinaryTreeMaximumPathSum {
	 public int  maxPathSum(TreeNode root) {  
	        int [] max = {Integer.MIN_VALUE};   
	        rec(root, max);  
	        return  max[ 0 ];  
	    }  
	      
	    public int  rec(TreeNode root,  int [] max){  
	        if (root ==  null ){  
	            return  0 ;  
	        }  
	          
	        int  leftSubtreeMaxSum = rec(root.left, max); 
	        int  rightSubtreeMaxSum = rec(root.right, max);  
	        int  arch = leftSubtreeMaxSum + root.val + rightSubtreeMaxSum;    

	        int  maxPathAcrossRootToParent = Math.max(root.val, Math.max(leftSubtreeMaxSum, rightSubtreeMaxSum)+root.val);  
	        System.out.println("This is arc " + arch);
	        System.out.println("This is maxPathAcrossRootToParent " + maxPathAcrossRootToParent);
	        max[ 0 ] = Math.max(max[ 0 ], Math.max(arch, maxPathAcrossRootToParent)); //max stores max 

	        return  maxPathAcrossRootToParent;  //maxPathAcrossRootToParent stores path
	    }  
	public static void main(String args[]){
		BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();  //return max point, not path
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left= new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		
		System.out.println(solution.maxPathSum(root));
		
	}
}
