class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ci=nums[i]-1;
            if(nums[ci]!=nums[i]){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
                i--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                ans.add(i+1);
            }
        }
        return ans;
    }
}