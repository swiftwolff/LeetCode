import java.util.Arrays;

class PermutationSequeuence{


	public  static  void  main(String[] args) {  
        System.out.println(getPermutation( 3 , 5));  
    }  
      
    public  static  String getPermutation( int  n,  int  k) {  
        int [] nums =  new  int [n+ 10 ];  
        int  permCount =  1 ;  
          
        for ( int  i= 0 ; i<n; i++){  
            nums[i] = i+ 1 ;   
            permCount *= (i+ 1 ); 
        }  
        k--; 
        StringBuilder sb =  new  StringBuilder();  
        for ( int  i= 0 ; i<n; i++){  
            permCount = permCount / (n-i);  
            System.out.println("permCount is "+permCount);
            int  idx = k / permCount;
            System.out.println("idx is "+idx);
            sb.append(nums[idx]); 
            
            for ( int  j=idx; j<n-i-1; j++){  
                nums[j] = nums[j+ 1 ];  
            }  
            System.out.println(Arrays.toString(nums));
            k %= permCount;  
        }  
        return  sb.toString();  
    }  


}
