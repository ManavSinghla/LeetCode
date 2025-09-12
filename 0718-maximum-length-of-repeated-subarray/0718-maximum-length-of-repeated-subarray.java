class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[][] ans=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(nums1[i-1]==nums2[j-1]){
                    ans[i][j]=ans[i-1][j-1]+1;
                }
                else{
                    ans[i][j]=Math.max(ans[i][j-1],ans[i-1][j]);
                }
            }
        }
        return ans[n][m];
    }
}