class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        int temp=0;
        while(r>l){
            temp=Math.min(height[l],height[r]);
            ans=Math.max(ans,temp*(r-l));
            if(height[l]>height[r]) r--;
            else l++;
        }
        return ans;
    }
}