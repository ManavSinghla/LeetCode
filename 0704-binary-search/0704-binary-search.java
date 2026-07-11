class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(h>=l){
            int mid=l+(h-l)/2;
            if(target==nums[mid]) return mid;
            else if(target>=nums[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}