class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] l=new int[n];
        int[] r=new int[n];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int a=Math.min(l[i],r[i]);
            if(a>height[i]) ans+=a-height[i];
        }
        return ans;
    }
}