class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0) q.add(new int[]{i,j});
                else mat[i][j]=-1;
            }
        }
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] node=q.poll();
                for(int j=0;j<4;j++){
                    int x=node[0]+dx[j];
                    int y=node[1]+dy[j];
                    if(x>=0 && y>=0 && x<r && y<c && mat[x][y]==-1){
                        mat[x][y]=mat[node[0]][node[1]]+1;
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
        return mat;
    }
}