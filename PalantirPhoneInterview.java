import java.util.LinkedList;


public class PalantirPhoneInterview {
	LinkedList<Integer> stack = new LinkedList<Integer>();
	LinkedList<Integer> min = new LinkedList<Integer>();
	public void push(int num){
		int tmp = min.peekLast();
		if(num < tmp){
			min.add(num);	
		}else{
			min.removeLast();
			min.add(num);
			min.add(tmp);
		}
		stack.add(num);
	}
	
	public int pop(){
		return stack.removeLast();
	}
	
	public int peek(){
		return stack.peekLast();
	}
	public int minPeek(){
		return min.peekLast();
	}
	
	
	public static void main(String args[]){
		PalantirPhoneInterview solution = new PalantirPhoneInterview();
		solution.push(4);
		solution.push(5);
		solution.push(1);
		System.out.println(solution.peek());
	}
}
