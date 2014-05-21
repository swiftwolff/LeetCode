
public class RegularExpressionMatching {
//	public boolean isMatch(String s, String p){
//	    
//        if(s.length()==0||s==null && p.length()==0||p==null) return true;
//        if(s.length()==0||s==null||p.length()==0||p==null) return false;
//        
//        int firstIndex = 0;
//        int secondIndex = 0;
//        
//        //process *
//        for(int i=0;i<p.length();i++){
//                if(p.substring(i,i+1).equals("*")){
//                    secondIndex = i+1;  //next char
//                }
//        }
//        if(secondIndex!=0){
//            if(secondIndex==p.length()) return true;
//            for(int i=0;i<s.length();i++){
//                if(s.substring(i,i+1).equals(p.substring(secondIndex,secondIndex+1))){
//                    firstIndex = i+1;  //next char
//                }
//            }
//        }
//        if(firstIndex==s.length()&&secondIndex==p.length()-1) return true;
//        if(firstIndex==s.length()&&secondIndex!=p.length()-1) return false;
//        //index 0 may be matched with secondIndex string
//        if(!s.substring(firstIndex,firstIndex+1).equals(p.substring(secondIndex,secondIndex+1))&&!p.substring(secondIndex,secondIndex+1).equals(".")) return false;
//        
//        for(int i=secondIndex;i<p.length();i++){
//        	
//            if(s.substring(firstIndex,firstIndex+1).equals(p.substring(i,i+1))||p.substring(i,i+1).equals(".")){
//                firstIndex++;
//                if(firstIndex==s.length() && i!=p.length()-1) return false;
//                if(i==p.length()-1 && firstIndex!=s.length()) return false;
//                continue;
//            }else{
//                return false;
//            }
//            
//            
//        }
//        
//    
//    return true;
//    
//    }
	public boolean isMatch(String s, String p){
	    
        if(s.length()==0||s==null && p.length()==0||p==null) return true;
        if(s.length()==0||s==null||p.length()==0||p==null) return false;
    
        return isMatchHelper(s,p,0,0);
    }
	
    public boolean isMatchHelper(String s, String p, int i, int j){
    
        if(i==s.length()){
            if(j==p.length()){
                return true;
            }else{
                return false;
            }
        }
        
        if(j==p.length()){
        	if(i==s.length()){
        		return true;
        	}else{
        		return false;
        	}
        }
        
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
            return isMatchHelper(s,p,i+1,j+1);
        }
        else if(j+1<p.length() && p.charAt(j+1)=='*'){
            j=j+2;
            if(j==p.length()){
            	return isMatchHelper(s,p,i,j);
            }
            while(p.charAt(j)=='*'){
                j++;
            }
            if(s.charAt(i)!=p.charAt(j)){
                return false;
            }else{
            	
                return isMatchHelper(s,p,i+1,j+1);
            }
        }else{
            return false;
        }
    
    }
	public static void main(String args[]){
		
		RegularExpressionMatching solution = new RegularExpressionMatching();
		System.out.println(solution.isMatch("agggggg", "ag*g"));
		
		
	}
	
}
