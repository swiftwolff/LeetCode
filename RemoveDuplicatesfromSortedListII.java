
public class RemoveDuplicatesfromSortedListII {
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		ListNode cur;
		ListNode prev = new ListNode(-1);
		prev.next = head;
		ListNode preHead = prev;
		while(prev!=null && prev.next!=null){
			cur = prev.next;
			if(cur==null||cur.next==null){
				return preHead.next;
			}
			if(cur.val == cur.next.val){
				ListNode end = cur;
				while(end != null && end.next!=null && end.val == end.next.val){
					end = end.next;
				}
				prev.next = end.next;
			}else{
				prev = prev.next;
			}

		}
		
		return preHead.next;
    }
	
	public static void main(String args[]){
		ListNode head = new ListNode(1);
//		head.next = new ListNode(1);
//		head.next.next = new ListNode(1);
//		head.next.next.next = new ListNode(2);
//		head.next.next.next.next = new ListNode(2);
//		head.next.next.next.next.next = new ListNode(5);
		ListNode newhead = deleteDuplicates(head);
//		System.out.println();
		while(newhead!=null){
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
	}
}
