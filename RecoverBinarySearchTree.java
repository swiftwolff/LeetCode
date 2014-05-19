
public class RecoverBinarySearchTree {
		TreeNode p;
		TreeNode q;
		TreeNode pre;
	 
	public  void  recoverTree(TreeNode root) { 
				 
		        if  (root ==  null )  return ;  
		        getWrong(root);  
		        int  tmp = p.val;  
		        p.val = q.val;  
		        q.val = tmp;  
	}  
  
	public  void  getWrong(TreeNode root) {  
		        if  (root ==  null )  return ;  
		        getWrong(root.left);  
		        if  (pre !=  null  && root.val < pre.val) {  
		            if  (p ==  null ) {  
		                p = pre;  
		                q = root;  
		            }  
		            else   
		                q = root;  
		        }  
		        pre = root;  
		        getWrong(root.right);  
	} 
	
	
	public static void main(String args[]){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(9);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(4);
		RecoverBinarySearchTree solution = new RecoverBinarySearchTree();
		solution.recoverTree(root);
		root.preorder(root);
	}
}
