class Solution {
    void fun(List<List<Integer>> ans,List<Integer> temp,int[] nums,int start){
        ans.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            fun(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,nums,0);
        return ans;
    }
}