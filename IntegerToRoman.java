import java.util.Arrays;
import java.util.HashMap;
public class IntegerToRoman {

	public static String intToRoman(int num){
		
		if (num < 1){
			return "";
		}
		HashMap<Integer,String> table = generateTable();
		int[] numbers = generateNum(table);
		int count = 0;
		String res = "";
		for (int i=numbers.length-1;i>-1;i--){
			count = num/numbers[i];
			if (count > 0){
				res += table.get(numbers[i]);
				num -= numbers[i];
				i++;
			}
		}
		
		
		return res;
	}
	
	public static HashMap<Integer,String> generateTable(){
		
		HashMap<Integer,String> table = new HashMap<Integer,String>();
		table.put(1, "I");
		table.put(4, "IV");
		table.put(5, "V");
		table.put(9, "IX");
		table.put(10, "X");
		table.put(40, "XL");
		table.put(50, "L");
		table.put(90, "XC");
		table.put(100, "C");
		table.put(400, "CD");
		table.put(500, "D");
		table.put(900, "CM");
		table.put(1000, "M");
		
		return table;
	}
	
	public static int[] generateNum(HashMap<Integer,String> table){
		int[] numbers = new int[13];
		int j = 0;
		for(int i:table.keySet()){
			numbers[j] = i;
			j++;
		}
		Arrays.sort(numbers);
		return numbers;
	}
	
	
	public static void main(String args[]){
		System.out.println(intToRoman(18));
	}
}
