class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] result = new int[total][2];
        
        int count = 0;
        int r = rStart, c = cStart;
        
        result[count++] = new int[]{r, c};
        
        int step = 1;
        
        while(count < total){
            
            // move right
            for(int i = 0; i < step; i++){
                c++;
                if(r >= 0 && r < rows && c >= 0 && c < cols)
                    result[count++] = new int[]{r, c};
            }
            
            // move down
            for(int i = 0; i < step; i++){
                r++;
                if(r >= 0 && r < rows && c >= 0 && c < cols)
                    result[count++] = new int[]{r, c};
            }
            
            step++;
            
            // move left
            for(int i = 0; i < step; i++){
                c--;
                if(r >= 0 && r < rows && c >= 0 && c < cols)
                    result[count++] = new int[]{r, c};
            }
            
            // move up
            for(int i = 0; i < step; i++){
                r--;
                if(r >= 0 && r < rows && c >= 0 && c < cols)
                    result[count++] = new int[]{r, c};
            }
            
            step++;
        }
        
        return result;
    }
}