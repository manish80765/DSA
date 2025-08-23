package Array;

import java.util.Arrays;

public class maxProfit {
public static int maxProfit(int[] prices) {
	if (prices.length < 2) return 0;

    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]; 
        } else {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
}
/*	if(prices.length==1)return 0;
	 int minIndex = 0;
	 int minValue = prices[0];
	  int maxprofit=0;
     for (int i = 1; i <prices.length; i++) {
         if (prices[i] < minValue) {
             minValue = prices[i];
             minIndex = i;
         }
         for(int j=0; j<prices.length; j++)
         {
        	 if(maxprofit<prices[j]-minValue&& minIndex<j)
        	 {
        		 maxprofit=prices[j]-minValue;
        	 }
         }   
     }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {2,4,1}));

	}

}
