
public class Solution {
	public static int reverse(int x){
		int[] rev;
		int tmp = x;
		int c = 0;
		int t;
		double ans = 0;
		
		while(tmp != 0){
			tmp/=10;
			c++;
		}
		
		rev = new int[c];
		for(int i=0;i<c;i++){
			rev[i] = x % 10;
			x/=10;
		}
		
		t = c-1;
		for(int i=0;i<c;i++){
			ans += rev[i]*Math.pow(10,t--);
		}
		
		return (int) ans;
		
		
	}
	
	public static void main(String args[]){
		System.out.println(Solution.reverse(-123));
	}
}
