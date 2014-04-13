
public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null){
            flatten(root.right);
            return;
        }
         
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        if(right!=null){
            //find the right most element in root's left subtree
            //add root's right subtree to the element as a right child
            TreeNode runner = left;
            while(runner.right!=null){
                runner = runner.right;
            }
            runner.right = right;
        }
        root.right=left;
        flatten(left);
         
    }
	//First take left off the root.
	//Second recur to the rightmost of left tree and attach the right tree to it
	//Third attach the new "left" tree to right of node
	//Forth flatten the root's right tree
	
	
	public static void main(String args[]){
		
	}
}
