import java.util.Arrays;

public class NextPermutation {

	public static void nextPermutation(int[] num) {
	      
        for (int i=num.length-1; i>0; i--){
            if (num[i]>num[i-1]){
                
                reverse(num, i, num.length-1);  
                // can use normal back to front scan replace bsearch, not slow so much, but bsearch is better
                int j=bSearch(num, num[i-1]+0.5, i,num.length-1);
                       
                int temp=num[j];
                num[j]=num[i-1];
                num[i-1]=temp;
                                                              
                return;                
                
            }
        }
        
        Arrays.sort(num);               
    }
    private static int bSearch(int[] num, double target,int start, int end ){
        while (start<=end){
            
            int mid=(start+end)/2;
            if (num[mid]==target)
            {
                return mid;
            }
            else if (num[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
                
            }
        }
        
        return start;
        
    }
    private static void reverse(int[] num, int start, int end){
        while (start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            
            start++;
            end--;
        }
    }

    public static void main(String args[]){
    	int[] num = {1,3,6,4};
    	nextPermutation(num);
    	for(int i:num){
    		System.out.println(i);
    	}
    }
}
