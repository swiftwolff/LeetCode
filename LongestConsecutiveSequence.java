import java.util.HashSet;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] num) {
	        if(num.length==0){
	            return 0;
	        }
	        int max = 1;
	       
	        HashSet<Integer> table = new HashSet<Integer>();
	        for(int i:num){
	            table.add(i);
	        }
	        for(int i:num){        
	            int left = i-1;
	            int right = i+1;
	            int count = 1;
	            while(table.contains(left)){
	                count++;
	                table.remove(left);
	                left--;
	            }	 

	            while(table.contains(right)){
	                count++;
	                table.remove(right);
	                right++;
	            }
	            table.remove(i); //need to remove the current because its already checked  
	            max = Math.max(count, max);
	                    
	        }     

	        return max;
	    }
	
	
	
	public static void main(String args[]){
		int[] testcase={3,9};
		System.out.println(longestConsecutive(testcase));
	}
}
