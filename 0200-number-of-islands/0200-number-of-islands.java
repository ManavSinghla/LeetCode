class Solution {
    void fun(char[][] grid,int i,int j,int r,int c){
        if(i<0 || j<0 || i>r-1 || j>c-1 || grid[i][j]=='0') return;
        grid[i][j]='0';
        fun(grid,i+1,j,r,c);
        fun(grid,i,j+1,r,c);
        fun(grid,i-1,j,r,c);
        fun(grid,i,j-1,r,c);
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    fun(grid,i,j,r,c);
                    ans++;
                }
            }
        }
        return ans;
    }
}