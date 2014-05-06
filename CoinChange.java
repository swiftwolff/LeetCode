
public class CoinChange {
	
	public int waysCoinChnge(int money, int change){
		
		int nextDemo =0;
		if(change==10){
			nextDemo=5;
		}
		else if(change==5){
			nextDemo = 1;
		}else{
			return 1;
		}
//		if(change==25){
//			nextDemo = 10;
//		}else if(change==10){
//			nextDemo = 5;
//		}else if(change==5){
//			nextDemo = 1;
//		}else{
//			return 1;
//		}
		
		int ways = 0;
		for(int i=0;i*change<=money;i++){
			
			ways += waysCoinChnge(money-i*change,nextDemo);
			
		}
		
		return ways;
	}
	
	
	
	
	
	
	public static void main(String args[]){
		CoinChange solution = new CoinChange();
		System.out.println(solution.waysCoinChnge(10, 10));
	}
}
