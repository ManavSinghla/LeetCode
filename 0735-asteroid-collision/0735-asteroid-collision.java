class Solution {
    public int[] asteroidCollision(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<0){
                st.add(arr[i]);
            }
            else{
                // if(!st.isEmpty() && Math.abs(st.peek())==arr[i]){
                //     st.pop();
                //     continue;
                // }
                while(!st.isEmpty() && Math.abs(st.peek())<arr[i]){
                    st.pop();
                }
                if(!st.isEmpty() && Math.abs(st.peek())==arr[i]){
                    st.pop();
                    continue;
                }
                if(st.isEmpty()){
                    ans.add(arr[i]);
                }
            }
        }
        int x=st.size();
        int y=ans.size();
        int[] result=new int[x+y];
        for(int i=0;i<x;i++){
            result[i]=st.pop();
        }
        Collections.reverse(ans);
        for(int i=x+y-1;i>=x;i--){
            result[i]=ans.get(i-x);
        }
        return result;
    }
}