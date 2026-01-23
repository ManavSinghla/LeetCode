class Solution {
    int fO(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(h>=l){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans=mid;
                h=mid-1;   
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return ans;
    }
    int lO(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(h>=l){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans=mid;
                l=mid+1;   
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=fO(nums,target);
        ans[1]=lO(nums,target);
        return ans;
    }
}