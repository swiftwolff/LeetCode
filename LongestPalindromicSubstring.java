public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        if(s.length()==0) return null;
        
        int[][] DP = new int[s.length()][s.length()];
        int count = 0;
        int max = 0;
        int longestIndexBg = 0;
        for(int i=1;i<DP.length;i++){
        	
            for(int j=0;j+i<DP.length;j++){
                if(s.charAt(j) == s.charAt(j+i)){
                    DP[j][j+i] = 1;
                    count++;
                    if(count > max){
                    	longestIndexBg = i;
                    	max = count;
                    }
                }
                
            }
            count = 0;
        }
            
          System.out.println(longestIndexBg);
          return s.substring(longestIndexBg, longestIndexBg+max);
        }
	public String longestPalindrome2(String s) {
		if (s == null)
			return null;
	 
		if(s.length() <=1)
			return s;
	 
		int maxLen = 0;
		String longestStr = null;
	 
		int length = s.length();
	 
		int[][] table = new int[length][length];
	 
		//every single letter is palindrome
		for (int i = 0; i < length; i++) {
			table[i][i] = 1;
		}
		printTable(table);
	 
		//e.g. bcba
		//two consecutive same letters are palindrome
		for (int i = 0; i <= length - 2; i++) {
			if (s.charAt(i) == s.charAt(i + 1)){
				table[i][i + 1] = 1;
				longestStr = s.substring(i, i + 2);
			}	
		}
		printTable(table);
		//condition for calculate whole table
		for (int l = 3; l <= length; l++) {
			for (int i = 0; i <= length-l; i++) {
				int j = i + l - 1;
				if (s.charAt(i) == s.charAt(j)) {
					table[i][j] = table[i + 1][j - 1];
					if (table[i][j] == 1 && l > maxLen)
						longestStr = s.substring(i, j + 1);
				} else {
					table[i][j] = 0;
				}
				printTable(table);
			}
		}
	 
		return longestStr;
	}
	
	public static void printTable(int[][] x){
		for(int [] y : x){
			for(int z: y){
				System.out.print(z + " ");
			}
			System.out.println();
		}
		System.out.println("------");
	}
	
	public static void main(String args[]){
		String s = "abcbcbb";
		LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
		System.out.println(solution.longestPalindrome(s));
	}
}
