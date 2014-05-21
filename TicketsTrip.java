import java.util.ArrayList;
public class TicketsTrip {
	//FE,BD,AC,DF,CB
	static class StartEnd{
		String start;
		String end;
		StartEnd(String a, String b){
			start = a;
			end = b;
		}
	}
	public static void main(String args[]){
		StartEnd a = new StartEnd("F","E");
		StartEnd b = new StartEnd("B","D");
		StartEnd c = new StartEnd("A","C");
		StartEnd d = new StartEnd("D","F");
		StartEnd e = new StartEnd("C","B");
		
		ArrayList<StartEnd> deck = new ArrayList<StartEnd>();
		deck.add(a);
		deck.add(b);
		deck.add(c);
		deck.add(d);
		deck.add(e);
		
		
		
		
	}
	
}
