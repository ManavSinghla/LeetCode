class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int a=0;
        int b=x;
        while(b>0){
            a=a*10+b%10;
            b=b/10;
        }
        System.out.println(a);
        if(a==x) return true;
        return false;
    }
}