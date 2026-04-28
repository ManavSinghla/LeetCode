class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int ans=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}