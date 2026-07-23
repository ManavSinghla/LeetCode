class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();

        long[] nextSum = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] > heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSum[i] = 1L * (n - i) * heights[i];
            } else {
                nextSum[i] = 1L * (s.peek() - i) * heights[i];
                nextSum[i] += nextSum[s.peek()];
            }
            s.push(i);
        }

        long[] prevSum = new long[n];
        s.clear();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] > heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                prevSum[i] = 1L * (i + 1) * heights[i];
            } else {
                prevSum[i] = 1L * (i - s.peek()) * heights[i];
                prevSum[i] += prevSum[s.peek()];
            }
            s.push(i);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, prevSum[i] + nextSum[i] - heights[i]);
        }
        return ans;
    }
}