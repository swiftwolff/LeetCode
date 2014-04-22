
public class SwapNodesInPairs {
	
	public static ListNode swapPairs(ListNode head) {
      
		if(head==null||head.next==null){
			return head;
		}
		
		ListNode cur = head;
		ListNode prev = new ListNode(-1);
		ListNode preHead = prev;  //if pre moves, we need another variable to store original pre
		prev.next = head;
		
		while(cur!=null && cur.next!=null){
			ListNode next = cur.next;
			ListNode temp = prev.next;
			
			prev.next = next;
			cur.next = next.next;
			next.next = temp;
			
			prev = cur;
			cur = cur.next;
			
		}
		
		return preHead.next;  //another variable
		
    }

	public static void main(String args[]){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode newhead = swapPairs(head);
		ReverseLinkedList.printList(newhead);
	}
}
