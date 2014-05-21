
public class WaysOfAssemblingBricks {
	//use 1x2 bricks
	public int Ways2xN(int n){
		if (n==0) return 1;
		if (n==1) return 1;
		if (n==2) return 2;
		return Ways2xN(n-1) + Ways2xN(n-2);
	}
	//use 1x2 bricks
//	public int Ways3xN(int n){
//		if(n==0) return 1;
//		if(n==1) return 1;
//		if(n==2) return 2;
//		
//		return 2*Ways3xN(n-2);
//	}
	public static void main(String args[]){
		WaysOfAssemblingBricks solution = new WaysOfAssemblingBricks();
//		System.out.println(solution.distinctWays3xN(5));
	}
}
