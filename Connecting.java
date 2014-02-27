
public class Connecting {
	public static void connect(TreeNodeI root) {
        
        if (root == null || root.left==null){
            return;
        }
        TreeNodeI start = root;
        start.next = null;
        TreeNodeI anchor = root;
        TreeNodeI first = start.left;
        
        while(anchor.left!=null){
            if(start.next==null){
                first.next = start.right;
                first.next.next = null;
                start = anchor.left;
                anchor = anchor.left;
                first = start.left;
            }else{
                first.next = start.right;
                start = start.next;
                first.next.next = start.left;
                first=start.left;
            }
            
        }
        
        return;
	}
	
	public static void main(String args[]){
		
		TreeNodeI root = new TreeNodeI(1);
		root.setLeftChild(new TreeNodeI(2));
		root.setRightChild(new TreeNodeI(3));
		Connecting.connect(root);
		System.out.println(root.val);
		System.out.println(root.next);
		System.out.println(root.left.val);
		System.out.println(root.left.next);
		System.out.println(root.right.val);
		System.out.println(root.right.next);
		
		
	}
	
	
	
}
