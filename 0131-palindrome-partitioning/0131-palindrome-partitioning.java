class Solution {
    boolean palindrome(String s,int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            else{
                low++;
                high--;
            }
        }
        return true;
    }
    void fun(String s,List<List<String>> res,List<String> temp,int start){
        if(s.length() == start ){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(palindrome(s,start,i)){
                temp.add(s.substring(start, i + 1));
                fun(s,res,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        fun(s,res,temp,0);
        return res;
    }
}