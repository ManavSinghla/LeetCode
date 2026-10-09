class Solution {
    public int minInsertions(String s) {
        int ans=0;
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if (close == 1) {
                    if(open>=1){
                        ans++;
                        close = 0;
                        open--;
                    }
                    else{
                        ans+=2;
                        close = 0;
                    }
                }
                open++;
            }
            else close++;
            if(close==2){
                if(open>=1){
                    open--;
                    close=0;
                }
                else{
                    ans++;
                    close=0;
                }
            }
        }
        if(open==0 && close==1){
            ans+=2;
        }
        if(open>=1){
            ans+=open*2;
            if(close==1) ans--;
        }
        return ans;
    }
}