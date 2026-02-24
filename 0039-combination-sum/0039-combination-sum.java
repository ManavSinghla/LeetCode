class Solution {
    void fun(List<List<Integer>> ans, List<Integer> temp,int sum,int[] candidates,int target,int start){
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target) return;
        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            fun(ans,temp,sum+candidates[i],candidates,target,i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,0,candidates,target,0);
        return ans;
    }
}