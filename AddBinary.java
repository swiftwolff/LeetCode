import java.util.HashMap;


public class AddBinary {
	
//	public static String addBinary(String a, String b) {  //this does not work if they exceed the integer, use carry!
//		if(a.length()==0 || b.length()==0){
//	            return a.length()==0? b:a;
//	    }
//        int total = BinaryToInt(a) + BinaryToInt(b);
//        if(total==0){
//        	return "0";
//        }
//        return intToBinary(total);
//    }
//    
//    public static int BinaryToInt(String a){
//        int len = a.length();
//        int sum = 0;
//        int count = len-1;
//        for(int i=0;i<len;i++){
////        	System.out.println(Integer.parseInt(a.substring(i,i+1))*Math.pow(2, i));
//        	sum+=Integer.parseInt(a.substring(count,count+1))*Math.pow(2, i);
//        	count--;
//        }
//        return sum;
//    }
//    
//    public static String intToBinary(int a){
//        StringBuilder s = new StringBuilder();
//        Stack<String> store = new Stack<String>();
//        while(a>0){
//            if(a%2>0){
//                store.push("1");
//            }else{
//            	store.push("0");
//            }
//            a /=2;
//        }
//        while(!store.isEmpty()){
//            s.append(store.pop());
//        }
//        return s.toString();
//    }
    
    //////////////////////////
	 public static String addBinary(String a, String b) { 
		 if(a==null||a.length()==0){
			 return b;
		 }
		 if(b==null||b.length()==0){
			 return a;
		 }
		 StringBuilder sb = new StringBuilder();
		 int lastA = a.length()-1;
		 int lastB= b.length()-1;
		 int carry = 0;
		 
		 while(lastA>=0||lastB>=0||carry>0){
			 int num1= lastA>=0? a.charAt(lastA--)-'0':0;  //what is this?
			 int num2 = lastB>=0? b.charAt(lastB--)-'0':0; //what is this?
			 int current = (num1+num2+carry)%2;
			 
			 sb.insert(0,current);
		 }
		 
		 return sb.toString();
	 }
	
	public static void main(String args[]){
		String a = "1";
		String b = "111";
//		System.out.println(addBinary(a,b));
		System.out.println('1'-'0');
//		System.out.println(BinaryToInt(a));
//		System.out.println(BinaryToInt(b));
//		System.out.println(addBinary(a,b));
		
	}
}
