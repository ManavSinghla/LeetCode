class Solution {
    public boolean findSubarrays(int[] nums) {
        if(nums.length<2) return false;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            int cs=nums[i]+nums[i+1];
            a.put(cs,a.getOrDefault(cs,0)+1);
            if(a.get(cs)>1) return true;
        }
        return false;
    }
}