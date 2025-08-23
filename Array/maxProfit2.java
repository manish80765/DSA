package Array;

public class maxProfit2 {
static int maxProfit(int[] prices)
{
	if (prices.length < 2) return 0;

    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]; 
        } else {
            int profit = prices[i] - minPrice;            
                maxProfit += profit;    
                minPrice=prices[i];
    }
    }
    return maxProfit;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}

}
