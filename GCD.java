
public class GCD {
	public static int gcd(int a, int b){
		
		while(a!=0 && b!=0){
			 a = a % b;
			 if (a==0){
				 break;
			 }
			 b = b % a;
		}
		return Math.max(a,b);
		
	}
	public static void main(String args[]){
		
		System.out.println(gcd(39,9));
	}
}
