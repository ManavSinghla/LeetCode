class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int n=nums.length;
        int m=sum/2;
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
        if(ans[n][m]!=0) return true;
        return false;
    }
}
