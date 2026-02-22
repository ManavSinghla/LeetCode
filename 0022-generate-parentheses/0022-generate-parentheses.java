class Solution {
    void fun(List<String> ans, String temp,int n,int open, int close){
        if(n==close) ans.add(temp);
        if(open<n){
            fun(ans,temp+'(',n,open+1,close);
        }
        if(close<open){
            fun(ans,temp+')',n,open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String temp="";
        fun(ans,temp,n,0,0);
        return ans;
    }
}