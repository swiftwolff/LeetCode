
public class RemoveNthNodeFromEndofList {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(n==0){
			return head;
		}
        ListNode cur = head;
        ListNode runner=head;
        int count = 1;
        while(count<n){
        	runner = runner.next;
        	count++;
        }
//        System.out.println(runner.val);
        while(runner!=null){
        	if(runner.next==null){
        		head = cur.next;
        		cur = null;
        		runner=runner.next;
        	}else if(runner.next.next==null){
        		cur.next=cur.next.next;
        		runner = null;
        	}else{
        		cur = cur.next;
        		runner = runner.next;
        	}
        }
        
		return head;
    }
	
	
	
	public static void main(String args[]){
		ListNode tmp = new ListNode(1);
		ListNode head = tmp;
		for(int i=2;i<6;i++){
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		
		ListNode newhead = removeNthFromEnd(head, 5);
		
		//print
		while(newhead!=null){
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
		
		
	}
}
