class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        StringBuilder a=new StringBuilder(s);
        StringBuilder b=new StringBuilder(s);
        b.reverse();
        int[][] ans=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1]+1;
                }
                else{
                    ans[i][j]=Math.max(ans[i][j-1],ans[i-1][j]);
                }
            }
        }
        return ans[n][n];
    }
}