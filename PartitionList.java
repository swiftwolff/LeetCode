
public class PartitionList {
	
	public static ListNode partition(ListNode head, int x) {
		//use two ListNode to separate left and right, and connect them together in the end
        if (head==null || head.next==null){
            return head;
        }
        // leftSide 
        ListNode preLeftHead=new ListNode (-1);
        ListNode leftEnd=preLeftHead;
        
        // rightSide
        ListNode preRightHead=new ListNode(-1);
        ListNode rightEnd=preRightHead;
        
        ListNode run=head;
        
        while (run!=null){
            ListNode temp=run.next;
            
            if (run.val<x){
                leftEnd.next=run;
                leftEnd=leftEnd.next;
            }
            else{
                rightEnd.next=run;
                rightEnd=rightEnd.next;
                
            }
            
            run.next=null;
            run=temp;
        }
        
        // connect left and right
        leftEnd.next=preRightHead.next;
        
        return preLeftHead.next;
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
