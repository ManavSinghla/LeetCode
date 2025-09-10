class Solution {
    void fun(List<List<Integer>> ans, List<Integer> temp,int[] candidates, int sum,int target,int start){
        if(target==sum){
            ans.add(new ArrayList(temp));
            return;
        }
        if(sum>target || start==candidates.length){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            fun(ans,temp,candidates,sum+candidates[i],target,i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,candidates,0,target,0);
        return ans;
    }
}