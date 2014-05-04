import java.util.Stack;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
        	return root.val;
        }
        Stack<Integer> stack = new Stack<Integer>();
        return sumNumbersHelper(root,0,stack);
        
    }
    
    public int sumNumbersHelper(TreeNode root, int sum, Stack<Integer> stack){
        
        if(root.left ==null && root.right==null){
        	return stack.pop()*10+root.val;
        }
        
        int left = 0;
        int right = 0;
        if(root.right==null){
        	if(stack.isEmpty()){
        		stack.add(root.val);
        		left=sumNumbersHelper(root.left,sum,stack);
        	}else{
        		int newSum = stack.pop()*10 + root.val;
            	stack.add(newSum);
            	left=sumNumbersHelper(root.left,sum,stack);
        	}
        }
        
        if(root.left==null){
        	if(stack.isEmpty()){
        		stack.add(root.val);
        		right=sumNumbersHelper(root.right,sum,stack);
        	}else{
        		int newSum = stack.pop()*10 + root.val;
            	stack.add(newSum);
            	right=sumNumbersHelper(root.right,sum,stack);
        	}
        }
        
        if(root.left!=null && root.right!=null){
        	
        	if(!stack.isEmpty()){
        		int newSum = stack.pop()*10 + root.val;
        		stack.add(newSum);
        		stack.add(newSum);
        	}else{
        		stack.add(root.val);
        		stack.add(root.val);
        	}
        	left=sumNumbersHelper(root.left,sum,stack);
        	right=sumNumbersHelper(root.right,sum,stack);
        }
    	
    	return left+right;
    }
    
    public static void main(String args[]){
    	
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.left.left = new TreeNode(3);
    	root.left.right = new TreeNode(4);
    	root.right = new TreeNode(5);
    	root.right.right = new TreeNode(6);
    	
    	SumRootToLeafNumbers solution = new SumRootToLeafNumbers();
    	System.out.println(solution.sumNumbers(root));
    	
    	
    }
    
}
