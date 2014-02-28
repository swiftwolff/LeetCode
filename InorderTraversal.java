import java.util.Stack;
import java.util.ArrayList;
public class InorderTraversal {
	public static ArrayList<Integer> inorder(TreeNode root){
		
		if (root ==null){
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
//		stack.push(root);
		
		while(!stack.isEmpty()||root!=null){
			if (root.left==null){
				lst.add(root.val);
				while (root.right==null&&!stack.isEmpty()){
					root = stack.pop();
					lst.add(root.val);
				}
				root = root.right;
				
			}else{
				stack.push(root);
				root = root.left;

			}
		}
		
		return lst;
	}
	
	public static void main(String args[]){
		  TreeNode a = new TreeNode(1);
	  	  TreeNode b = new TreeNode(2);
	  	  TreeNode c = new TreeNode(3);
	  	  TreeNode d = new TreeNode(4);
	  	  TreeNode e = null;
	  	  TreeNode f = new TreeNode(5);
	  	  TreeNode g = null;
	  	  TreeNode i = null;
	  	  TreeNode j = new TreeNode(6);
	  	  TreeNode[] t = {b,c,d,e,f,g,i,j};
	  	  a.insert(t, a);
	  	  a.inorder(a);
	  	  
	  	  System.out.println(InorderTraversal.inorder(a));
	  	  
	  	  
	  	  
	}
}
