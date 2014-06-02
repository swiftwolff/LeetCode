import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InsertInterval {
	
	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        
		ArrayList<Interval> res = new ArrayList<Interval>(intervals);

		if(intervals.size()==0&&newInterval==null) return res;
		if(newInterval==null) return res;
		if(intervals.size()==0) return new ArrayList<Interval>(Arrays.asList(newInterval));
		
		int startIndex = binarySearchIndxStart(res,0,intervals.size()-1,newInterval);
		int endIndex = binarySearchIndxEnd(res,0,intervals.size()-1,newInterval);
		
		if(res.get(startIndex).end < newInterval.start){
			res.add(newInterval);
			return res;
		}
		
		int start = Math.min(res.get(startIndex).start, newInterval.start);
		int end = Math.max(res.get(endIndex).end, newInterval.end);
		
		res.set(startIndex, new Interval(start,end));
		int count = 0;
		for(int i=startIndex+1;i<=endIndex;i++){
			res.remove(i-count);
			count++;
		}
		
		return res;
    }
	
	public static int binarySearchIndxStart(ArrayList<Interval> res, int start, int end, Interval newInterval){
		if(res.size()==1) return 0;
		while(start < end){
			int mid = (start+end)/2;
			if(res.get(mid).start == newInterval.start){
				return mid;
			}
			if(res.get(mid).start<newInterval.start){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		
		if(end < 0) return start;
		if(start > end) return start;
		return end;
	}
	
	public static int binarySearchIndxEnd(ArrayList<Interval> res, int start, int end, Interval newInterval){
		if(res.size()==1) return 0;
		while(start < end){
			int mid = (start+end)/2;
			if(res.get(mid).end == newInterval.end){
				return mid;
			}
			if(res.get(mid).end<newInterval.end){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		if(end < 0) return start;
		if(start > end) return start;
		return end;
		
	}
	
	public static void main(String args[]){
		
//		Interval a = new Interval(1,2);
//		Interval b = new Interval(3,5);
//		Interval c = new Interval(6,7);
//		Interval d = new Interval(8,10);
//		Interval e = new Interval(12,16);
//		Interval insert = new Interval(4,9);
		Interval a = new Interval(1,5);
//		Interval b = new Interval(6,8);
		Interval insert = new Interval(0,0);
		ArrayList<Interval> Lst = new ArrayList<Interval>(Arrays.asList(a));
//		int ansStart = binarySearchIndxStart(Lst,0,Lst.size()-1,insert);
//		int ansEnd = binarySearchIndxEnd(Lst,0,Lst.size()-1,insert);	
//		System.out.println(ansStart);
//		System.out.println(ansEnd);
		
//		List<Interval> list = insert(Lst,insert);
		System.out.println(insert(Lst,insert));
				
	}
}
