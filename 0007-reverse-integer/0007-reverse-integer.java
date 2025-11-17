class Solution {
    public int reverse(int x) {
        int ans=0;
        while(x!=0){
            if(ans>Math.pow(2,31)/10 ||  ans<Math.pow(-2,31)/10) return 0;
            ans=x%10+ans*10;
            x=x/10;
        }
        return ans;
    }
}