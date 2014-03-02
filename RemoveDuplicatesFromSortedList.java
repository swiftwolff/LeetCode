
public class RemoveDuplicatesFromSortedList {
public ListNode deleteDuplicates(ListNode head) {
        
        if (head==null||head.next==null){
            return head;
        }
        ListNode cur = head;
        ListNode runner = cur.next;
        
        while(runner!=null){
            while(cur.val==runner.val){
                runner = runner.next;
                if(runner==null){
                    cur.next = runner;
                    return head;
                }
            }
            
            cur.next = runner;
            cur = cur.next;
            runner = runner.next;
        }
        
        return head;
        
    }
}
