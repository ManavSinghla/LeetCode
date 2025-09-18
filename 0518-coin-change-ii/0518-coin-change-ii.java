class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int m=amount;
        int[][] ans=new int[n+1][m+1];
        ans[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(coins[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else{
                    ans[i][j]=ans[i-1][j]+ans[i][j-coins[i-1]];
                }
            }
        }
        return ans[n][m];
    }
}