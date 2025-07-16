class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int low=prices[0];
        for(int i=0;i<prices.length;i++){
            low=Math.min(low,prices[i]);
            ans=Math.max(ans,prices[i]-low);
        }
        return ans;
    }
}