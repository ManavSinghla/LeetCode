class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int m=amount;
        int[][] ans=new int[n+1][m+1];
        for(int i=1;i<=m;i++){
            ans[0][i]=Integer.MAX_VALUE-1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(coins[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else{
                    ans[i][j]=Math.min(ans[i-1][j],ans[i][j-coins[i-1]]+1);
                }
            }
        }
        if(ans[n][m]==Integer.MAX_VALUE-1) return -1;
        return ans[n][m];
    }
}