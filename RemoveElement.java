public class RemoveElement {
    public static int removeElement(int[] A, int elem) {
        
        if (A.length == 0){
            return 0;
        }
        
        int i = 0;
        int j = A.length - 1;
        int count = 0;
        
        while (i <= j){
            while(A[i]==elem && i<=j){
                if(A[j]==elem){
                    j--;
                    count++;
                }else{
                    swap(A,i,j);
                    j--;
                    count++;

                }

            }
            i++;
        }

        return A.length - count;
    }
    
    public static void swap(int[] A,int i,int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public static void main(String args[]){
    	int[] A = {1,1,3,1};
    	System.out.print(RemoveElement.removeElement(A, 1));
    }
    
}