class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int a=1;a<=n;a++){
            for(int b=a+1;b<=n;b++){
                int c= b*b + a*a;
                int c1=(int) Math.sqrt(c);
                if(c1*c1==c && c1<=n) ans+=2;
            }
        }
        return ans;
    }
}