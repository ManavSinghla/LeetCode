class Solution {
    void fun(int[] nums,List<List<Integer>> res,List<Integer> temp,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            fun(nums,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(nums,res,temp,0);
        return res;
    }
}