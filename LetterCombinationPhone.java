import java.util.ArrayList;
import java.util.HashMap;

public class LetterCombinationPhone {
	public static ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> res = new ArrayList<String>();
		if(digits.length()==0){
			res.add("");
			return res;
		}
        HashMap<String,String> table = new HashMap<String,String>();
        ArrayList<String> possibilities = new ArrayList<String>();
        int stop = digits.length();
        table.put("1", "");
        table.put("2", "abc");
        table.put("3", "def");
        table.put("4","ghi");
        table.put("5","jkl");
        table.put("6","mno");
        table.put("7","pqrs");
        table.put("8","tuv");
        table.put("9","wxyz");
        table.put("0","_");
        for(int i=0;i<stop;i++){
        	possibilities.add(table.get(digits.substring(i,i+1)));
        }

        	for(int j=0;j<possibilities.get(0).length();j++){      		
        		StringBuffer s = new StringBuffer();
        		s.append(possibilities.get(0).charAt(j));
        		combinations(possibilities,s,1,stop,res);
        	}
        	       
        return res;
		
    }
	
	public static void combinations(ArrayList<String> possibilities,StringBuffer tmp,int curStrIndex, int stop,ArrayList<String> res){
		if(curStrIndex==stop){
			res.add(tmp.toString());
			return;
		}

			for(int j=0;j<possibilities.get(curStrIndex).length();j++){
				StringBuffer newTmp = new StringBuffer();
				newTmp.append(tmp);
				newTmp.append(possibilities.get(curStrIndex).charAt(j));
				combinations(possibilities,newTmp,curStrIndex+1,stop,res);
			}
		
	}
	public static void main(String args[]){
		System.out.println(letterCombinations("234"));
	}
}
