class Solution {
    void fun(List<List<Integer>> ans, List<Integer> temp, int sum, int[] nums, int target, int start){
        if(sum==target && !ans.contains(temp)) ans.add(new ArrayList<>(temp));
        if(sum>target) return;
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            fun(ans,temp,sum+nums[i],nums,target,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,0,candidates,target,0);
        return ans;
    }
}