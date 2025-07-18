class Solution {
    void dfs(int[][] mat,int i,int j,int r,int c,int oldC,int newC){
        if(i==r|| j==c|| i<0|| j<0|| mat[i][j]!=oldC|| mat[i][j]==newC) return;
        mat[i][j]=newC;
        dfs(mat,i,j-1,r,c,oldC,newC);
        dfs(mat,i-1,j,r,c,oldC,newC);
        dfs(mat,i,j+1,r,c,oldC,newC);
        dfs(mat,i+1,j,r,c,oldC,newC);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r=image.length;
        int c=image[0].length;
        int oldC=image[sr][sc];
        dfs(image,sr,sc,r,c,oldC,color);
        return image;
    }
}