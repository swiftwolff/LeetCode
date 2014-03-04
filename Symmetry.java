import java.util.LinkedList;
import java.util.Queue;

class Symmetry{
	public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        Queue<TreeNode> qone = new LinkedList<TreeNode>();
        Queue<TreeNode> qtwo = new LinkedList<TreeNode>();
        qone.add(root);
        qtwo.add(root);
        
        return check(root,qone,qtwo);
        
    }
    
    public boolean check(TreeNode root, Queue<TreeNode> qone, Queue<TreeNode> qtwo){
        while(!qone.isEmpty()&&!qtwo.isEmpty()){
            TreeNode rootone = qone.remove();
            TreeNode roottwo = qtwo.remove();
            
            if(rootone==null||roottwo==null){
                if(rootone!=null||roottwo!=null){
                    return false;
                }
            }else{
                if(rootone.val!=roottwo.val){
                    return false;
                }
                qone.add(rootone.left);
                qtwo.add(roottwo.right);
                qone.add(rootone.right);
                qtwo.add(roottwo.left);
            }
        }
        
        return true;
    }
	public static void main(String args[]){
		
	}
}
