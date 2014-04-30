import java.util.Arrays;


public class BestTimeToBuyAndSellStockIII {
	
	public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        int max = -10;
        
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
            left[i] = prices[i]-min>0?prices[i]-min:0;
            min = Math.min(prices[i],min);
        }
        
        for(int j=prices.length-1;j>-1;j--){
        	if(j==prices.length-1){
        		max = prices[j];
        	}else{
        		right[j] = Math.max(max-prices[j],right[j+1]);
        		max = Math.max(max,prices[j]);
        	}
        	
        }
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
        int sum = 0;
        for(int i=0;i<prices.length;i++){
            sum = Math.max(sum,left[i]+right[i]);
        }
        
        return sum;
    }
	
	public static void main(String args[]){
		int[] prices = {1,2,3,4,5};
		BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();
		System.out.println(solution.maxProfit(prices));
		
	}
}
