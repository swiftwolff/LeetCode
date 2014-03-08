
public class BestTimeToBuy {
	public static int maxProfit(int[] prices) {
		if (prices.length<=1){
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        
        for (int i =0;i<prices.length;i++){
            if (i==prices.length-1){
                break;
            }
            min = Math.min(min,prices[i]);
            max = Math.max(prices[i],prices[i+1]);
            sum = Math.max(sum,max-min);
        }
        
        return sum;
	  
    }
	public static void main(String args[]){
		int[] A= {9,0,4,2,1};
		System.out.println(maxProfit(A));
	}
}
