class Solution {
    int firstOccurence(int[] arr,int key){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    int lastOccurence(int[] arr,int key){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0]=(firstOccurence(nums,target));
        res[1]=(lastOccurence(nums,target));
        return res;
    }
}