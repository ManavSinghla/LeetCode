class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)==st.peek()){
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            ans.append(st.pollLast());
        }
        return ans.toString();
    }
}