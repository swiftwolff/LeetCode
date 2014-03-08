
public class SwapNodeInPairs {
	public static ListNode swapPairs(ListNode head){
		ListNode start = head;
		ListNode tmpone = head.next;
		ListNode tmptwo = head.next.next;
		
		while(tmpone!=null){
			tmpone.next = start;
			start.next=tmptwo.next;
			if (tmptwo.next!=null || tmptwo.next.next!=null){
				tmpone = tmptwo.next.next;
				tmptwo.next.next = tmptwo;
				tmptwo.next = tmpone;
				start = tmpone;
				tmpone = tmpone.next;
				tmptwo=tmpone.next;
			}
			tmptwo.next = tmptwo.next.next;
			tmptwo.next = tmptwo;
//			tmpone.next = tmptwo.next;
//			tmptwo.next = tmpone;
		}
		
		return head;
		
		
	}
}
