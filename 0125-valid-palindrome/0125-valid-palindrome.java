class Solution {
    boolean isAlpha(char c) {
        if (('0' <= c && c <= '9') || ('a' <= c && c <= 'z')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(j>i){
            if(!isAlpha(a.charAt(i))) i++;
            else if(!isAlpha(a.charAt(j))) j--;
            else{
                if(a.charAt(i)!=a.charAt(j)){
                    System.out.println(a.charAt(i));
                    System.out.println(a.charAt(j));
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}