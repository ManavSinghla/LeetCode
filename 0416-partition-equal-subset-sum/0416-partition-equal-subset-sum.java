class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int m=sum/2;
        int[][] ans=new int[n+1][m+1];
        // ans[0][0]=1;
        for(int i=0;i<=n;i++){
            ans[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(nums[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else{
                    ans[i][j]=ans[i-1][j]+ans[i-1][j-nums[i-1]];
                }
            }
        }
        System.out.println(ans[n][m]);
        return ans[n][m]>0;
    }
}