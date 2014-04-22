
public class PartitionList {
	
	public static ListNode partition(ListNode head, int x) {  //cheating code, not O(n) solution
        
		if(head==null||head.next==null){
			return head;
		}
		ListNode prev = new ListNode(-1);
		prev.next = head;
		ListNode prevHead = prev;
		ListNode cur;
		
		while(prev!=null){
			
			cur = prev.next;
			
			if(cur!=null && cur.val > x){
				ListNode move = cur.next;
				ListNode movelast = cur.next;
				while(move!=null && move.val >= x){
					movelast = move;
					move = move.next;
				}
				if(move!=null){
					prev.next = move;
					movelast.next = move.next;
					move.next = cur;
					
				}else{
					return prevHead.next;
				}
				
			}else{
				prev = prev.next;
				
			}
		}
		return prevHead.next;
		
    }
	
	
	public static void main(String args[]){
		System.out.println("Hi");
		ListNode head = new ListNode(3);
		head.next = new ListNode(1);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(2);
//		head.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next = new ListNode(2);
		ListNode newhead = partition(head,2);
		
		while(newhead!=null){
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
		
		
		
	}
}
