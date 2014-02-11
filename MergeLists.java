public class MergeLists {

	    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode tmp=null;
	        ListNode i = l1;
	        ListNode j = l2;
	        
	        if (l1==null||l2==null){
	            return (l1==null)? l2:l1;
	        }
	        
	        while (i!=null && j !=null){
	            if (less(i,j)){
	                
	                    tmp = i;
	                    i = i.next;
	                    if (i==null){
	                        tmp.next = j;
	                    }
	                
	            }else{
	                if(tmp ==null){
	                    tmp = j;
	                }else{
	                    tmp.next = j;
	                    tmp = j;
	                }
	                j = j.next;
	                if (j==null){
	                    tmp.next = i;
	                }
	                
	            }
	        }
	        
	        if (less(l1,l2)){
	            return l1;
	        }
	        
	        return l2;
	        
	    }
	    
	    public static boolean less(ListNode i, ListNode j){
	        if (i.val <= j.val){
	            return true;
	        }
	        return false;
	    }
	    
	    public static void main(String args[]){
	    	ListNode a = new ListNode(1);
	    	ListNode b = new ListNode(2);
	    	
	    	System.out.println(MergeLists.mergeTwoLists(b, a).next.val);
	    	
	    }
}
