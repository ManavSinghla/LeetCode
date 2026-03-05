class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans=new int[heights.length];
        Stack<Integer> s=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            int a=0;
            while(!s.isEmpty() && s.peek()<heights[i]){
                s.pop();
                a++;
            }
            if(!s.isEmpty()) a++;
            ans[i]=a;
            s.push(heights[i]);
        }
        return ans;
    }
}