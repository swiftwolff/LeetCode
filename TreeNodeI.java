
public class TreeNodeI {
	int val;
	TreeNodeI left;
	TreeNodeI right;
	TreeNodeI next;
	TreeNodeI parent;
	TreeNodeI(int num){
		val = num;
	}
	
	public void setLeftChild(TreeNodeI node){
		left = node;
		left.parent = this;
	}
	
	public void setRightChild(TreeNodeI node){
		right = node;
		right.parent = this;
	}
	
	public static void main(String args[]){
		
		TreeNodeI root = new TreeNodeI(1);
		
		root.setLeftChild(new TreeNodeI(2));
		root.setRightChild(new TreeNodeI(3));
		
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
	}
	
}
