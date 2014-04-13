
public class SearchForARange {
	public static int[] searchRange(int[] A, int target) {
        
        if(A.length==0){
            int[] res = {-1,-1};
            return res;
        } 
        return searchRangeHelper(A,target,0,A.length-1);
    }
    public static int[] searchRangeHelper(int[]A, int target, int start, int end){
        if(start > end){
            int[] res = {-1,-1};
            return res;
        }
        
        int mid = (start + end)/2;
        if(A[mid]==target){
            int prev = mid;
            int next = mid;
            while(prev >= 0 && A[prev]==target){
                prev--;
            }
            while(next<A.length && A[next]==target){
                next++;
            }
        
            if(prev+1==next-1){
            	 int[] res = {mid,mid}; 
            	return res;
            }else{
            	 int[] res = {prev+1,next-1}; 
            	 return res;
            }
        }
        
        if(A[mid]<target){
            return searchRangeHelper(A,target,mid+1,end);
        }else{
            return searchRangeHelper(A,target,start,mid-1);
        }
    }
    
    public static void main(String args[]){
    	int[] A = {1};
    	int[] B = searchRange(A,1);
    	for(int i: B){
    		System.out.println(i);
    	}
    }
    
}
