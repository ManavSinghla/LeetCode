class Solution {
    int f(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
    int l(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=f(nums,target);
        ans[1]=l(nums,target);
        return ans;
    }
}