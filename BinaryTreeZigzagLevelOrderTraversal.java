import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
	
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root==null){
        	return res;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
        	TreeNode node = null;
        	ArrayList<Integer> tmp = new ArrayList<Integer>();
        	while(!q.isEmpty()){
        		TreeNode newnode = q.remove();
            	tmp.add(newnode.val);
            	node = newnode;
            	stack.push(node);
        	}
        	res.add(tmp);
        	if(count%2==0){
        		while(!stack.isEmpty()){
        			TreeNode newnode = stack.pop();
        			if(newnode.right!=null){
                		q.add(newnode.right);
                	}
        			if(newnode.left!=null){
                		q.add(newnode.left);
                	}
        		}
        	}else{
        		while(!stack.isEmpty()){
        			TreeNode newnode = stack.pop();
        			if(newnode.left!=null){
                		q.add(newnode.left);
                	}
        			if(newnode.right!=null){
                		q.add(newnode.right);
                	}
        		}
        			
        	}     	
        	
        	count++;
        }
        return res;
        
    }

	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		
		BinaryTreeZigzagLevelOrderTraversal solution = new BinaryTreeZigzagLevelOrderTraversal();
		System.out.println(solution.zigzagLevelOrder(root));
		
	}
}
