import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
        
		if(s==null||s.length()==0){
			return 0;
		}
		boolean[] alphebat = new boolean[256];
		Arrays.fill(alphebat, false);
		int count = 0;
		int ans = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
		while(j<s.length()){
			if(alphebat[s.charAt(j)]){
				ans = Math.max(ans, count);
				while(alphebat[s.charAt(j)]){
					alphebat[s.charAt(i)] = false;
					count--;
					i++;
				}
				
			}else{
				alphebat[s.charAt(j)] = true;
				j++;
				count++;
			}
			ans = Math.max(ans, count);
		}
		
		return ans;
    }
	
	
	
	
	public static void main(String args[]){
		String s = "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac";
//		System.out.println(s.length());
		LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(solution.lengthOfLongestSubstring(s));
//		boolean[] table = new boolean[256];
//		table['a'] = true;
//		for(int i=0;i<256;i++){
//			if(table[i]==true){
//				System.out.println(i);
//			}
//		}
//		System.out.println(table[97]);
	}
}
