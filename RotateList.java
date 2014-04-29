
public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
	       
        if(head==null){
            return null;
        }
        if(n==0){
        	return head;
        }
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode cur = head;    
        ListNode runner = null; 
        
        int checkCnt = 0;
        
        ListNode preCheck = new ListNode(-1);
        preCheck.next = head;
        while(preCheck.next!=null){
        	preCheck = preCheck.next;
        	checkCnt++;
        }
        if(checkCnt < n){
        	n%=checkCnt;
        }
        
        int count = 0; 
        while(cur!=null){
            runner = cur;
            while(runner.next!=null && count < n){
                runner=runner.next;
                count++;
                if(runner.next==null && count < n){
                	return head;
                }
                
            }
            if(runner.next==null){
                break;
            }
            cur = cur.next;
            count = 0;
        }
        
        ListNode front = cur.next;
        if (front==null) return head;
        runner.next = prev.next;
        cur.next = null;
        
        return front;
    }
//	public  ListNode rotateRight(ListNode head,  int  n) {  
//        if (head ==  null ){  
//            return  null ;  
//        }  
//        ListNode back = head;  
//        ListNode front = head;  
//        ListNode end = head;  
//          
// 
//        while (front.next !=  null ){  
//            front = front.next;  
//        }  
//        end = front;         
//        front.next = head;     
//        front = head;      
//          
//
//        for ( int  i= 0 ; i<n; i++){  
//            front = front.next;  
//        }  
//          
//
//        while (front != end){  
//            front = front.next;  
//            back = back.next;  
//        }  
//          
//        ListNode rotateHead = back.next;       
//        back.next =  null ;     
//        return  rotateHead;  
//    }  
	public static void main(String args[]){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		
		RotateList solution = new RotateList();
		ListNode newhead = solution.rotateRight(head, 5);  //1 == 6, 2 == 7
		ReverseLinkedList.printList(newhead);
		
	}
	
	
}
