class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<token.length;i++){
            if(token[i].equals("+")){
                int temp1=s.pop();
                int temp2=s.pop();
                s.push(temp1+temp2);
            }
            else if(token[i].equals("-")){
                int temp2=s.pop();
                int temp1=s.pop();
                s.push(temp1-temp2);

            }
            else if(token[i].equals("*")){
                int temp2=s.pop();
                int temp1=s.pop();
                s.push(temp1*temp2);

            }
            else if(token[i].equals("/")){
                int temp2=s.pop();
                int temp1=s.pop();
                s.push(temp1/temp2);
            }
            else{
                int a=Integer.parseInt(token[i]);
                s.push(a);
            }
        }
        return s.peek();
    }
}