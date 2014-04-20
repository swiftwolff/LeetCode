
public class ValidateBinarySearchTree {

	public static boolean isValidBST(TreeNodeI root) {
        if(root==null){
        	return true;
        }	
        boolean left = isValidBSTHelper(root.left,Integer.MIN_VALUE,root.val);
        if(!left){
        	return false;
        }
        boolean right = isValidBSTHelper(root.right,root.val,Integer.MAX_VALUE);
        if(!right){
        	return false;
        }
		return true;
    }
	
	public static boolean isValidBSTHelper(TreeNodeI root, int min, int max){
		if(root==null){
			return true;
		}
		if(root.val <= min || root.val >= max){
			return false;
		}
		if(root.left!=null){
			boolean left = isValidBSTHelper(root.left,Math.min(min,root.val),Math.min(root.val, max));
			if(!left){
				return false;
			}
		}
		
		if(root.right!=null){
			boolean right = isValidBSTHelper(root.right,Math.max(min ,root.val),Math.max(root.val, max));
			if(!right){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		TreeNodeI root = new TreeNodeI(10);
		root.left=new TreeNodeI(5);
		root.right = new TreeNodeI(15);
		root.right.left = new TreeNodeI(6);
		root.right.right = new TreeNodeI(20);
		
		System.out.println(isValidBST(root));
	}
}
