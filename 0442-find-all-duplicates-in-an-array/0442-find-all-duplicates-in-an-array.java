class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci]){
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j]-1!=j){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}