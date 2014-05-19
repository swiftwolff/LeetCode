import java.util.LinkedList;
import java.util.Queue;


public class minimumDepthOfBinaryTree {
	
//	public int minDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        
//        if(root.left==null && root.right==null){
//        	return 1;
//        }
//        
//        if(root.left==null){
//        	return 1+minDepth(root.right);
//        }
//        
//        if(root.right ==null){
//        	return 1+minDepth(root.left);
//        }
//        
//        return 1+Math.min(minDepth(root.left), minDepth(root.right));
//       
//    }
//	
//	public int minDepthShortestPath(TreeNode root){
//		if(root==null){
//			return 0;
//		}
//		if(root.left==null&&root.right==null){
//			return 1;
//		}
//		Queue<TreeNode> q = new LinkedList<TreeNode>();
//		q.add(root);
//		int count = 0;
//		while(!q.isEmpty()){
//			TreeNode cur = q.remove();
//			if(cur.left==null && cur.right==null){
//				break;
//			}
//			if(cur.left!=null){
//				q.add(cur.left);
//			}
//			if(cur.right!=null){
//				q.add(cur.right);
//			}
//			
//			count++;
//		}
//		
//		return count;
//	}
	
	public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return minDepthHelper(root);
    }
    public int minDepthHelper(TreeNode root){
        if(root==null){
        	return Integer.MIN_VALUE;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int left = 1;
        int right = 1;
        left += minDepthHelper(root.left);
        right+= minDepthHelper(root.right);
        if(left<0 || right<0){
            return left<0?right:left;
        }
        return Math.min(left,right);
    }
	
	public static void main(String args[]){
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		
		minimumDepthOfBinaryTree solution = new minimumDepthOfBinaryTree();
		System.out.println(solution.minDepth(root));
		System.out.println(solution.minDepthHelper(null));
		
	}
	
}
