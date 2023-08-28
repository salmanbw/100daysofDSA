package days100;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum profit from stock "+maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int min = prices[0];

        for(int i=0;i<prices.length;i++){

            if(prices[i] > min){
                if(prices[i] - min > profit)
                    profit = prices[i] - min;
            }else
                min = prices[i];
        }
        return profit;
    }
}
