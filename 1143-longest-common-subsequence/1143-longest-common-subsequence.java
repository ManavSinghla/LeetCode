class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n=text2.length();
        int[][] ans=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1]+1;
                }
                else{
                    ans[i][j]=Math.max(ans[i-1][j],ans[i][j-1]);
                }
            }
        }
        return ans[m][n];
    }
}