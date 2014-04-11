import java.util.ArrayList;


public class PathSumII {
	
	public static ArrayList<ArrayList<Integer>> pathSum(TreeNodeI root, int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root==null){
			return res;
		}
		ArrayList<Integer> record = new ArrayList<Integer>();
		pathSumHelper(root,sum,0,record,res);
		return res;
    }
	
	public static void pathSumHelper(TreeNodeI root, int sum, int acc, ArrayList<Integer> record, ArrayList<ArrayList<Integer>> res){
		
		if(root.left==null & root.right==null){
			if(acc+root.val==sum){
				record.add(root.val);
				res.add(record);
			}
			return;
		}
		record.add(root.val);
		
		if(sum > 0 && acc+root.val>sum){
			return;
		}
		if(sum < 0 && acc+root.val<sum){
			return;
		}
		if(root.left!=null){
			pathSumHelper(root.left,sum,acc+root.val,record,res);
		}
		if(root.right!=null){
			pathSumHelper(root.right,sum,acc+root.val,record,res);
		}

		return;
	}
	
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(root == null)
            return list;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        list = findPath(list, tmp, root, sum);
        return list;
        
    }
    
    public ArrayList<ArrayList<Integer>> findPath(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> tmp, TreeNode node, int sum) {
        
        if(node == null) {
           return list;
        }
        
        tmp.add(node.val);
        int nodeSum = sum - node.val;
        if((nodeSum == 0) && (node.left == null) && (node.right == null)) {
            ArrayList<Integer> tmp1 = new ArrayList<Integer>(tmp);
            list.add(tmp1);
        } 
   
        findPath(list, tmp, node.left, nodeSum);
        findPath(list, tmp, node.right, nodeSum);
        if(tmp.size() > 0) 
            tmp.remove(tmp.size() - 1);
        return list;    
        
    }
	public static void main(String args[]){
		TreeNodeI root = new TreeNodeI(-2);
		root.setRightChild(new TreeNodeI(-3));
//		root.setLeftChild(new TreeNodeI(-2));
//		root.setRightChild(new TreeNodeI(3));
//		root.setLeftChild(new TreeNodeI(2));
//		root.left.setLeftChild(new TreeNodeI(3));
//		root.left.left.setLeftChild(new TreeNodeI(4));
//		root.left.left.setRightChild(new TreeNodeI(9));
//		root.left.left.left.setLeftChild(new TreeNodeI(5));
//		root.left.left.left.left.setLeftChild(new TreeNodeI(6));
		
//		root.setRightChild(new TreeNodeI(2));
//		root.right.setRightChild(new TreeNodeI(3));
//		root.right.right.setRightChild(new TreeNodeI(4));
//		root.right.right.right.setRightChild(new TreeNodeI(5));
//		root.right.right.right.setRightChild(new TreeNodeI(5));
//		root.left.left.left.left.setLeftChild(new TreeNodeI(6));
		System.out.println(pathSum(root, -5));
	}
}
