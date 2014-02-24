
public class ReverseLinkedList {
	
	public static ListNode reverse(ListNode head){
		
		ListNode tmp = head.next;
		ListNode tmptwo = head.next.next;
		ListNode tmpthree = head;
		
		while(tmptwo != null){
			tmp.next = head;
			
			head = tmp;
			tmp = tmptwo;
			tmptwo = tmptwo.next;
		}
		
		tmp.next = head;
		tmpthree.next = null;
		
		return tmp;
	}
	
	public static void printList(ListNode head){
		while (head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	
	public static void main(String args[]){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ReverseLinkedList.printList(head);
		
		ReverseLinkedList.printList(ReverseLinkedList.reverse(head));
		
		
		
	}
	
	
	
	
}
