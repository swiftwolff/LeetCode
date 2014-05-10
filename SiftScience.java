import java.util.ArrayList;

public class SiftScience {
	private int evalExpression (String expr) { //"4x12+4+9x5x2+9x0" // => 142
        // Implement here
        int total = 0;
        String[] processPlus = expr.split("\\+");  //this gives you [4x12, 4 ,9x5x2,9x0];

        ArrayList<Integer> plusInteger = new ArrayList<Integer>();
        int sum = 1;
        for(int i=0;i<processPlus.length;i++){
        	System.out.println(processPlus[i]);
        	
            String[] processMult = processPlus[i].split("x");

            for(int j=0;j<processMult.length;j++){  //this gives you [4, 12] ,[4], [9,5,2], [9,0];
                System.out.println(processMult[j]);
                // processMult[j] == "4"        ["4"] -> 1
//                if(processMult[j].length()<2){
//                    plusInteger.add(Integer.parseInt(processMult[j]));
//                    continue;
//                }
//                System.out.println(sum);
//                sum*= Integer.parseInt(processMult[j]);
//                plusInteger.add(sum);
            }
        
        }
        
        for(int k:plusInteger){
            total+=k;
        }
        
        return total;
    }
	
	public static void main(String args[]){
		SiftScience solution = new SiftScience();
		System.out.println(solution.evalExpression("4x12+4+9x5x2+9x0"));
//		String expr = "4x12+9";
//		System.out.println(expr.split("\\+")[0]);
//		String[] testout = expr.split("\\x");
//		System.out.println(testout[3]);
	}

}
