class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int down=matrix[i+1][j];
                int left=0;
                if(j>0) left=matrix[i+1][j-1];
                else left=Integer.MAX_VALUE;
                int right=0;
                if(j>n-1) right=matrix[i+1][j+1];
                else right=Integer.MAX_VALUE;
                matrix[i][j]+=Math.min(right,Math.min(down,left));
            }
        }
        int ans=matrix[0][0];
        for(int i=0;i<n;i++){
            ans=Math.min(ans,matrix[0][i]);
        }
        return ans;
    }
}