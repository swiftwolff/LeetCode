
public class LCM {
	
	public static int gcd(int x, int y){
		
		while(x!=0&&y!=0){
			x = x % y;
			if(x==0){
				break;
			}
			y = y % x;
		}

		return Math.max(x ,y);
	}
	
	public static int lcm(int x, int y){
		int gcomd = gcd(x,y);
		
		return (x*y)/gcomd;
	}
	
	public static void main(String args[]){
		System.out.println(lcm(11,7));
	}
}
