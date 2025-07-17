class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if((target+sum)%2!=0 || Math.abs(target)>sum) return 0;
        int m=(target+sum)/2;
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