
public class FlattenBinaryTreeToLinkedList {
	 public void flatten(TreeNode root) {

	       if(root==null){
	           return;
	       }
	       while(root!=null){
	           flattenHelper(root);
	           root = root.right;
	       }
	       return;    
	    }
	    
	    public void flattenHelper(TreeNode root){
	        
	        if(root==null){
	            return;
	        }
	        if(root.left==null){
	        	flattenHelper(root.right);
	        	return;
	        }
	        TreeNode left = null;
	        TreeNode right = null;
	        
	        if(root.left!=null){
	            left = root.left;
	        }
	        if(root.right!=null){
	            right = root.right;
	        }
	        
	        if(left!=null){
	        	root.right = left;
	        }
	        root.left = right;
	        
	        if(left!=null){
	        	 if(left.left==null&&left.right==null){
	 	            left.right = root.left;
	 	            root.left = null;
	 	        }else{
	 	        	TreeNode tmp = left;
	 	        	while(tmp.right!=null){
	 	        		tmp = tmp.right;
	 	        	}
	 	        	tmp.right = root.left;
	 	        	root.left = null;
	 	        }
	        }
	       
	        flattenHelper(root.right);
	    }
	
	
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(4);
//		root.right.right = new TreeNode(6);
		
		
		FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
		solution.flatten(root);
		
		while(root!=null){
			System.out.println(root.val);
			root = root.right;
		}
	}
}
