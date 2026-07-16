class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair<Integer,Integer>> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2) q.add(new Pair<>(i,j));
            }
        }
        if(fresh==0) return 0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair<Integer,Integer> curr=q.poll();
                for(int j=0;j<4;j++){
                    int x=curr.getKey()+dx[j];
                    int y=curr.getValue()+dy[j];
                    if(x>=0 && y>=0 && x<n && y<m && grid[x][y]==1){
                        q.add(new Pair<>(x,y));
                        grid[x][y]=2;
                        fresh--;
                    }
                }
            }
            if(!q.isEmpty()) ans++;
        }
        if(fresh!=0) return -1;
        return ans;
    }
}