public class SortList{


	public static ListNode sortList(ListNode head){

		if(head==null||head.next==null) return head;

		ListNode runner = head;
		ListNode cur = head;
		ListNode preCur = new ListNode(-1);
		preCur.next = head;

		while(runner!=null&&runner.next!=null){
			runner=runner.next.next;
			cur = cur.next;
			preCur = preCur.next;
		}

		preCur.next = null;
		ListNode first = head;
		ListNode second = cur;
		
		ListNode left = sortList(first);
		ListNode right = sortList(second);

		ListNode res = merge(left,right);

		return res;	

	}

	public static ListNode merge(ListNode one, ListNode two){

		if(one==null||two==null) return one==null?two:one;
		
		ListNode res = new ListNode(-1);
		
		ListNode dummy = res;
		while(one!=null || two!=null){
		
			if(one==null){
				res.next = two;
				two = two.next;
				res = res.next;
				continue;
			}

			if(two==null){
				res.next = one;
				one = one.next;
				res = res.next;
				continue;

			}
			
			if(one.val < two.val){
				res.next = one;
				one = one.next;
				res = res.next;
			}else{
				res.next = two;
				two = two.next;
				res = res.next;
			}

		}
		
		return dummy.next;

	}

	public static void main(String args[]){

		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(1);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		a.next.next = c;
		a.next.next.next = d;
		a.next.next.next.next = e;

		ListNode res = sortList(a);

		while(res!=null){
			System.out.println(res.val);
			res = res.next;
		}

	}		



}
