import java.util.HashMap;
import java.util.ArrayList;
public class Anagram {
	public static ArrayList<ArrayList<String>> separate(String[] input){
		HashMap<String,ArrayList<String>> current = new HashMap<String,ArrayList<String>>();
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		String temp = "";
		for (int i = 0;i<input.length;i++){
//			System.out.println(input[i]);
			temp = check(current,input[i]);
			if (temp != null){
				System.out.println(input[i] + " exists!");
				current.get(temp).add(input[i]);
			}else{
				ArrayList<String> store  = new ArrayList<String>();
				store.add(input[i]);
				current.put(input[i], store);
				System.out.println(input[i] + " not exists!");
			}
			for(String hello:current.keySet()){
				System.out.println("current keysets "+ hello);
			}
			
			System.out.println("________________________________");
		}
		
		for (String ans: current.keySet()){
			res.add(current.get(ans));
		}
		
		System.out.println(res);
		
		return res;
	}
	
	public static String check(HashMap<String,ArrayList<String>> cur,String str){
		int sum = 0;
		
		for (String key:cur.keySet()){
			if (str.length()==key.length()){
				sum = 0;
				HashMap<Character,Integer> temp = new HashMap<Character,Integer>();
				for (int i=0;i<key.length();i++){
					if (temp.containsKey(key.charAt(i)) == false){
						temp.put(key.charAt(i), 1);
					}else{
						temp.put(key.charAt(i), temp.get(key.charAt(i))+1);
					}
					
				}
				System.out.println(temp);
				for (int j=0;j<str.length();j++){
					if (temp.containsKey(str.charAt(j))){
						temp.put(key.charAt(j), temp.get(key.charAt(j))-1);
						
					}
//					else{
//						return null;
//					}
				}
				
				for (Character c:temp.keySet()){
					sum += temp.get(c);
				}
				
				if (sum==0){
					return key;
				}	
			}
		}
		
		
		return null;
	}
	
	public static void main(String args[]){
		String[] words={"art","cat","rat","banana","tar","act"}; 
		
		Anagram.separate(words);
//		ArrayList<String> holder = new ArrayList<String>();
//		String word = "rat";
//		holder.add(word);
//		HashMap<String,ArrayList<String>> current = new HashMap<String,ArrayList<String>>();
//		current.put(word, holder);
//		System.out.println(Anagram.check(current, "art"));
		
		
	}
}

//need to to string reverse
//need to do matrix problem