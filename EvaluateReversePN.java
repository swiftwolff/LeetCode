import java.util.Stack;

class EvaluateReversePN{
	public static int evalRPN(String[] tokens){
		
		if(tokens.length==0||tokens==null) return 0;
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<tokens.length;i++){
			if(tokens[i].equals("+")){
				int value = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
				stack.push(String.valueOf(value));
			}else if(tokens[i].equals("-")){
				int valueOne = Integer.parseInt(stack.pop());
				int valueTwo = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(valueTwo-valueOne));
			}else if(tokens[i].equals("/")){
				int valueOne = Integer.parseInt(stack.pop());
				int valueTwo = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(valueTwo/valueOne));
			}else if(tokens[i].equals("*")){
				int valueOne = Integer.parseInt(stack.pop());
				int valueTwo = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(valueTwo*valueOne));
			}else{
				stack.push(tokens[i]);
			}
			
		}
		
		return Integer.parseInt(stack.pop());
	}

	public static void main(String args[]){
		String[] expr = {"4","13","5","/","+"};
		System.out.println(evalRPN(expr));
		
	}

}
