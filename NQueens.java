import java.util.ArrayList;

public class NQueens {
    public static ArrayList<String[]> solveNQueens(int n) {
    	ArrayList<String[]> res = new ArrayList<String[]>();
    	if (n==0){
    		return res;
    	}
    	int[] loc = new int[n];
    	build(loc,0,n,res);
    	return res;
    }
    
    public static void build(int[] loc,int cur,int n, ArrayList<String[]> res){
    	if(cur==n){
    		printboard(loc,n,res);
    		return;
    	}
    	
    	for(int i=0;i<n;i++){
    		loc[cur] = i;
    		if(isValid(cur,loc)){
    			build(loc,cur+1,n,res);
    		}
    	}
    }
    public static boolean isValid(int cur, int[] loc){	
    	for(int i=0;i<cur;i++){
    		if(loc[i]==loc[cur]||Math.abs(loc[cur]-loc[i])==Math.abs(i-cur)){
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void printboard(int[] loc, int n, ArrayList<String[]>res){
    	String dot = "";
    	String[] strArry = new String[n];
    	for(int i=0;i<n;i++){
    		dot+=".";
    	}
    	char[] dotArry = dot.toCharArray();
    	for(int j=0;j<n;j++){
    		dotArry[loc[j]] = 'Q'; 
    		String tmp = new String(dotArry);
    		strArry[j] = tmp;
    		dotArry[loc[j]] = '.'; 
    	}
    	res.add(strArry);
    }
	
	public static void main(String args[]){
		ArrayList<String[]> res = new ArrayList<String[]>();
		res = solveNQueens(0);
		System.out.println(res);
		for(int i=0;i<res.size();i++){
			for(int j=0;j<res.get(i).length;j++){
				System.out.println(res.get(i)[j]);
			}
			System.out.println("-----------------");
			
		}
	}
	
}
