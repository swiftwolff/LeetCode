import java.util.HashMap;

public class ConstructBTreeFromPandI {

	public static TreeNodeI buildTree(int[] preorder, int[] inorder) {
		int preLength = preorder.length;//we don't need this! (preEnd)
		int inLength = inorder.length;
		HashMap<Integer,Integer> in = new HashMap<Integer,Integer>();
		for (int i=0;i<inorder.length;i++){
			in.put(inorder[i], i);
		}
		return buildTree(preorder, 0, in, 0, inLength-1);
		}

	public static TreeNodeI buildTree(int[] pre, int preStart, HashMap<Integer,Integer>in, int inStart, int inEnd){
		if(inStart > inEnd){
		return null;
		}
		int rootVal = pre[preStart];
		int rootIndex = in.get(rootVal);

		int len = rootIndex - inStart;
		TreeNodeI root = new TreeNodeI(rootVal);
		root.setLeftChild(buildTree(pre, preStart+1, in, inStart, rootIndex-1));//look at preEnd here
		root.setRightChild(buildTree(pre, preStart+len+1, in, rootIndex+1, inEnd));//look at preStart here
		
		return root;
}
	
	public static void main(String args[]){
		int[] preorder = {7,10,4,3,1,2,8,11};
		int[] inorder = {4,10,3,1,7,11,8,2};
		
		TreeNodeI res = ConstructBTreeFromPandI.buildTree(preorder, inorder);
		
		System.out.println(res.val);
		System.out.println(res.left.val);
		System.out.println(res.right.val);
		System.out.println(res.left.left.val);
		System.out.println(res.left.right.val);
		System.out.println(res.right.left.val);
		System.out.println(res.left.right.right.val);
		System.out.println(res.right.left.left.val);
	}
}
