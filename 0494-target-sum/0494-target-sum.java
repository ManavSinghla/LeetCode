class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int m=sum+target;
        if(m%2!=0 || sum<Math.abs(target)) return 0;
        m=m/2;
        int[][] ans=new int[n+1][m+1];
        ans[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(nums[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else{
                    ans[i][j]=ans[i-1][j]+ans[i-1][j-nums[i-1]];
                }
            }
        }
        return ans[n][m];
    }
}