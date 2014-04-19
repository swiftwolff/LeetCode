
public class PowerFunction {
	
//	public static double pow(double x, int n) {
//		 if(n<=1&&n>=0){
//	            return x;
//	        }	
//		 double sum = x;	 
//		 if(n<0){
//			 sum = 1;
//			 return powHelperNeg(x,sum,n,0);
//		 }
//	     return powHelperPos(x,sum,n,1);
//	}
//	
//	public static double powHelperPos(double x, double sum, int n, int cur){
//		if(cur==n){
//            return sum;
//        }
//		sum = sum*x;
//        return powHelperPos(x,sum,n,cur+1);
//	}
//	
//	public static double powHelperNeg(double x, double sum, int n, int cur){
//		if(cur==n){
//			return sum;
//		}
//		sum = sum/x;
//		return powHelperNeg(x,sum,n,cur-1);
//	}
	
	public static double power(double x, int n) {
		if (n == 0)
			return 1;
	 
		double v = power(x, n / 2);
	 
		if (n % 2 == 0) {
			return v * v;  // n/2, n/2
		} else {
			return v * v * x;  //v is n/2, n/2, x is the additonal one, b/c either it's odd or even
		}
	}
	 
	public static double pow(double x, int n) {
		if (n < 0) {
			return 1 / power(x, -n);
		} else {
			return power(x, n);
		}
	}
	
	public static void main(String args[]){
//		System.out.println(Math.pow(2,-3));
		System.out.println(pow(-2,-2));
	}
}
