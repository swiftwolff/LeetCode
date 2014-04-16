import java.util.ArrayList;
public class UniqueBinarySearchTreeII {
	
//	public static ArrayList<TreeNode> generateTrees(int n) {
//		ArrayList<TreeNode> res = new ArrayList<TreeNode>();
//		for(int i=1;i<=n;i++){
//			TreeNode root = new TreeNode(i);
//			for(int j=1;j<i;j++){
//				System.out.println("i is" + i);
//				System.out.println("j is" + j);
//				TreeNode left = new TreeNode(j);
//				root.left = left;
//				left.left = generateTreesHelperLeft(root,i-1,1);
//				left.right = generateTreesHelperRight(root,i+1,n);
//				res.add(root);
//			}
//			for(int k=i+1;k<n;k++){
//				TreeNode right = new TreeNode(j);
//				root.right = right;
//				right.left = generateTreesHelperLeft(root,i-1,1);
//				right.right = generateTreesHelperRight(root,i+1,n);
//				res.add(root);
//			}
//
//		}
//		
//		return res;
//	}
	public static ArrayList<TreeNode> generateTrees(int n) {  
        return helper(1, n);  
    } 
	
	public static ArrayList<TreeNode> helper(int left,int right){ //feed 1 and n
		ArrayList<TreeNode> rs = new ArrayList<TreeNode>();
		if(left>right) rs.add(null);
		else if(left==right) rs.add(new TreeNode(left));
		else{
			for(int i=left;i<=right;i++){
				ArrayList<TreeNode> leftNodeSet = helper(left,i-1);
				ArrayList<TreeNode> rightNodeSet = helper(i+1,right);
				
				for(int j=0; j<leftNodeSet.size();j++){  //This is where it takes care of all the possibilities
					for(int k=0;k<rightNodeSet.size();k++){
						TreeNode curr = new TreeNode(i);
						curr.left =leftNodeSet.get(j);  //j(left) stays at 0, right keeps looping
						curr.right = rightNodeSet.get(k);
						rs.add(curr);
					}
				}	
			}
		}
		return rs;
	}
	
	
	
	
//	public  static  ArrayList<TreeNode> generateTrees( int  n) {  
//        return  dfs( 0 , n- 1 );  
//    }  
//      
//    public  static  ArrayList<TreeNode> dfs( int  begin,  int  end){  
//        ArrayList<TreeNode> ret =  new  ArrayList<TreeNode>();  
//        if (begin > end){  
//            ret.add( null );        
//            return  ret;  
//        }  
//          
//        for ( int  i=begin; i<=end; i++){  
//            ArrayList<TreeNode> left = dfs(begin, i- 1 );    
//            ArrayList<TreeNode> right = dfs(i+ 1 , end);  
//              
//            for ( int  j= 0 ; j<left.size(); j++){          
//                for ( int  k= 0 ; k<right.size(); k++){  
//                    TreeNode root =  new  TreeNode(i+ 1 );    
//                    root.left = left.get(j);  
//                    root.right = right.get(k);  
//                    ret.add(root);  
//                }  
//            }  
//        }  
//        return  ret;  
//    }  
	
	
	public static void main(String args[]){
		System.out.println(generateTrees(3));
	}
}
