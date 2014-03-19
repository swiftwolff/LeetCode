import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
	
	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root==null){
        	return res;
        }
        traverse(root,res);
        return res;
		
    }
	
	public static void traverse(TreeNode root, ArrayList<Integer> res){
		int first = 0;
		int rootfirst = 0;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(!s.isEmpty()||root!=null){
			if(root.left!=null){
				s.push(root);
				root = root.left;
				continue;
			}else{
				res.add(root.val);
				root = root.right;
			}
			if(root==null){
				root=s.pop();
				if(s.isEmpty()&&rootfirst==1){
					res.add(root.val);
					break;
				}
				if(root.right!=null&&first==0){
					s.push(root);
					root = root.right;
					first = 1;
					continue;
				}
			first = 0;
			res.add(root.val);
			root = s.pop();
			if(s.isEmpty()&&rootfirst==0){
				s.push(root);
				rootfirst=1;
				root=root.right;
			}else{
				res.add(root.val);
				root = null;
			}
			}
		}
	}
	
	public static void main(String args[]){
		  TreeNode a = new TreeNode(1);
	  	  TreeNode b = new TreeNode(2);
	  	  TreeNode c = new TreeNode(3);


	  	  TreeNode[] t = {b,c};
	  	  a.insert(t, a);
	  	  a.postorder(a);
	  	  System.out.println(postorderTraversal(a));
	  	  
	}
}
