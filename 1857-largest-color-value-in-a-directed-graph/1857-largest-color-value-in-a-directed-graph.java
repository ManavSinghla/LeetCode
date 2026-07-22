class Solution {
    int[][] dp;
    int[] state; // 0 = unvisited, 1 = visiting, 2 = visited
    ArrayList<ArrayList<Integer>> adj;
    String colors;
    int n;
    boolean hasCycle = false;
    public int largestPathValue(String colors, int[][] edges) {
        this.colors = colors;
        this.n = colors.length();
        adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for(int[] e : edges)
            adj.get(e[0]).add(e[1]);
        dp = new int[n][26];
        state = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(state[i] == 0) {
                dfs(i);
                if(hasCycle) return -1;
            }
        }
        // find global max
        for(int i = 0; i < n; i++) {
            for(int c = 0; c < 26; c++) {
                ans = Math.max(ans, dp[i][c]);
            }
        }
        return ans;
    }
    public void dfs(int node) {
        if(hasCycle) return;
        if(state[node] == 1) {
            hasCycle = true;
            return;
        }
        if(state[node] == 2) return;
        state[node] = 1; // visiting
        for(int nei : adj.get(node)) {
            dfs(nei);
            if(hasCycle) return;
            for(int c = 0; c < 26; c++) {
                dp[node][c] = Math.max(dp[node][c], dp[nei][c]);
            }
        }
        int colorIndex = colors.charAt(node) - 'a';
        dp[node][colorIndex]++;

        state[node] = 2; // visited
    }
}