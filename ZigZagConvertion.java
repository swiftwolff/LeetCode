
public class ZigZagConvertion {
	
	public String convert(String s, int nRows) {
		if(s==null||s.length()==0){
			return "";
		}
        if(nRows<=1){
            return s;
        }
        int len = s.length();
        int count = 0;
        int top = len;
        int n = nRows-2;
        while(top > 0){
            top-=nRows;
            count++;
            while(n>0 && top >0){
                top-=1;
                count++;
                n--;
            }
            n = nRows-2;
           
        }
        char[][] table = new char[nRows][count];
        int negrow = 0;
        int cur = 0;
        int offset = nRows-2;
        for(int j=0;j<count;j++){ //col moves up
        	while( j % (offset+1) != 0 && cur<len){
        		table[negrow-1][j] = s.charAt(cur);
        		negrow--;
        		cur++;
        		j++;
        	}     	
        	if(cur>len){
    			break;
    		}
        	for(int i=0;i<nRows&&cur<len;i++){ //rows alter 
        		table[i][j] = s.charAt(cur);
        		cur++;
        		
        		negrow = i;
        	}
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<nRows;i++){
        	for(int j=0;j<count;j++){
        		if(table[i][j]!=' '){
        			sb.append(table[i][j]);
        		}
        	}
        }
        
        return sb.toString();
        
    }
	
	
	public static void main(String args[]){
		ZigZagConvertion solution = new ZigZagConvertion();
		System.out.println(solution.convert("ABCDE",4));
	}
}
