
public class ReverseNodesInKGroup {
	
	public static ListNode reverseKGroup(ListNode head, int k) {  
		if(head==null||head.next==null){
			return head;
		}
		if(k==1){
			return head;
		}
		ListNode prev = new ListNode(-1);
		prev.next = head;
		int count = 1;
		ListNode prevHead = prev;
		
		while(prev!=null&&prev.next!=null){
			ListNode start = prev;
			ListNode temp = prev.next;
			ListNode cur = start;
			ListNode end;
			while(count%(k+1)!=0 && cur!=null){
				cur=cur.next;
				count++;
			}
			if(cur==null){
				break;
			}
			end = cur.next;
			reverse(start,end);
			prev = temp;
			count++;
		}
		
		return prevHead.next;
    }
	
	public static ListNode reverse(ListNode start, ListNode end){
		ListNode tmp = start;
		ListNode cur = start.next;
		while(cur!=end && cur.next!=end){
			ListNode temp = start.next;
			ListNode next = cur.next;
			
			start.next = next;
			cur.next = next.next;
			next.next = temp;
		}
		return tmp;
	}
	
	public static void main(String args[]){
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
//		a.next.next = new ListNode(3);
//		a.next.next.next = new ListNode(4);
//		a.next.next.next.next = new ListNode(5);
//		a.next.next.next.next.next = new ListNode(6);
//		ListNode pre = new ListNode(-1);
//		pre.next = a;
//		ReverseLinkedList.printList(reverse(pre,a.next.next.next));
		ListNode newhead = reverseKGroup(a,2);
		ReverseLinkedList.printList(newhead);

		
	}
}
