public class UniquePath {
	
	public static int unique(int m,int n){
		
		return factorial(m-1+n-1)/(factorial(m-1)*factorial(n-1));
	}
	
	public static int factorial(int n){
		if (n==0){
			return 1;
		}
		return n*factorial(n-1);
	}
	
	
	public static void main(String args[]){
		System.out.println(UniquePath.unique(2,2));
	}
}
