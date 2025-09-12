class Solution {
    public int minDistance(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] ans=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            ans[i][0]=i;
        }
        for(int j=0;j<m;j++){
            ans[0][j]=j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                }
                else{
                    ans[i][j]=Math.min(Math.min(ans[i-1][j],ans[i][j-1]),ans[i-1][j-1])+1;
                }
            }
        }
        return ans[n][m];
    }
}