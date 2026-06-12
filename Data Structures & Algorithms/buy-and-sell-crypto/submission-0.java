class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
               int profit=prices[i]-minPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            
        }return maxProfit;
    }
}
