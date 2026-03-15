class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        for(int j=0;j<m;j++){
            int m0=0;
            int m1=0;
            for(int i=0;i<n;i++){
                if(grid[i][j]==0) m0++;
                else m1++;
            }
            if(m0>m1){
                for(int i=0;i<n;i++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    temp+=(int)Math.pow(2,m-j-1);
                }
            }
            ans+=temp;
        }
        return ans;
    }
}