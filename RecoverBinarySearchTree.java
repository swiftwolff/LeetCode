
public class RecoverBinarySearchTree {
	
	
	public void recoverTree(TreeNode root) {
        
		
		
		
		
		
		
    }
	
	public TreeNode recoverTreeHelper(TreeNode root){
		if(root.left==null && root.right==null){
			return null;
		}	
		if(root.left==null || root.right==null){
			return root.left==null? recoverTreeHelper(root.right):recoverTreeHelper(root.left);
		}	
		TreeNode left = null;
		TreeNode right =null;
		if(root.left!=null && root.right!=null){
			if(root.left.val>=root.val||root.right.val <= root.val){
				return root;
			}else{
				left = recoverTreeHelper(root.left);
				right = recoverTreeHelper(root.right);
			}
		}	
		if(left==null||right==null){
			return null;
		}
		int tmp = 0;
		tmp = left.val;
		left.val = right.val;
		right.val = tmp;
		return root;
		
	}
	
	public void swapTreeNode(TreeNode one, TreeNode two){
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
	}
}
