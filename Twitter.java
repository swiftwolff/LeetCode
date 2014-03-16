public class Twitter {
	
	public static int solution(String s){
		
		int[] alphbet = new int[26];
		int odd = 0;
		for(int i=0;i<s.length();i++){
			alphbet[s.charAt(i) - 'a'] += 1;
		}
		
		for(int j=0;j<alphbet.length;j++){
			if(alphbet[j] % 2!=0){
				odd+=1;
			}
		}
		if (odd>1){
			return 0;
		}
		
		return 1;
	}
	
	public static int solutionTwo(int[] A, int N){
		int out = 0;
		for(int i=0;i<N;i++){
			
			if(i+A[i]<0||i+A[i]>0||A[i+A[i]]==A[i]){
				out+=1;
			}
			
		}
		return out;
	}
	
	public static void main(String args[]){
		int[] A = {3,-5,0,-1,-3};
		System.out.println(solutionTwo(A,5));
	}
}
