import java.util.ArrayList;

//Given a nested list of integers, returns the sum of all integers in the list weighted by their depth
//
//For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one *2 at depth 1)
//
//Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, and *one 6 at depth 3)
public class RecursionList {
	
	public static int calculateInput(ArrayList<Object> input){
		
		int sum = 0;
		
		return processInput(input,1,sum);
	}
	
	@SuppressWarnings("unchecked")
	public static int processInput(ArrayList<Object> input, int level, int sum){
			
		for(int i=0;i<input.size();i++){
			if (input.get(i) instanceof ArrayList<?>){
				sum = processInput((ArrayList<Object>) input.get(i),level+1,sum);
			}else{
				sum += (Integer) input.get(i)*level;
			}
		}
		return sum;
			
	}
	
	public static void main(String args[]){
		ArrayList<Object> input = new ArrayList<Object>();
		ArrayList<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		input.add(numbers);
		input.add(2);
		input.add(numbers);
		System.out.println(input);
		
		System.out.print(processInput(input,1,0));
		
	}
}
