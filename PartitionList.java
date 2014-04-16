
public class PartitionList {
	
	public static ListNode partition(ListNode head, int x) {  //cheating code, not O(n) solution
        ListNode cur = head;
        ListNode tmp;
        while(cur!=null){
            if(cur.val >= x){
            	if(cur.next!=null){
            		tmp = cur.next;
            	}else{
            		tmp = cur;
            	}
                
                while(tmp!=null&&tmp.val >=x){
                    tmp = tmp.next;
                }
                if(tmp!=null){
                	swap(cur,tmp);
                }        
            }       
            cur = cur.next;
        }     
        return head;
    }
	public static void swap(ListNode one, ListNode two){
        int tmp = one.val;
        one.val = two.val;
        two.val = tmp;
    }
	
	public static void main(String args[]){
		ListNode head = new ListNode(2);
		head.next = new ListNode(3);
		head.next.next = new ListNode(1);
//		head.next.next.next = new ListNode(2);
//		head.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next = new ListNode(2);
		partition(head,2);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		
		
		
	}
}
