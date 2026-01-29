class Solution {
    public int[] psi(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        ans[0] = -1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] nsi(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        ans[n - 1] = n;
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nextSmallerIdx = nsi(heights);
        int[] preSmallerIdx = psi(heights);

        int largestRec = 0;
        for (int i = 0; i < n; i++) {
            int width = nextSmallerIdx[i] - preSmallerIdx[i] - 1;
            int area = heights[i] * width;
            largestRec = Math.max(largestRec, area);
        }
        return largestRec;
    }
}
