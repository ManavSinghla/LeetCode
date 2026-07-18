class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(mid<=h){
            if(nums[mid]==0 && l==mid){
                l++;
                mid++;
            }
            else if(nums[mid]==0){
                nums[mid]=nums[l];
                nums[l]=0;
                l++;
            }
            else if(nums[mid]==2){
                nums[mid]=nums[h];
                nums[h]=2;
                h--;
            }
            else{
                mid++;
            }
        }
    }
}