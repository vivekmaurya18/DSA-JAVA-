
// Multiple Transaction Allowed

class buyAndSell {
    public int maxProfit(int[] prices) {
        // code here
        
        int n=prices.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
    }
}
