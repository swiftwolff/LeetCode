
public class AddTwoNumbers {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }     
        return addTwoNumbersHelper(l1,l2,0);       
    }
    public static ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry){
        if(l1==null||l2==null){
            if(l1==null&&l2==null){
                if (carry>0){
                    return new ListNode(carry);
                }else{
                    return null;
                }
            }
            ListNode sum = new ListNode(l1==null?l2.val+carry:l1.val+carry);
            sum.next = l1==null?l2.next:l1.next;
            if(sum.val>9){
                sum.val = sum.val-10;
                carry=1;
                if(sum.next==null){
                	sum.next = new ListNode(1);
                }else{
                	sum.next = addTwoNumbersHelper(sum.next,null,carry);
                }
            }
            return sum;
        }
        ListNode sum = new ListNode(l1.val+l2.val+carry);
        if(sum.val>9){
            sum.val = sum.val-10;
            carry=1;
        }else{
            carry=0;
        }
        sum.next = addTwoNumbersHelper(l1.next,l2.next,carry);
        return sum;
    }
	
	public static void main(String args[]){
		ListNode a = new ListNode(8);
		a.next = new ListNode(9);
		a.next.next = new ListNode(9);
		
		ListNode b = new ListNode(2);
//		b.next = new ListNode(6);
//		b.next.next = new ListNode(9);
		
		ListNode sum = addTwoNumbers(a,b);
		while(sum!=null){
			System.out.println(sum.val);
			sum = sum.next;
		}
		
	}
}
