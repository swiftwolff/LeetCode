
public class PopulatingNextRightPointersInEachNodeII {
	public static void connect(TreeLinkNode root) {
        
        if(root==null){
            return;
        }
        TreeLinkNode cur = root;
        while(cur!=null){
            TreeLinkNode firstNode = null;
            TreeLinkNode prev = null;
            
            while(cur!=null){
                if(firstNode==null){
                    firstNode = cur.left==null?cur.right:cur.left;
                }
                if(cur.left!=null){
                    if(prev!=null){
                        prev.next = cur.left;
                    }
                    prev = cur.left;
                }
                if(cur.right!=null){
                    if(prev!=null){
                        prev.next = cur.right;
                    }
                    prev = cur.right;
                }
                
                cur = cur.next;
                
            }

            cur = firstNode;
        }
        return;
    }

	public static void main(String args[]){
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		connect(root);
	}
}
