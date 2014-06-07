import java.util.ArrayList;
import java.util.Arrays;


public class PathSum {
	
//	public static boolean hasPathSum(TreeNodeI root, int sum){
//		if(root==null){
//			return false;
//		}
////		if(root.val == sum && root.left==null && root.right==null){
////			return true;
////		}		
//		return hasPathSumHelper(root,sum,0);
//	}
//	
//	public static boolean hasPathSumHelper(TreeNodeI root, int sum, int acc){
//		
//		if(root.left==null && root.right==null){
//			return root.val+acc==sum;
//		}
//		boolean left = false;
//		if(root.left!=null){
//			left = hasPathSumHelper(root.left,sum,acc+root.val);
//		}	
//		if(left){
//			return true;
//		}
//		boolean right = false;
//		if(root.right!=null){
//			right = hasPathSumHelper(root.right,sum,acc+root.val);
//		}
//		if(right){
//			return true;
//		}
//		
//		return false;
//	}
	public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        return hasPathSumHelper(root,sum);
    }
    
    public static boolean hasPathSumHelper(TreeNode root, int sum){
       
        if(root==null) return false;
        sum = sum - root.val;
        if(sum==0 && root.left==null && root.right==null) return true;
        boolean left = hasPathSumHelper(root.left,sum);
        if(left) return true;
        boolean right = hasPathSumHelper(root.right,sum);
        if(right) return true;
        
        return false;
    }
	public static void main(String args[]){
		
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		System.out.println(hasPathSum(a,1));
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(3);
		res.add(4);
		
		System.out.println(res.toString());
		
		
	}
}
