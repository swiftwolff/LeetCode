
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		
		if (l1==null||l2==null){
            return l1==null?l2:l1;
        }
		
		ListNode headone = l1;
		ListNode headtwo = l2;
		ListNode tmpone = null;
		ListNode tmptwo = null;
		int h = 0;
		if (l1.val<l2.val){
			h=0;
		}else{
			h=1;
		}
		while(headone!=null && headtwo!=null){
			if (headone.val<=headtwo.val){
				while(headone.val<=headtwo.val&&headone!=null){
					tmpone = headone;
					headone=headone.next;
				}
				tmpone.next = headtwo;
			}
			else{
				while(headone.val>headtwo.val&&headtwo!=null){
					tmptwo = headtwo;
					headtwo = headtwo.next;
				}
				tmptwo.next = headone;
			}
		}
		
		if (h==0){
			return l1;
		}
		return l2;
	}
}
