class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int a=10;
        int b=9;
        int c=9;
        while(n>1 && c>0){
            b=b*c;
            a+=b;
            c--;
            n--;
        }
        return a;
    }
}