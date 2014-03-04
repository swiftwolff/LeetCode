public class singleNumberII {
	
	public static int singleNumberCheck(int[] A){
		if (A.length ==  0 )  
            return  0 ;  
        int [] cnt =  new  int [ 32 ];  
        for ( int  i =  0 ; i < A.length; i++)  
        {  
            for ( int  j =  0 ; j <  32 ; j++)  
            {  
                if ( (A[i]>>j &  1 ) == 1 )  
                {  
                    cnt[j] = (cnt[j] +  1 )% 3 ;  
                }  
            }  
        }  
        int  res =  0 ;  
        for ( int  i =  0 ; i <  32 ; i++)  
        {  
            res += (cnt[i] << i);  
        }  
        cnt =  null ;  
        return  res;  
		

	}
	
	public static void main(String args[]){
		
		int[] A = {-2,-2,1,1,-3,1,-3,-3,-4,-2};
//		singleNumberII.singleNumberCheck(A);
//		System.out.print(Integer.toBinaryString(3).length());
		int a = -2;
//		System.out.println(Integer.toBinaryString(-2));
//		System.out.println(Integer.toBinaryString(-2>>1>>1));
//		System.out.println(Integer.toBinaryString(-4>>1));
		System.out.println(singleNumberII.singleNumberCheck(A));
	}
	
	
	
	
}
