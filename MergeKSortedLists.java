import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class MergeKSortedLists {
	
	public ListNode mergeKListsWithPriorityQueue(ArrayList<ListNode> lists) {
	
		if(lists.size()==0){
			return null;
		}
		
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>(){
			public int compare(ListNode one, ListNode two){
				return one.val - two.val;
			}
		});
	
		for(ListNode node: lists){
			if(node==null){
				continue;
			}
			pq.offer(node);
		}
		
		ListNode head = null;
		ListNode cur =null;
		ListNode pre = head;
		while(pq.size()!=0){
			
			cur = pq.poll();
			if(cur.next!=null){
				pq.offer(cur.next);
			}
			if(head==null){
				head = cur;
				pre = head;
			}else{
				head.next = cur;
				head = head.next;
			}
		}
			return pre;
    }
	
//	public ListNode mergeKLists(ArrayList<ListNode> lists) {
//		
//		
//		
//	}
	
	
	
	public static void main(String args[]){
		ArrayList<ListNode> store = new ArrayList<ListNode>();
		
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(8);
		store.add(a);
		ListNode b = new ListNode(3);
		b.next = new ListNode(4);
		b.next.next = new ListNode(7);
		store.add(b);
		
		
		MergeKSortedLists solution = new MergeKSortedLists();
		ListNode ans = solution.mergeKListsWithPriorityQueue(store);
		
		ReverseLinkedList.printList(ans);
		
		
	}
}
