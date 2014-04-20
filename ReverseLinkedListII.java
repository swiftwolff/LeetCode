
public class ReverseLinkedListII {
	
	public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head==null || head.next==null){
            return head;
        }
        
        ListNode preHead=new ListNode(0);  //add a pre Node
        preHead.next=head;
        
        ListNode pre=preHead;
        ListNode current=head;
        ListNode end=head;
        
        int countM=1;
        int countN=1;
        // find M point and N point
        while (countM<m || countN<n ){  //set up the window to reverse here
            if (countM<m){
                pre=pre.next;
                current=current.next;
                countM++;
            }
            
            if (countN<n){
                end=end.next;
                countN++;
            }
        }
        
        // reverse from M point to N Point
        reverse(pre, end.next);
        return preHead.next;
        
    }
    
    private static void reverse(ListNode pre, ListNode endNext){
        ListNode cur=pre.next;
        
        while (cur.next!=endNext){
            
            ListNode next=cur.next;  //next jumps forward
            ListNode temp=pre.next;  //temp jumps forward too
            pre.next=next;  //keep updating to new next (jumps over cur) (pre stays)
            cur.next=next.next;  //keep updating (jumps over next) (cur stays)
            
            next.next=temp;
            
        }
    }
	
	public static void main(String args[]){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		

		ListNode newhead = reverseBetween(head,2,4);
//		System.out.println(newhead.val);
//		System.out.println(newhead.next.val);
//		System.out.println(newhead.next.next.val);
//		System.out.println(newhead.next.next.next.val);
//		System.out.println(newhead.next.next.next.next.val);

		ReverseLinkedList.printList(newhead);
//		System.out.println(reverseBetween(head,2,4));
	}
}
