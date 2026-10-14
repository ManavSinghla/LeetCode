class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans=new StringBuilder();
        while(num>0){
            if(sum>=9){
                ans.append("9");
                sum-=9;
                num--;
            }
            else{
                ans.append(String.valueOf(sum));
                sum=0;
                num--;
            }
        }
        if(sum!=0) return "";
        return ans.toString();
    }
}