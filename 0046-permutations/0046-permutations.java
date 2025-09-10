class Solution {
    void fun(List<List<Integer>> ans,List<Integer> temp,int[] nums,int start){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            fun(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,nums,0);
        return ans;
    }
}