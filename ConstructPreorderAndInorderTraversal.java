import java.util.HashMap;

public class ConstructPreorderAndInorderTraversal {
 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0){
            return null;
        }
        
        HashMap<Integer,Integer> inorderTable = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inorderTable.put(inorder[i],i);
        }
        
        return buildTreeHelper(preorder,0,preorder.length-1,inorderTable,0,inorder.length-1);
    }
    
    public TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, HashMap<Integer,Integer> inorderTable, int inStart, int inEnd){
        if(inStart > inEnd || preStart > preEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int k = inorderTable.get(preorder[preStart]);
        root.left = buildTreeHelper(preorder, preStart+1, preStart + k-inStart, inorderTable, inStart, k-1);
        root.right = buildTreeHelper(preorder, preStart+k-inStart+1, preEnd, inorderTable, k+1, inEnd);
        
        return root;
    }
	public static void main(String args[]){
		int[] preorder = {1,2};
		int[] inorder = {2,1};
		ConstructPreorderAndInorderTraversal solution = new ConstructPreorderAndInorderTraversal();
//		solution.buildTree(preorder,inorder);
		TreeNode root = solution.buildTree(preorder, inorder);
		root.preorder(root);
	}
}
