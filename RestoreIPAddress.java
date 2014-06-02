import java.util.ArrayList;
import java.util.List;


public class RestoreIPAddress {
	
	public static List<String> restoreIpAddresses(String s){
		ArrayList<String> res = new ArrayList<String>();
		if(s.length()==0||s==null) return res;
		restoreHelper(s,0,s.length(),9,3,"",res);
		return res;
	}
	
	public static void restoreHelper(String s,int curIndex, int total, int upper, int lower, String curStr, ArrayList<String> res){
		if(upper==0){
			String tmpStr = s.substring(curIndex,s.length());
			if(Integer.valueOf(tmpStr)>255) return;
			if(tmpStr.charAt(0)=='0'&&tmpStr.length()>1) return;
			curStr = curStr + s.substring(curIndex,s.length());
			res.add(curStr);
			return;
		}
		
		for(int i= curIndex+1;i<curIndex+4;i++){
			int second = total - i;
			if(second > upper || second < lower) continue;
			String tmpStr = s.substring(curIndex,i);
			if(Integer.valueOf(tmpStr)>255) continue;
			if(tmpStr.charAt(0)=='0'&&tmpStr.length()>1) continue;
			String curStrClone = new String(curStr);
			curStrClone = curStr+tmpStr+".";
			restoreHelper(s,i,total,upper-3,lower-1,curStrClone,res);
		}
		
	}
	
	public static void main(String args[]){
		
		String s = "172162541";
		System.out.println(restoreIpAddresses(s));
		
		
	}
	
}
