class Solution {
    boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
    void fun(int[] ans,List<Integer> temp,int[] nums,boolean[] vis){
        if(temp.size()==nums.length){
            ans[0]++;
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !vis[i-1]) continue;
            if(temp.size() > 0 && !isPerfectSquare(temp.get(temp.size()-1) + nums[i])) continue;
            vis[i]=true;
            temp.add(nums[i]);
            fun(ans,temp,nums,vis);
            temp.remove(temp.size()-1);
            vis[i]=false;
        }
    }
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        int[] ans={0};
        fun(ans,temp,nums,vis);
        return ans[0];
    }
}