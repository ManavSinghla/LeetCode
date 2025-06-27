class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int c = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (c > ans) {
                ans = c;
            }
            if (nums[i] == 0) {
                c = 0;
            } else {
                c++;
            }
        }
        if (c > ans) {
            ans = c;
        }
        return ans;
    }
}