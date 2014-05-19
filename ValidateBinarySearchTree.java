
public class ValidateBinarySearchTree {

//	public static boolean isValidBST(TreeNodeI root) {
//        if(root==null){
//        	return true;
//        }	
//        boolean left = isValidBSTHelper(root.left,Integer.MIN_VALUE,root.val);
//        if(!left){
//        	return false;
//        }
//        boolean right = isValidBSTHelper(root.right,root.val,Integer.MAX_VALUE);
//        if(!right){
//        	return false;
//        }
//		return true;
//    }
//	
//	public static boolean isValidBSTHelper(TreeNodeI root, int min, int max){
//		if(root==null){
//			return true;
//		}
//		if(root.val <= min || root.val >= max){
//			return false;
//		}
//		if(root.left!=null){
//			boolean left = isValidBSTHelper(root.left,Math.min(min,root.val),Math.min(root.val, max));
//			if(!left){
//				return false;
//			}
//		}
//		
//		if(root.right!=null){
//			boolean right = isValidBSTHelper(root.right,Math.max(min ,root.val),Math.max(root.val, max));
//			if(!right){
//				return false;
//			}
//		}
//		
//		return true;
//	}
	
	public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        int[] prev = {Integer.MIN_VALUE};
        
        return isValidBSTHelper(root,prev);
        
    }
    public boolean isValidBSTHelper(TreeNode root, int[] prev){
        
        if(root.left==null && root.right==null){
            if(prev[0]>=root.val){
                return false;
            }
            prev[0] = root.val;
            return true;
        }
        boolean left = true;
        if(root.left!=null){
            left = isValidBSTHelper(root.left, prev);
        }
        
        if(left==false || prev[0]>=root.val) return false;
        prev[0] = root.val;
        
        if(root.right!=null){
            return isValidBSTHelper(root.right, prev);
        }
        
        return true;
    }
	
	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
		root.left=new TreeNode(5);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);
		ValidateBinarySearchTree solution = new ValidateBinarySearchTree();
		System.out.println(solution.isValidBST(root));
		System.out.println(Integer.MAX_VALUE);
	}
}
