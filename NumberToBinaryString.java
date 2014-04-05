import java.util.Stack;
public class NumberToBinaryString {
	public static String numberToBinary(int num){
		
		StringBuffer store = new StringBuffer();
		Stack<Integer> s = new Stack<Integer>();
		numberToBinaryHelper(num,s);
		while(!s.isEmpty()){
			store.append(s.pop().toString());
		}
		return store.toString();
	}
	public static void numberToBinaryHelper(int num, Stack<Integer> s){
		if(num==0){
			return;
		}
		s.add(num%2);
		numberToBinaryHelper(num/2,s);
	}
	public static void main(String args[]){
		Integer a = 3;
		System.out.println(numberToBinary(a));
	}
}
