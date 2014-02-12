public class singleNumberII {
	
	public static int singleNumberCheck(int[] A){
		
		int[] bits = new int[32];
		
		for (int i =0;i<A.length;i++){
			for(int j=0;j<Integer.toBinaryString(A[i]).length();j++){
				bits[j] += A[i]>>j & 1;

			}
		}

		
		for (int i = 0;i<bits.length;i++){
			bits[i]=bits[i] % 3;
		}


		double ans = 0;
		int sum = 0;
		
		for (int i=0;i<bits.length;i++){
			ans = bits[i]*Math.pow(2, i);  //bits[i] << i
			sum += (int)ans;
		}
		
		return sum;
	}
	
	public static void main(String args[]){
		
		int[] A = {3,3,3,4,4,4,5};
//		singleNumberII.singleNumberCheck(A);
//		System.out.print(Integer.toBinaryString(3).length());
		System.out.println(singleNumberII.singleNumberCheck(A));
	}
	
	
	
	
}
