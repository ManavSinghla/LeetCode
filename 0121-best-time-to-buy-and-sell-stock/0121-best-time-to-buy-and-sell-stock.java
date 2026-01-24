class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int temp=prices[0];
        for(int i=1;i<prices.length;i++){
            temp=Math.min(temp,prices[i]);
            ans=Math.max(ans,prices[i]-temp);
        }
        return ans;
    }
}