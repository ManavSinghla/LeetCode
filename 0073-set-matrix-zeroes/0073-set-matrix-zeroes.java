class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> count=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    count.add(new int[]{i,j});
                }
            }
        }
        for(int j=0;j<count.size();j++){
            int row=count.get(j)[0];
            int col=count.get(j)[1];
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
            for(int i=0;i<matrix[0].length;i++){
                matrix[row][i]=0;
            }
        }
    }
}