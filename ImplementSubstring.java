import java.util.Arrays;

class ImplementSubstring{

	public static String strStr(String haystack, String needle){

		if(haystack.length()==0||haystack==null||needle.length()==0||needle==null){ return null;}
		int hCur = 0;
		int hEnd = haystack.length();
		int nCur = 0;
		int nEnd = needle.length();
		
		if(nEnd > hEnd) return null;
		
		while(hCur <= hEnd-nEnd){
			int tmp = hCur;
			while(hCur<hEnd&&haystack.charAt(hCur)==needle.charAt(nCur)){
				hCur++;
				nCur++;
				if(nCur==nEnd) return needle;	
			}
			hCur = tmp+1;
			nCur=0;
		}


		return null;
	}
	
	public static String strStrBM(String haystack, String needle){
		
		if(needle.length() > haystack.length()) return null;
		if(haystack.length()==0||needle.length()==0) return null;
		if(haystack==null || needle==null) return null;
		
		needle = needle.toLowerCase();
		haystack = haystack.toLowerCase();
		
		int[] alphebats = buildAlphebats(needle);
		
		int hayIndex = needle.length()-1;
		int needleIndex = needle.length()-1;
		int hayStart = 0;
		while(hayIndex <= haystack.length()-1){
			
			int hayTmp = hayIndex;
			int needleTmp = needleIndex;
			
			if(needle.charAt(needleIndex)==haystack.charAt(hayIndex)){
				
				while(needle.charAt(needleIndex)==haystack.charAt(hayIndex)){
					needleIndex--;
					hayIndex--;
					if(needleIndex<0) return needle;
				}
				
			}	
			
			hayIndex = hayTmp + alphebats[haystack.charAt(hayTmp)-'a'];
			needleIndex = needleTmp;	
		}
		
		return null;
	}
	
	public static int[] buildAlphebats(String needle){
		int moveIndex = needle.length()-1;
		int[] alphebats = new int[26];
		for(int i=0; i<alphebats.length; i++){	
			alphebats[i] = needle.length(); 
		}
		for(int i=0; i<needle.length();i++){
			alphebats[needle.charAt(i)-'a'] = moveIndex;
			moveIndex--;
		}
		
		return alphebats;
	}

	public static void main(String args[]){
//		int[] alphbet = new int[26];
//		String p = "barber";
//		for(int i=0;i<alphbet.length;i++){
//			alphbet[i] = p.length();
//		}
//		
//		for(int j=0;j<p.length();j++){
//			alphbet[p.charAt(j)-'a'] = p.length()-1-j;
//		}
//		
//		System.out.println(Arrays.toString(alphbet));	
//		System.out.println(strStr("mississippi","issippi"));
//		System.out.println(Arrays.toString(buildAlphebats("barber")));
		System.out.println(strStrBM("missiefi","issip"));
	}


}
