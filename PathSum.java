
public class PathSum {
	
	public static boolean hasPathSum(TreeNodeI root, int sum){
		if(root==null){
			return false;
		}
//		if(root.val == sum && root.left==null && root.right==null){
//			return true;
//		}		
		return hasPathSumHelper(root,sum,0);
	}
	
	public static boolean hasPathSumHelper(TreeNodeI root, int sum, int acc){
		
		if(root.left==null && root.right==null){
			return root.val+acc==sum;
		}
		boolean left = false;
		if(root.left!=null){
			left = hasPathSumHelper(root.left,sum,acc+root.val);
		}	
		if(left){
			return true;
		}
		boolean right = false;
		if(root.right!=null){
			right = hasPathSumHelper(root.right,sum,acc+root.val);
		}
		if(right){
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]){
		
		TreeNodeI root = new TreeNodeI(1);
//		root.setLeftChild(new TreeNodeI(-2));
//		root.setRightChild(new TreeNodeI(3));
		root.setLeftChild(new TreeNodeI(2));
		root.left.setLeftChild(new TreeNodeI(3));
		root.left.left.setLeftChild(new TreeNodeI(4));
//		root.left.left.setRightChild(new TreeNodeI(9));
//		root.left.left.left.setLeftChild(new TreeNodeI(5));
//		root.left.left.left.left.setLeftChild(new TreeNodeI(6));
		
//		root.setRightChild(new TreeNodeI(2));
//		root.right.setRightChild(new TreeNodeI(3));
//		root.right.right.setRightChild(new TreeNodeI(4));
//		root.right.right.right.setRightChild(new TreeNodeI(5));
//		root.right.right.right.setRightChild(new TreeNodeI(5));
//		root.left.left.left.left.setLeftChild(new TreeNodeI(6));
		System.out.println(hasPathSum(root, 11));
		
//		root.left.setRightChild(new TreeNodeI(23));
//		root.setRightChild(new TreeNodeI(4));
//		root.right.setRightChild(new TreeNodeI(20));
	}
}
