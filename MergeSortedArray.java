
public class MergeSortedArray {
public static void merge(int A[], int m, int B[], int n) {
        
		 if (A.length ==0){
	         for(int i=0;i<B.length;i++){
	         A[i] = B[i];
	         }
	         return;
	     }
        if (B.length==0 ){
            return;
        }
        
        
//        for(int i=0;i<B.length;i++){
//            A[m+i] = B[i];
//        }
//        for(int i:A){
//    		System.out.println(i);
//    	}
        
        quicksort(A,0,m+n-1);
        
    }
    
    public static void swap(int[] A, int i,int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public static void partition(int[] A, int start, int end){
    	if (start == end){
    		return;
    	}
        int pivot = start;
        while(end >= start){
            if(A[start]>A[pivot]){
//            	System.out.print("Hi");
                if(A[end]<A[start]){
                	swap(A,start,end);       
                }else{
                	end--;
                }
            }else{
                start++;
            }
        }
        
  
        if (start > end){
 
        	swap(A,pivot,end);
        }
        
    }
    
    public static void quicksort(int[] A, int start, int end){
        if (end == start){
            return;
        }
        
        int mid = (start + end) / 2;
        partition(A,start,mid);
//        for(int i:A){
//    		System.out.println(i);
//    	}
//        System.out.println();
        partition(A,mid+1,end);
//        for(int i:A){
//    		System.out.println(i);
//    	}
//        System.out.println();
    }
    
    public static void mergeNew(int[] A, int m, int[] B, int n){
    	int i = m -1;
    	int j = n -1;
    	int k = m+n-1;
    	
    	while(i>=0 && j>=0){

    		if(B[j]<A[i]){
    			A[k] = A[i];
    			k--;
        		i--;
    		}else{
    			A[k] = B[j];
    			k--;
    			j--;
    		}
    		
    	}

    	if (i<0){
			A[k] = B[j];
		}

    	
    }
    
    public static void main(String args[]){
    	int[] a = {4,7,9,0,0,0};
    	int[] b = {2,8,10};
    	
    	MergeSortedArray.mergeNew(a, 3, b, 3);

    	for(int i:a){
    		System.out.println(i);
    	}
    }
    
}
