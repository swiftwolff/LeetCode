
public class BestTimeToBuyAndSellStockIII {
	
	public int maxProfit(int[] prices) {
		
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int takenIndex = -1;
		for(int i=0;i<prices.length;i++){
			if(takenIndex>0 && i==takenIndex){
				continue;
			}
			for(int j=i+1;j<prices.length;j++){
				if(prices[i]<prices[j] && j!=takenIndex){
					int check = Math.max(max,prices[j]-prices[i]);
					if(check > max){
						sum+= check;
						takenIndex = i;
						max = Integer.MIN_VALUE;
					}
				}
			}
			
		}
		
		return sum;
    }
	
	public static void main(String args[]){
		BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();
		
		
	}
}
