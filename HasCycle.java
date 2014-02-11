
public class HasCycle {
	
	public static boolean hasCycle(ListNode head) {
		ListNode start;
        ListNode runner;
		
        if (head ==null || head.next == null){
            return false;
        }
        
        if (head.next.next != null){
            start = head;
            runner = head.next.next;
        }else{
            return false;
        }
        
        while (runner != null){
            
            if (start.val == runner.val){
                return true;
            }
            start = start.next;
            if (runner.next == null){
                return false;
            }
            
            runner = runner.next.next;
        }
        
        return false;
        
    }
	 
	 public static void main(String args[]){
		 
		 ListNode n = null;
		 System.out.print(HasCycle.hasCycle(n));
		 
	 }
	 
	 
}
