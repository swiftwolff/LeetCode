import java.util.ArrayList;
import java.util.HashSet;

public class DavidYelp {
	public static String findOriginal(String addr, HashSet<String> dict){
		
		int stopIndex = -1;
		for(int i=0;i<addr.length();i++){
			if(!addr.substring(i,i+1).matches("[a-zA-Z]")){  //cannot use "//w" b/c "1" will be true
				System.out.println("Got it");
				stopIndex = i;
				break;
			}
		}
		ArrayList<String> res = new ArrayList<String>();
		System.out.println(stopIndex);
		String front = addr.substring(0,stopIndex).toLowerCase();
		res.add(front);
		findOriginalHelper(front, 0, res);
		String bottom = addr.substring(stopIndex,addr.length());
		for(int i=0;i<res.size();i++){
			String newStr = res.get(i) + bottom;
			if(dict.contains(newStr)){
				return newStr;
			}
		}
		
		return "";
	}
	
	public static ArrayList<String> findOriginalHelper(String front, int index, ArrayList<String> res){
		
		if(index>front.length()-1){
			return res;
		}
			
		for(int i=index;i<front.length();i++){
			char[] tmp = front.toCharArray();
			tmp[i] = Character.toUpperCase(tmp[i]);
			String tempStr = new String(tmp);
			res.add(tempStr);
			findOriginalHelper(tempStr,i+1,res);
		}
	
		return res;
	}
	
	public static void main(String args[]){
//		String text = "abc";
//		ArrayList<String> res = new ArrayList<String>();
//		res.add(text);
		HashSet<String> table = new HashSet<String>();
		table.add("aBc1123");
		System.out.println(findOriginal("abc1123",table));
		
		String s = "0";
		System.out.println(s.matches("\\w"));
	}
}
