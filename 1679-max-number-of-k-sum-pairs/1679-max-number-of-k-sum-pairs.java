class Solution {
    public int maxOperations(int[] nums, int k) {
        // Sort the array to use two-pointer technique
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == k) {
                // Found a valid pair
                count++;
                i++;
                j--;
            } else if (sum > k) {
                // Too big, move the end pointer
                j--;
            } else {
                // Too small, move the start pointer
                i++;
            }
        }

        return count;
    }
}