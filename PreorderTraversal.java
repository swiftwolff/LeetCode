
import java.util.Stack;
import java.util.ArrayList;
public class PreorderTraversal {
	public static ArrayList<Integer> preorder(TreeNode root){
		
		if (root ==null){
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		while(!stack.isEmpty()||root!=null){
			if(root.left!=null){
				stack.push(root);
				lst.add(root.val);
				root = root.left;
			}else{
				lst.add(root.val);
				while(root.right==null && !stack.isEmpty()){
					root = stack.pop();
				}

				root = root.right;
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
	  	  a.preorder(a);
	  	  
	  	  System.out.println(PreorderTraversal.preorder(a));
	  	  
	  	  
	  	  
	}
}

