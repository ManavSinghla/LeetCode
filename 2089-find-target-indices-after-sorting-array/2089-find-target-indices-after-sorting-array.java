class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int e=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) less++;
            if(nums[i]==target) e++;
        }
        for(int i=less;i<less+e;i++){
            ans.add(i);
        }
        return ans;
    }
}