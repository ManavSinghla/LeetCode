class Solution {
    void dfs(int[][] mat,int[] temp,int i,int j,int r,int c){
        if(i==r ||j==c ||i<0 || j<0 || mat[i][j]==0) return;
        mat[i][j]=0;
        temp[0]+=1;
        dfs(mat,temp,i,j+1,r,c);
        dfs(mat,temp,i-1,j,r,c);
        dfs(mat,temp,i,j-1,r,c);
        dfs(mat,temp,i+1,j,r,c);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int[] temp={0};
                if(grid[i][j]==1){
                    dfs(grid,temp,i,j,r,c);
                    ans=Math.max(ans,temp[0]);
                }
            }
        }
        return ans;
    }
}