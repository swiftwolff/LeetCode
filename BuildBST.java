import java.util.HashMap;
public class BuildBST {
	
	public static TreeNodeI buildTree(int[] preorder, int[] inorder){
		HashMap<Integer,Integer> in = new HashMap<Integer,Integer>();
		for (int i=0;i<inorder.length;i++){
			in.put(inorder[i], i);
		}
		return build(preorder, 0, preorder.length-1, in, 0, inorder.length-1);
		
		
	}
	
	public static TreeNodeI build(int[] preorder, int preStart, int preEnd, HashMap<Integer,Integer> inorder, int inStart, int inEnd){
		if (inStart > inEnd){
			return null;
		}
		
		TreeNodeI root = new TreeNodeI(preorder[preStart]);
		int rootIndex = inorder.get(preorder[preStart]);
		int len = rootIndex-inStart;
		root.setLeftChild(build(preorder, preStart+1, rootIndex, inorder, inStart, rootIndex-1));
		root.setRightChild(build(preorder, rootIndex+1,preEnd,inorder,rootIndex+1,inEnd));
		
		return root;
	}
	
	
	
	
	
	public static void main(String args[]){
		
	}
}
