class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n=prices.length;
        int temp=0;
        int min=prices[0];
        for(int i=0;i<n;i++){
            if(temp<(prices[i]-min)){
                temp=prices[i]-min;
            }
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return temp;
    }
}