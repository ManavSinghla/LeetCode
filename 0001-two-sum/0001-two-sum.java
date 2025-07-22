class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],i);
        }
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(target-nums[i]) && a.get(target-nums[i]) != i){
                ans[0]=i;
                ans[1]=a.get(target-nums[i]);
            }
        }
        return ans;
    }
}