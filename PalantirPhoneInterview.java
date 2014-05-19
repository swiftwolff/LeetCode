import java.util.LinkedList;


public class PalantirPhoneInterview {
	LinkedList<Integer> stack = new LinkedList<Integer>();
	LinkedList<Integer> min = new LinkedList<Integer>();
	
	public void push(int num){
		if(stack.isEmpty() && min.isEmpty()){
			stack.add(num);
			min.add(num);
			return;
		}
		if(num < min.peekLast()){
			min.add(num);
			stack.add(num);
		}else{
			stack.add(num);
			int tmp = min.peekLast();
			min.add(tmp);
			}
		return;
	}
	
	public int pop(){
		min.removeLast();
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
		solution.push(0);
		solution.push(1);
		solution.push(10);
		
		solution.pop();
		solution.pop();

		System.out.println(solution.minPeek());

	}
}
