class Solution {
    int fOccurence(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                high=mid-1;
                ans=mid;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
    int lOccurence(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                low=mid+1;
                ans=mid;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=fOccurence(nums,target);
        ans[1]=lOccurence(nums,target);
        return ans;
    }
}