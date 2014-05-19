
public class ReverseLinkedList {
	
	public static ListNode reverse(ListNode head){
		
		if(head==null){
            return null;
        }
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode cur = head;
        
        while(cur.next!=null){
            ListNode next = cur.next;
            ListNode temp = prev.next;
            prev.next = next;
            cur.next = next.next;
            next.next = temp;
        
        }
        
        return prev.next;
	}
	
	public static void printList(ListNode head){
		while (head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	
	public static void main(String args[]){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		
//		ReverseLinkedList.printList(head);
		
		ReverseLinkedList.printList(ReverseLinkedList.reverse(head));
		
		
		
	}
	
	
	
	
}
