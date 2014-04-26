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
	
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		
		if (lists.size()==0){
			return null;
		}
		
		return divider(lists,0,lists.size()-1);
	}
	
	public ListNode divider(ArrayList<ListNode> lists, int start, int end){	
		if(start >= end){
			return lists.get(start);
		}
		int mid = (start + end)/2;
		ListNode ans= merge(divider(lists,start,mid),divider(lists,mid+1,end));

		return ans;
	}
	
	public ListNode merge(ListNode a, ListNode b){
		
		if(a==null&&b==null){
			return null;
		}
		if(a==null||b==null){
			return a==null?b:a;
		}
		
		ListNode one = a;
		ListNode two = b;
		ListNode prev = new ListNode(-1);
		ListNode head = prev;
		while(one!=null && two!=null){	
			
			if(one.val <= two.val){
				prev.next = one;
				one = one.next;
				prev = prev.next;
			}else{
				prev.next = two;
				two = two.next;
				prev = prev.next;
			}
			
		}	
		
		prev.next = one==null?two:one;
		
		return head.next;
	}
	
	
	
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
//		ListNode c = solution.merge(a, b);
		ReverseLinkedList.printList(ans);
		
		
	}
}
