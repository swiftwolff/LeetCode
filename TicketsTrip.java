import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
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
		
		HashMap<String,String> trip = new HashMap<String,String>();
		trip.put(a.start, a.end);
		trip.put(b.start, b.end);
		trip.put(c.start, c.end);
		trip.put(d.start, d.end);
		trip.put(e.start, e.end);
		//find start and end locations by counting the numbers of appearance and then DFS		
		for(String s:trip.keySet()){
			ArrayList<ArrayList<String>> tripOrder = new ArrayList<ArrayList<String>>();
			while(trip.containsKey(trip.get(s))){
				ArrayList<String> ticket = new ArrayList<String>();
				ticket.add(s);
				ticket.add(trip.get(s));
				tripOrder.add(ticket);
				s = trip.get(s);
			}
			ArrayList<String> ticket = new ArrayList<String>();
			ticket.add(s);
			ticket.add(trip.get(s));
			tripOrder.add(ticket);
			if(tripOrder.size()==trip.size()) System.out.println(tripOrder);
		}
				
	}
		
		
		
	
}
