
public class PalindromeNumber {
	
	public static boolean isPalindrome(int x){
		
		if(x<10){
			return false;
		}
		int res=0;
		int count=0;
		int tmp =x;
		int countwo = 0;
		while(tmp!=0){
			res =res^(tmp%10);
			tmp/=10;
			count++;
		}
//		System.out.println(count);
//		System.out.println(res);
		if(count%2!=0){
			while(countwo<=count/2){
				tmp = x %10;
				x/=10;
				countwo++;
			}
//			System.out.println("this is x" + tmp);
			return res==tmp;
			
		}else{
			return res==0;
		}
		
	}
	
	
	public static void main(String args[]){
		int a = -2147447412;
//		while(a!=0){
//			System.out.println(a%10);
//			a/=10;
//		}
//		System.out.println(3^3);
		System.out.println(isPalindrome(a));
	}
}
