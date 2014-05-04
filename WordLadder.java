import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder {
	
	public int ladderLength(String start, String end, HashSet<String> dict){
		
		if(start.length()==0 || end.length()==0){
			return 0;
		}
		if(start.equals(end)){
			return 0;
		}
		char[] alphebat = {'a','b','c','d','e','f','g','h','i','j','k','l',
		'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		HashSet<String> visited = new HashSet<String>();
		Queue<String> graph = new LinkedList<String>();
		Queue<Integer> level = new LinkedList<Integer>();
		graph.add(start);
		level.add(1);
		while(!graph.isEmpty()){
			String cur = graph.remove();
			int curDistance = level.remove();
			for(int i=0;i<start.length();i++){
				for(int j=0;j<alphebat.length;j++){
					char[] tmp = cur.toCharArray();
					tmp[i] = alphebat[j];
					String newWord = new String(tmp);
					if(newWord.equals(end)){
						return curDistance+1;
					}	
					if(!visited.contains(newWord) && dict.contains(newWord)){
						visited.add(newWord);
						graph.add(newWord);
						level.add(curDistance+1);
					}
					
				}
			}
		}
		return 0;
	}
	
	public static void main(String args[]){
		HashSet<String> dict = new HashSet<String>();
		dict.add("lest");
		dict.add("leet");
		dict.add("lose");
		dict.add("code");
		dict.add("lode");
		dict.add("robe");
		dict.add("lost");

		WordLadder solution = new WordLadder();
		System.out.println(solution.ladderLength("leet", "code", dict));

	}
}
