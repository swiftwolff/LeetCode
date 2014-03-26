//                                      100.1
//                            45.2                          155.7
//                     34.2       78.9
//
//80 -> 78.9
//32 -> 34.2
//k -> nearest node
//
//class BSTNode{
//	float val;
//	BSTNode left;
//	BSTNode right;
//}
public class IQII {
	
	public static BSTNode nearestNode(BSTNode root, float num){
		
		if (num==root.val){
			return root;
		}
		if (root.left == null && root.right==null){
			return root;
		}
//		float curDiff = Math.abs(num-root.val);
		float rightDiff = Integer.MAX_VALUE;
		float leftDiff = Integer.MAX_VALUE;
		if(root.right != null && num > root.val){ //num > root
			rightDiff = root.right.val - root.val;
		}	
		if(root.left!=null && num < root.val){ //num <= root
			leftDiff = root.val - root.left.val;
		}
//		if(curDiff < Math.min(rightDiff, leftDiff)){
//			return root;
//		}
		BSTNode res = rightDiff > leftDiff? nearestNode(root.left,num):nearestNode(root.right,num);
		return res;
	}
	
	public static void main(String args[]){
		BSTNode d = new BSTNode(34.2f);
		BSTNode e = new BSTNode(78.9f);
		BSTNode b = new BSTNode(45.2f);
		b.left = d;
		b.right = e;
		BSTNode c = new BSTNode(155.7f);
		BSTNode a = new BSTNode(100.1f);
		a.left = b;
		a.right = c;
		
		System.out.println(nearestNode(a,80f).val);
	}
}
