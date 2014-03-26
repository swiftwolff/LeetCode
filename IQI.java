//find the longest prefix
public class IQI {
	
	public static String longestCommonPrefix(String[] strs) {
		int k=0;
		for(int i=1;i<strs.length;i++){
			for(int j=0;j<strs[0].length();j++){
				if(j>=strs[i].length()){
					return strs[0].substring(0,j);
				}
				if(strs[0].charAt(j)!=strs[i].charAt(j)){
					return strs[0].substring(0,j);
				}
				k = j;
			}
			
		}
		System.out.println(k);
        return strs[0].substring(0,k+1);
    }
	
	
	public static void main(String args[]){
		String[] s = {"abc","a","ab"};
		String b = longestCommonPrefix(s);
		System.out.println(b);
		System.out.println("aaa".substring(0,0));
		
	}
}
