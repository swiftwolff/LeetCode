import java.util.Stack;


public class AddBinary {
	
	public static String addBinary(String a, String b) {  //this does not work if they exceed the integer, use carry!
		if(a.length()==0 || b.length()==0){
	            return a.length()==0? b:a;
	    }
        int total = BinaryToInt(a) + BinaryToInt(b);
        if(total==0){
        	return "0";
        }
        return intToBinary(total);
    }
    
    public static int BinaryToInt(String a){
        int len = a.length();
        int sum = 0;
        int count = len-1;
        for(int i=0;i<len;i++){
//        	System.out.println(Integer.parseInt(a.substring(i,i+1))*Math.pow(2, i));
        	sum+=Integer.parseInt(a.substring(count,count+1))*Math.pow(2, i);
        	count--;
        }
        return sum;
    }
    
    public static String intToBinary(int a){
        StringBuilder s = new StringBuilder();
        Stack<String> store = new Stack<String>();
        while(a>0){
            if(a%2>0){
                store.push("1");
            }else{
            	store.push("0");
            }
            a /=2;
        }
        while(!store.isEmpty()){
            s.append(store.pop());
        }
        return s.toString();
    }
	
	public static void main(String args[]){
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		System.out.println(BinaryToInt(a));
		System.out.println(BinaryToInt(b));
		System.out.println(addBinary(a,b));
		
	}
}
