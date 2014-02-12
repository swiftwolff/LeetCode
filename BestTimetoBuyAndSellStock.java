public class BestTimetoBuyAndSellStock {
	public static int maxProfit(int[] prices){
		int min = Integer.MAX_VALUE;
		int profit = Integer.MIN_VALUE;
		
		for (int i = 0;i<prices.length;i++){
			if (i+1==prices.length){
				break;
			}
			min = Math.min(min, prices[i]);
			profit = Math.max(profit, prices[i+1]-min);
			
		}
		
		if (profit<0){
			return 0;
		}
		return profit;
		
	}
	
	public static void main(String args[]){
		int[] A = {1,1,2,0,7};

		System.out.println(BestTimetoBuyAndSellStock.maxProfit(A));
		
		
	}
}
