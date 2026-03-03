package biweeklyTest3;

public class BuyAndSell {
	
	int maxProfit(int[] prices) {
		
		  int profit = 0;
	      int buying_price = prices[0];

	      for(int i=1; i<prices.length; i++){
	            
	    	  if(prices[i] < buying_price){
	    		  buying_price = prices[i];
	    	  }

	            profit = Math.max(profit, prices[i] - buying_price); 
	    	 
	       }
	       return profit;
	}
	
	public static void main(String[] args) {
		
		int[] prices = new int[]{7,1,5,3,6,4};
		
		BuyAndSell b = new BuyAndSell();
		System.out.println(b.maxProfit(prices));
	}
}
