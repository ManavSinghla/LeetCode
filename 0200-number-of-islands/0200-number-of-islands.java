class Solution {
    void dfs(char[][] mat,int i,int j,int r,int c){
        if(i==r || j==c || i<0 || j<0 || mat[i][j]=='0') return;
        mat[i][j]='0';
        dfs(mat,i,j+1,r,c);
        dfs(mat,i-1,j,r,c);
        dfs(mat,i,j-1,r,c);
        dfs(mat,i+1,j,r,c);
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j,r,c);
                    ans++;
                }
            }
        }
        return ans;
    }
}