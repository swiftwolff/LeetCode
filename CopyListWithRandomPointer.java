import java.util.HashMap;


public class CopyListWithRandomPointer {
	
	public RandomListNode copyRandomList(RandomListNode head) {
        
		if(head==null){
			return null;
		}
	
		HashMap<Integer,RandomListNode> table = new HashMap<Integer,RandomListNode>();
		RandomListNode cur = head;
		RandomListNode prev = new RandomListNode(-1);
		RandomListNode prevHead = prev;
//		RandomListNode clone = null;
		
		while(cur!=null){
			RandomListNode clone = new RandomListNode(cur.label);
			prev.next = clone;
			table.put(clone.label,clone);
			cur = cur.next;
			prev = prev.next;
		}
		
		cur = head;
		prev = prevHead.next;
		
		while(cur!=null){
			if(cur.random!=null){
				prev.random = table.get(cur.random.label);
			}else{
				prev.random = null;
			}
			prev = prev.next;
			cur = cur.next;
		}
		
		return prevHead.next;
    }
	

	public static void main(String args[]){
		RandomListNode head = new RandomListNode(3);
		head.next = new RandomListNode(4);
		head.next.next = new RandomListNode(5);
		CopyListWithRandomPointer solution = new CopyListWithRandomPointer();
		RandomListNode newhead = solution.copyRandomList(head);
		while(newhead!=null){
			System.out.println(newhead.label);
			newhead = newhead.next;
		}
		
		
	}
}
