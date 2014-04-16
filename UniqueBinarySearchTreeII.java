import java.util.ArrayList;


public class UniqueBinarySearchTreeII {
	
//	public static ArrayList<TreeNode> generateTrees(int n) {
//		ArrayList<TreeNode> res = new ArrayList<TreeNode>();
//		for(int i=1;i<=n;i++){
//			TreeNode root = new TreeNode(i);
//			for(int j=n;j>0;j--){
//				root.left = generateTreesHelper(1,i-1,n);
//				root.right = generateTreesHelper(1,j,n);
//				res.add(root);
//			}
//		}
//		
//		return res;
//	}
//	    
//	public static TreeNode generateTreesHelper(int startStop, int endStop,int start, int end){
//	        
//	        if(start<=startStop||start>end){
//	        	return null;
//	        }
//	        
//	        TreeNode root = new TreeNode(start);
//	        root.left = generateTreesHelper(1,start-1,start);
//	        root.right = generateTreesHelper(start,start+1,end);
//	        return root;
//	}
	
	public  static  ArrayList<TreeNode> generateTrees( int  n) {  
        return  dfs( 0 , n- 1 );  
    }  
      
    public  static  ArrayList<TreeNode> dfs( int  begin,  int  end){  
        ArrayList<TreeNode> ret =  new  ArrayList<TreeNode>();  
        if (begin > end){  
            ret.add( null );        
            return  ret;  
        }  
          
        for ( int  i=begin; i<=end; i++){  
            ArrayList<TreeNode> left = dfs(begin, i- 1 );    
            ArrayList<TreeNode> right = dfs(i+ 1 , end);  
              
            for ( int  j= 0 ; j<left.size(); j++){          
                for ( int  k= 0 ; k<right.size(); k++){  
                    TreeNode root =  new  TreeNode(i+ 1 );    
                    root.left = left.get(j);  
                    root.right = right.get(k);  
                    ret.add(root);  
                }  
            }  
        }  
        return  ret;  
    }  
	
	
	public static void main(String args[]){
		System.out.println(generateTrees(3));
	}
}
