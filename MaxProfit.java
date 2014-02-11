public class MaxProfit {
    public static int maxProfit(int[] prices) {
        
    	if (prices.length==0){
    		return 0;
    	}
    	
    	if (prices.length==1){
    		return 0;
    	}
    	
    	int share = 0;
        int profit = 0;
        int price = 0;

        int low = Math.min(prices[0],prices[1]);
        int high = Math.max(prices[0],prices[1]);
    	
    	
        if (prices.length == 2){
        	low = prices[0];
        	high = prices[1];
        	if (low > high){
        		return 0;
        	}
            return high - low;
        }
        
        
        
        for (int i=2;i<prices.length;i++){
            if(prices[i]<=low&&prices[i]!=0){

                low = prices[i];
                if (share == 0){ 
                    share++;
                    profit -= prices[i];
                    price = prices[i];

                }else{

                	share += profit/prices[i];
                    profit -= prices[i]*share;
                    price = prices[i];  

                }
            }
            
            else if(prices[i]>=high){

                high = prices[i];
                if (share!=0){
                    profit += share*prices[i];
                    share = 0;
                }    
            }
            
            if (i==prices.length-1 && price < prices[i]){
            	profit += share*prices[i];
                share = 0;
            }
                
        }
        
        return profit;
        
    }
    
    public static void main(String args[]){
    	
    	int[] a = {2,1,6,8,10,12};
//    	MaxProfit.maxProfit(a);
    	System.out.print(MaxProfit.maxProfit(a));
    }
    
}