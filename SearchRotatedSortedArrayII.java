
public class SearchRotatedSortedArrayII {
	
	public static boolean search(int[] A, int target) {  
        if(A.length == 0) return false;  
        if(A.length == 1){  
            if(A[0] == target) return true;  
            else return false;  
        }  
          
        int left = 0;  
        int right = A.length-1;  
          
        while(left<=right){  
            int middle = (left+right)/2;  
            if(A[middle] == target) return true;  
            if (A[middle]<A[left]){  
                if(target>A[middle] && target<=A[right]) left = middle+1;  
                else right= middle -1;  
            }  
            else{  
                // case of A[middle] is a duplicate of left most element  
                if(A[middle] == A[left] && middle != left){  
                    left++;  
                    continue;  
                }  
                  
                if(target<A[middle] && target>=A[left]) right= middle-1;  
                else left = middle+1;  
            }  
        }  
        return false;  
    }  
	
	
	public static void main(String args[]){
		int[] A = {1,2,3};
		System.out.println(search(A,1));
	}
}
