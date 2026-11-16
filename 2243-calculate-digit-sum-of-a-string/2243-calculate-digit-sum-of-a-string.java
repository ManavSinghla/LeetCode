class Solution {
    public String digitSum(String s, int k) {
        StringBuilder ans=new StringBuilder(s);
        while(ans.length()>k){
            StringBuilder anst=new StringBuilder();
            int temp=0;
            int c=0;
            for(int i=0;i<ans.length();i++){
                c++;
                temp+=Character.getNumericValue(ans.charAt(i));
                if(c==k){
                    c=0;
                    anst.append(temp);
                    temp=0;
                }
            }
            if(c!=0){
                anst.append(temp);
            }
            ans=anst;
        }
        return ans.toString();
    }
}