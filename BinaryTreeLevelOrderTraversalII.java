import java.util.ArrayList;
public class BinaryTreeLevelOrderTraversalII {

	public static ArrayList<ArrayList<Integer>> BinaryTraverse(TreeNode root){
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root==null){
			return res;
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(root.val);
		res.add(temp);
		traverse(root,res,1);
		
		return BinaryTreeLevelOrderTraversalII.reverse(res);
//		return res;
	}
	
	public static void traverse(TreeNode root, ArrayList<ArrayList<Integer>> lst, int level ){
		if (root == null){
			return;
		}

		ArrayList<Integer> temp = new ArrayList<Integer>();

		if (level < lst.size()){
			temp = lst.get(level);
		}
		
		if (root.left!= null){
			temp.add(root.left.val);		
		}
		if (root.right!=null){
			temp.add(root.right.val);
		}
		if (root.left==null && root.right==null){
			return;
		}
		if(level >= lst.size()){
			lst.add(level,temp);
		}
		
		traverse(root.left,lst,level+1);
		traverse(root.right,lst,level+1);
			
	}
	
	public static ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>> input){
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		int j = 0;
		for (int i=input.size()-1; i>=0;i--){
			ans.add(j,input.get(i));
			j++;
		}
		return ans;
	}
	
	
	public static void main(String args[]){
	  TreeNode a = new TreeNode(1);
  	  TreeNode b = new TreeNode(2);
  	  TreeNode c = new TreeNode(3);
  	  TreeNode d = new TreeNode(4);
  	  TreeNode e = null;
  	  TreeNode f = null;
  	  TreeNode g = new TreeNode(5);
  	  TreeNode[] t = {b,c,d,e,f,g};
  	  a.insert(t, a);
	  System.out.println(a.val);
	  System.out.println(a.left.val);
	  System.out.println(a.right.val);

	  System.out.println(a.left.left.val);
	  System.out.println(a.right.right.val);
	  
	  System.out.println(BinaryTreeLevelOrderTraversalII.BinaryTraverse(a));
  	  
	}
}
