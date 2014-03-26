
public class IQIII {
//	aaac,
//	aaad,
//	aae
//
//	=> рaaс
//
//	//find the longest prefix
//	public String findLongestPrefix(String []strs){
//		if(strs==null || strs.length==0){
//			return рс;
//		}
//		String result=strs[0];
//		for(int i=1;i<strs.length;i++){
//			if(result.isEmpty()){
//				return рс;
//			}
//			String curr=strs[i];
//			String newResult=сс;
//			//result=new common prefix of result and curr
//			for(int j=0;j<result.length() && j<curr.length();j++){
//				//String resultPrefix=result.substring(0,j); 
//	char resultChar=result.charAt(j);         
//				//String currPrefix=curr.substring(0,j);     
//	char currChar=currPrefix.charAt(j);          
//				if(resultChar==currChar){
//					newResult+=currChar;
//				}else{
//					break;
//				}
//			}
//			result=newResult;
//		}
//		return result;
//	}
//
//
//
//
//
//
//
//
//
//	2.                                      100.1
//	                            45.2                          155.7
//	                     34.2       78.9
//
//	80 -> 78.9
//	32 -> 34.2
//	k -> nearest node
//
//	class BSTNode{
//		float val;
//		BSTNode left;
//		BSTNode right;
//	}
//
//
//	public BSTNode findNearestNode(int target, BSTNode root){
//	BSTNode nearest=root;
//	BSTNode tmp=root;
//	while(tmp!=null){
//		float curr=tmp.val;
//		if(target==curr){
//			return tmp;
//		}
//		if(target>curr){
//			//right subtree
//			if(target-curr<Math.abs(target-nearest.val)){
//				nearest=tmp;
//			}
//			tmp=tmp.right;
//			continue;
//		}else{
//			//left subtree
//			if(curr-target<Math.abs(target-nearest.val)){
//				nearest=tmp;
//			}
//			tmp=tmp.left;
//			continue;
//		}
//	}	
//	return nearest;
//	}
//
//
//	5, 5
//	0, 1
//	1, 2
//	2, 0
//	и
//	...
//
//	=>  0, 1, 2
//
//	Map <Integer, ArrayList<Integer>>map;
//	void Preprocess(File file) {
//	map=new HashMap<>();
//	Scanner scan=new Scanner(file);
//	String line=scan.next();
//	while(!line.isEmpty()){
//		String[]strs=line.split(р,с);
//		int first=Integer.parseInt(strs[0]);
//		int second=Integer.parseInt(strs[1]);
//		if(!map.contains(first)){
//			ArrayList<Integer>tmplist=new ArrayList<Integer>();
//			tmplist.add(second);
//			map.puts(first,tmplist);
//		}else{
//			map.get(first).add(second);
//		}
//	}
//	}
//
//	boolean IsTriangle(int a, int b, int c){
//		Preprocess(р...с);
//		ArrayList<Integer> alist=map.get(a);
//		ArrayList<Integer> blist=map.get(b);
//		ArrayList<Integer> clist=map.get(c);
//	if(alist==null || blist==null || clist==null){
//		return false;
//	}
//	if(!alist.contains(new Integer(b)) && !alist.contains(new Integer(c)){
//		return false;
//	}
//	//и.
//	}
}
