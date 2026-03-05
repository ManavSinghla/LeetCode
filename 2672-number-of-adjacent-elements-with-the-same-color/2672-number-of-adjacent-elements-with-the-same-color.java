class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int[] colors = new int[n];
        int[] ans = new int[queries.length];

        int count = 0;

        for (int q = 0; q < queries.length; q++) {
            int i = queries[q][0];
            int c = queries[q][1];

            if (colors[i] != 0) {

                if (i > 0 && colors[i] == colors[i - 1]) count--;
                if (i < n - 1 && colors[i] == colors[i + 1]) count--;
            }

            colors[i] = c;

            if (i > 0 && colors[i] == colors[i - 1]) count++;
            if (i < n - 1 && colors[i] == colors[i + 1]) count++;

            ans[q] = count;
        }

        return ans;
    }
}