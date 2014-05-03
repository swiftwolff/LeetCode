import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
	
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root == null){
			return res;
		}
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(root);
		while(!s1.isEmpty()){
			TreeNode cur = s1.pop();
			s2.push(cur);
			if(cur.left!=null){
				s1.push(cur.left);
			}
			if(cur.right!=null){
				s1.push(cur.right);
			}	
		}
		while(!s2.isEmpty()){
			res.add(s2.pop().val);
		}
		
		return res;
		
	}
	
	
	
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(10);
		root.left.left = new TreeNode(9);
		root.right = new TreeNode(3);
		BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();	
	    System.out.println(solution.postorderTraversal(root));	
	}
}
