
public class InsertionSortList {
	
	public static ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode zero = new ListNode(0);
        zero.next = head;
        ListNode cur = head;
        
        while(cur!=null && cur.next!=null){
        	ListNode next = cur.next;
        	if(next.val<cur.val){
        		ListNode temp = zero.next;
        		zero.next = next;
        		cur.next = next.next;
        		next.next = temp;
        		cur = zero.next; //go back to the beginning;
        	}else{
        		cur = cur.next;
        	}
        } 
        return zero.next;
    }
	
	public static void main(String args[]){
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
//		head.next.next.next.next = new ListNode(1);
		
		ListNode newhead = insertionSortList(head);
//		System.out.println(head.next.val);
		ReverseLinkedList.printList(newhead);
	}
}
