
public class InterleavingString {
	public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()==0||s2.length()==0||s3.length()==0) return false;
        if(s3.length()!= (s1.length()+s2.length())) return false;
        
        int i=0;
        int j=0;
        int cur=0;
        
        while(i<s1.length() || j<s2.length()){
            
            if(i>s1.length()-1){
                if(s3.charAt(cur)==s2.charAt(j)){
                    cur++;
                    j++;
                    continue;
                }else{
                    return false;
                }
            }
            
            if(j>s2.length()-1){
                if(s3.charAt(cur)==s1.charAt(i)){
                    cur++;
                    i++;
                    continue;
                }else{
                    return false;
                }
            }
            
            boolean strCorrect1 = s3.charAt(cur)==s1.charAt(i);
            boolean strCorrect2 = s3.charAt(cur)==s2.charAt(j);
            
            if(strCorrect1 && strCorrect2){
                boolean result = isInterleave(s1.substring(i+1,s1.length()), s2.substring(j,s2.length()), s3.substring(cur+1,s3.length()));           
                if(result){
                    return true;
                }
                result = isInterleave(s1.substring(i,s1.length()), s2.substring(j+1,s2.length()), s3.substring(cur+1,s3.length()));                       
                if(result){
                    return true;
                }else{
                    return false;
                }
            }else if(strCorrect1 || strCorrect2){
                if(strCorrect1){
                    i++;
                    cur++;
                }else{
                    j++;
                    cur++;
                }
            }else{
            	return false;
            }

        }
        
        return true;
    }
	public static boolean isInterleaveDP(String s1, String s2, String s3){
		 if(s1.length()==0||s2.length()==0||s3.length()==0) return false;
	     if(s3.length()!= (s1.length()+s2.length())) return false;
		
		 boolean DP[][] = new boolean[s1.length()+1][s2.length()+1];
		 DP[0][0] = true;
		 for(int i=1;i<DP.length;i++){
			 if(s3.charAt(i-1)==s1.charAt(i-1)){
				 DP[i][0] = true;
			 }else{
				 break;
			 }
		 }
		 for(int j=1;j<DP[0].length;j++){
			 if(s3.charAt(j-1)==s2.charAt(j-1)){
				 DP[0][j] = true;
			 }else{
				 break;
			 }
		 }
		
		 for(int i=1;i<DP.length;i++){
			 for(int j=1;j<DP[0].length;j++){
				 char s = s3.charAt(i+j-1);
				 if(s==s1.charAt(i-1)){
					 DP[i][j] = DP[i][j] || DP[i-1][j];
				 }
				 if(s==s2.charAt(j-1)){
					 DP[i][j] = DP[i][j] || DP[i][j-1];  //DP[i][j] here gets the above value
				 }
				 
			 }
		 }
		 
		 return DP[s1.length()][s2.length()];
		 
		 
		 
		 
	}
	
	
	public static void main(String args[]){
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";
		
		System.out.println(isInterleaveDP(s1,s2,s3));
		
	}
}
