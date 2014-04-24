
public class CountandSay {
	public static String countAndSay(int n) {
        if(n==0){
            return "1";
        }
        return countAndSayHelper(1,"1",n);
    }   
    public static String countAndSayHelper(int count,String cur,int n){
        if(count>=n){
            return cur;
        }
        StringBuilder sb = new StringBuilder();
            for(int i=0;i<cur.length();i++){
                int cnt = 1;
                char curChar = cur.charAt(i);
                while(i<cur.length()-1 && cur.charAt(i)==cur.charAt(i+1)){
                    cnt++;
                    i++;
                }
                sb.append(String.valueOf(cnt));
                sb.append(curChar);
            }
            String ans = countAndSayHelper(count+1,sb.toString(),n);
         return ans;
        
    }
    
    public static void main(String args[]){
    	
    	System.out.println(countAndSay(6));
    }
}
