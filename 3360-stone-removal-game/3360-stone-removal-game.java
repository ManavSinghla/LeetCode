class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        boolean a=false;
        while(n>0 && i>0){
            if(n-i<0) return a;
            n=n-i;
            i--;
            a=!a;
        }
        return a;
    }
}