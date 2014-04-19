import java.util.HashMap;


public class ConstructPreorderAndInorderTraversal {
	
	public static TreeNodeI buildTree(int[] preorder, int[] inorder) {
		if(preorder.length==0||inorder.length==0){
			return null;
		}
        HashMap<Integer,Integer> inorderTable = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
        	inorderTable.put(inorder[i],i);
        }
        
        TreeNodeI root = build(inorderTable,preorder,0,inorder,0,inorder.length-1);
		return root;
    }
	
	public static TreeNodeI build(HashMap<Integer,Integer> inorderTable, int[] preorder,int pcur, int[] inorder, int istart, int iend){
		
		if(istart>iend){
			return null;
		}
		TreeNodeI root = new TreeNodeI(preorder[pcur]);
		int end = inorderTable.get(preorder[pcur]);
		
		int len = end-istart;  //WHY WHY WHY WHY!!!!!!
		root.left = build(inorderTable,preorder,pcur+1,inorder,istart,end-1);  //what is pcur here
		root.right = build(inorderTable,preorder,pcur+len+1,inorder,end+1,iend);
		
		return root;
	}
	
	
	
	public static void main(String args[]){
		int[] preorder = {7,10,4,3,1,2,8,11};
		int[] inorder = {4,10,3,1,7,11,8,2};
		
		
		
		
		TreeNodeI res = buildTree(preorder, inorder);
		res.preorderPrint(res);
//		System.out.println(res.val);
//		System.out.println(res.left.val);
//		System.out.println(res.right.val);
//		System.out.println(res.left.left.val);
//		System.out.println(res.left.right.val);
//		System.out.println(res.right.left.val);
//		System.out.println(res.left.right.right.val);
//		System.out.println(res.right.left.left.val);
	}
}
