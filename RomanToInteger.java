import java.util.HashMap;
public class RomanToInteger {
	public static int RomanToInt(String s){
		s = s.toUpperCase();
		HashMap<Character,Integer> table = GenereateTable();
		char[] carray = s.toCharArray();
		int res = 0;		
		for(int j=0;j<carray.length;j++){
			if (j==carray.length-1||carray[j]=='Z'){
				res += table.get(carray[j]);
				continue;
			}
			if (table.get(carray[j])>=table.get(carray[j+1])){
				res += table.get(carray[j]);
			}else{
				res += table.get(carray[j+1]) - table.get(carray[j]);
				carray[j+1] = 'Z';
			}
		}
		
		return res;
	}
	
	public static HashMap<Character,Integer> GenereateTable(){
		
		HashMap<Character, Integer> table = new HashMap<Character,Integer>();
		table.put('Z',0);
		table.put('I',1);
		table.put('V',5);
		table.put('X',10);
		table.put('L',50);
		table.put('C',100);
		table.put('D',500);
		table.put('M',1000);
		
		return table;
		
	}

	public static void main(String args[]){
		System.out.println(RomanToInteger.RomanToInt("MCMXCVI"));
	}
}
