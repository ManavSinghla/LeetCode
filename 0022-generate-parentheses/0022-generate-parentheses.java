class Solution {
    void fun(List<String> res, String ans,int open,int close,int n){
        if(close==n){
            res.add(ans);
        }
        if(open<n){
            fun(res,ans+'(',open+1,close,n);
        }
        if(open>close){
            fun(res,ans+')',open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        String ans="";
        fun(res,ans,0,0,n);
        return res;
    }
}