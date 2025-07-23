class Solution {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0, maxLen = 0;

        // Left to right pass
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') open++;
            else close++;
            if (open == close) {
                maxLen = Math.max(maxLen, 2 * close);
            } else if (close > open) {
                open = close = 0;
            }
        }

        // Right to left pass
        open = close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') open++;
            else close++;
            if (open == close) {
                maxLen = Math.max(maxLen, 2 * open);
            } else if (open > close) {
                open = close = 0;
            }
        }

        return maxLen;
    }
}