import java.util.HashMap;


public class ConstructInorderAndPostorderTraversal {
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0) return null;
        
        HashMap<Integer,Integer> inorderTable = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inorderTable.put(inorder[i],i);
        }
        
        return buildTreeHelper(postorder,0,postorder.length-1,inorderTable,0,inorder.length-1);
        
    }
    
    public TreeNode buildTreeHelper(int[] postorder, int postStart, int postEnd, HashMap<Integer,Integer> inorderTable, int inStart, int inEnd){
        
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int k = inorderTable.get(postorder[postEnd]);
        
        
        root.left = buildTreeHelper(postorder,postStart,postStart+k-(inStart+1),inorderTable,inStart,k-1);
        // Becuase k is not the length, it it need to -(inStart+1) to get the length
        root.right = buildTreeHelper(postorder,postStart+k-inStart,postEnd-1,inorderTable,k+1,inEnd);
        // postStart+k-inStart = postStart+k-(inStart+1) +1
        return root;
    }
	    
	    
	    
	public static void main(String args[]){
		

		int[] preorder = {2,1};
		int[] inorder = {2,1};
		ConstructInorderAndPostorderTraversal solution = new ConstructInorderAndPostorderTraversal();
		TreeNode root = solution.buildTree(preorder, inorder);
		root.preorder(root);
		
		
		
		
	}
	    
	    
	    
}
