
public class SqrtX {
	
	public static int sqrt(int x) {
        
		double diff = 0.01;
		double start = 0;
		double end = x;
		if(x <=0){
			return 0;
		}
		
		while(start<end){
			double mid = (start + end)/2;
			if(mid*mid-x>diff){
				end = mid;
			}else if(mid*mid-x<0){
				start = mid;
			}else{
				return (int) mid;
			}
		}
		
		return 0;
    }
	
	public static void main(String args[]){
		System.out.println(sqrt(-3));
	}
}
