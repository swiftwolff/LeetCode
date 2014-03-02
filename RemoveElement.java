public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        if (A.length==0){
            return 0;
        }
        int i = 0;
        int j = A.length-1;
        int c = 0;
        
        while(i<j){
            if (A[i]==elem){
               while(A[j]== elem&&j>i){
                   j--;
               }
               swap(A,i,j);
               j--;
            }
            i++;
            if(A[c]!=elem){
                c++;
            }
        }
        if (A[i]==elem){
            return c;
        }
        return c+1;
    }
    
    public void swap(int[] A, int i, int j){
        if (i==j){
            return;
        }
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
}