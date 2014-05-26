import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeInterval {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<Interval>();
        if(intervals.size()==0) return res;
        if(intervals.size()==1) return intervals;
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return a.end - b.end;
            }
            });
        
        for(int i=0;i<intervals.size()-1;i++){
            if(intervals.get(i).end >= intervals.get(i+1).start){
                int newStart = intervals.get(i).start<intervals.get(i+1).start?intervals.get(i).start:intervals.get(i+1).start;
                Interval newInterval = new Interval(newStart,intervals.get(i+1).end);
                if(res.size()!=0 && res.get(res.size()-1).start == newInterval.start){//check to see if previous interval has the same start point
                    res.get(res.size()-1).end = newInterval.end;
                }else{
                   res.add(newInterval); 
                }
                //update the next interval content
                intervals.get(i+1).start = intervals.get(i).start;
                intervals.get(i+1).end = intervals.get(i+1).end;
            }else{
                res.add(intervals.get(i));
                if(i==intervals.size()-2){
                    res.add(intervals.get(i+1));
                }
            }
        }
        return res;
    }
	public ArrayList<Interval> mergeCorrect(ArrayList<Interval> intervals) {
		if(intervals==null || intervals.size()==0){
			return intervals;
		}
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start-o2.start;
			}
		});
		
		Interval merged = intervals.get(0);
		ArrayList<Interval> ret = new ArrayList<Interval>();
		for(int i=1; i<intervals.size(); i++){
			Interval cur = intervals.get(i);
			if(merged.end < cur.start){
				ret.add(merged);
				merged = cur;
			}else{
				int min = Math.min(cur.start, merged.start);
				int max = Math.max(cur.end, merged.end);
				merged = new Interval(min, max);
			}
		}
		
		ret.add(merged);
		return ret;
	}
	
	public static void main(String args[]){
		
		Interval a = new Interval(2,3);
		Interval b = new Interval(4,5);
		Interval c = new Interval(6,7);
		Interval d = new Interval(8,9);
		Interval e = new Interval(1,10);
		ArrayList<Interval> deck = new ArrayList<Interval>();
		deck.add(a);
		deck.add(b);
		deck.add(c);
		deck.add(d);
		deck.add(e);
		MergeInterval solution = new MergeInterval();
		System.out.println(solution.mergeCorrect(deck));
		
		
		
	}
}
