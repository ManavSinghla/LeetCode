class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.add(')');
            else if(s.charAt(i)=='[') st.add(']');
            else if(s.charAt(i)=='{') st.add('}');
            else{
                if(st.isEmpty() || st.peek()!=s.charAt(i)) return false;
                else st.pop();
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}