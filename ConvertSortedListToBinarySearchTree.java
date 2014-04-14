
public class ConvertSortedListToBinarySearchTree {
	
	public static TreeNodeI sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return new TreeNodeI(head.val);
        }
        
        ListNode last =head;
        ListNode mid = head;
        ListNode runner = head;
        
        while(runner.next!=null){
            runner=runner.next.next;
            last = mid;
            mid = mid.next;
            if(runner==null){
            	break;
            }
        }
        
        TreeNodeI root = new TreeNodeI(mid.val);
        ListNode right = mid.next;
        root.right = sortedListToBST(right);
        last.next = null;
        ListNode left = head;
        root.left = sortedListToBST(left);
        
        return root;
    }
	public static void main(String args[]){
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
		TreeNodeI root = sortedListToBST(head);
		root.preorderPrint(root);
		
		
	}
}
