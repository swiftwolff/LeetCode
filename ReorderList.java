
public class ReorderList {
	
	public static void reorderList(ListNode head){
		if(head==null||head.next==null) return;

		ListNode firstprev = new ListNode(-1);
		firstprev.next = head;
		ListNode second = head;
		
		ListNode runner = head;
		while(runner!=null&&runner.next!=null){
			firstprev = firstprev.next;
			second = second.next;
			runner = runner.next.next;
			
		}
		
		firstprev.next = null;
		ListNode first = head;
		
		ListNode secondRev = reverseList(second);
		ListNode res = new ListNode(-1);
		while(first!=null || secondRev!=null){
			if(first==null){
				res.next = secondRev;
				secondRev = secondRev.next;
				res = res.next;
				continue;
			}
			if(secondRev==null){
				res.next = first;
				first = first.next;
				res = res.next;
				continue;
			}
			
			res.next = first;
			first = first.next;
			res = res.next;
			res.next = secondRev;
			secondRev = secondRev.next;
			res = res.next;
		}
		
	return;
	}
	
	public static ListNode reverseList(ListNode head){
		if (head==null) return null;
		ListNode prev = new ListNode(-1);
		prev.next = head;
		ListNode cur = head;
		while(cur.next!=null){
			ListNode next = cur.next;
			ListNode tmp = prev.next;
			prev.next = next;
			cur.next = next.next;
			next.next = tmp;
		}
		return prev.next;
	}
	
	public static void main(String args[]){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
//		a.next.next = c;
//		a.next.next.next =d;
//		a.next.next.next.next = e;
		
		reorderList(a);
		
		while(a!=null){
			System.out.println(a.val);
			a=a.next;
		}
		
		
	}
}
