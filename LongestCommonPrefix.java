
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        StringBuilder s = new StringBuilder();

        for(int i=0;i<strs[0].length();i++){
            char tmp = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
            	if(i>strs[j].length()-1){
            		return s.toString();
            	}
                if(strs[j].charAt(i)!=tmp){
                    return s.toString();
                }
            }
            s.append(tmp);
        }
        
        return s.toString();
        
    }
	
	public static void main(String args[]){
		String[] strs= {"ad","abef","abg","a"};
		System.out.println(longestCommonPrefix(strs));
	}
}
