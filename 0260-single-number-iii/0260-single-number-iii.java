class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        
        // Step 1: XOR all numbers
        for (int num : nums) {
            xor ^= num;
        }
        
        // Step 2: Find rightmost set bit
        int diff = xor & (-xor);
        
        int a = 0, b = 0;
        
        // Step 3: Divide into two groups
        for (int num : nums) {
            if ((num & diff) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        
        return new int[]{a, b};
    }
}