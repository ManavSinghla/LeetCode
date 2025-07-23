class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') a.push(')');
            else if(c=='[') a.push(']');
            else if(c=='{') a.push('}');
            else if(a.empty() || a.pop()!=c) return false;
        }
        return a.empty();
    }
}