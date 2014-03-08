import java.util.ArrayList;


public class BinaryTreeLevelOrderTraversalBottomUp {
	public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        
        ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> reverseLst = new ArrayList<ArrayList<Integer>>();
        if (root==null){
            return lst;
        }
        buildList(root,0,lst);
        System.out.println(lst);
        for(int i=lst.size()-1;i>-1;i--){
            reverseLst.add(lst.get(i));
        }
        
        return reverseLst;
        
    }
    
    public static void buildList(TreeNode root, int level, ArrayList<ArrayList<Integer>> lst){
        if (root ==null){
            return;
        }
        if (lst.size()<=level){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(root.val);
            lst.add(tmp);
            System.out.println("Got here!");
        }else{
            lst.get(level).add(root.val);
        }
        
        buildList(root.left,level+1,lst);
        buildList(root.right,level+1,lst);
        
    }
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		
//		root.setLeftChild(new TreeNode(2));
//		root.setRightChild(new TreeNode(3));
		System.out.println(levelOrderBottom(root));
	}
}
