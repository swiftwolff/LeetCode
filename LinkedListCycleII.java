
public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
        if (head==null){
            return head;
        }

        ListNode start = head;
        ListNode runner = head;
        
        while(runner!=null){
            
            start = start.next;
            if (runner.next!=null){
                runner = runner.next.next;
            }else{
                return null;
            }
            
            if(start == runner){
                start = head;
                while(runner!=start){
                    start = start.next;
                    runner = runner.next;
                }
                
                return start;
            }
            
        }
        return null;
    }
}
