import java.util.LinkedList;
import java.util.Queue;
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      
      public void insert(TreeNode[] arry,TreeNode root){
    	  Queue<TreeNode> q = new LinkedList<TreeNode>();
    	  int i = 0;
    	  q.add(root);
    	  while(i < arry.length && !q.isEmpty()){
    		  root = q.remove();
    		  if (root.left == null){
    			  root.left = arry[i];
    			  i++;
    			  q.add(root.left);
    		  }else{
    			  q.add(root.left);
    		  }
    		  if (root.right ==null){
    			  root.right = arry[i];
    			  i++;
    			  q.add(root.right);
    		  }else{
    			  q.add(root.right);
    		  }
    		  
    	  }
    	  

      }
      
      public void inorder(TreeNode root){
    	  if (root ==null){
    		  return;
    	  }
    	  
    	  inorder(root.left);
    	  System.out.print(root.val);
    	  inorder(root.right);
    	  
      }
      
	  public void flip(TreeNode a){
	        if (a==null){
	            return;
	        }
	        TreeNode t = a.left;
	        a.left = a.right;
	        a.right = t;
	        
	        flip(a.left);
	        flip(a.right);
	    }
	  
		public static boolean isSame(TreeNode a, TreeNode b){
//			System.out.println(a.data);
//        	System.out.println(b.data);
	        if (a==null || b==null){
//	        	System.out.println("Hi");
	            return a==null && b==null;
	        }
	        if (a.val!=b.val){
	        	return false;
	        }
	        
	        return isSame(a.left,b.left) && isSame(a.right,b.right);
	    }
      
      public static void main(String args[]){
    	  TreeNode a = new TreeNode(1);
    	  TreeNode b = new TreeNode(2);
    	  TreeNode c = new TreeNode(2);
    	  TreeNode d = null;
    	  TreeNode e = new TreeNode(3);
    	  TreeNode f = null;
    	  TreeNode g = new TreeNode(3);
    	  TreeNode[] t = {b,c,d,e,f,g};
    	  a.insert(t, a);
    	  a.flip(a.right);
//    	  System.out.println(a.val);
//    	  System.out.println(a.left.val);
//    	  System.out.println(a.right.val);
//    	  System.out.println(a.left.right.val);
//    	  System.out.println(a.right.right.val);
    	  System.out.println(TreeNode.isSame(a.left, a.right));
    	  
      }
      
 }
