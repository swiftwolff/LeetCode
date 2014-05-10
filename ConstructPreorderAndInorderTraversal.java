import java.util.HashMap;


public class ConstructPreorderAndInorderTraversal {
	
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
	        //corner case needs to take care
	        if(inorder.length==0||postorder.length==0){
	            return null;
	        }
	        HashMap<Integer,Integer> inTable = new HashMap<Integer,Integer>();
	        for(int i=0;i<inorder.length;i++){
	            inTable.put(inorder[i],i);   //value and its index
	        }
	        int len = postorder.length-1;
	        TreeNode root = buildTreeHelper(inTable, 0 , len, postorder, 0, len);
	        return root;
	    }
	    
	    public TreeNode buildTreeHelper(HashMap<Integer,Integer> inTable, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
	        
	        if(inStart > inEnd || postStart > postEnd){
	            return null;
	        }
	        
	        TreeNode root = new TreeNode(postorder[postEnd]);
	        int k = inTable.get(postorder[postEnd]);
	        
	        root.left = buildTreeHelper(inTable, inStart, k-1, postorder, postStart, postStart+(k-inStart-1));
	        root.right = buildTreeHelper(inTable, k+1, inEnd, postorder, postStart+(k-inStart) ,postEnd-1);
	        
	        return root;
	    }
}
