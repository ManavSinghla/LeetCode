class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=-1;
        int a=-1;
        for(int i=0;i<dimensions.length;i++){
            if(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]==a){
                a=(dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]);
                ans=Math.max(dimensions[i][0]*dimensions[i][1],ans);
            }
            else if(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]>a){
                a=(dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]);
                ans=dimensions[i][0]*dimensions[i][1];
            }
        }
        return ans;
    }
}