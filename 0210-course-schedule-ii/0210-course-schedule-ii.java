class Solution {
    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][1];
            int v = edges[i][0];
            adj.get(u).add(v);
        }

        // Step 2: Compute indegrees
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int node = adj.get(i).get(j);
                indegree[node]++;
            }
        }

        // Step 3: Add all nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 4: Process the queue
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int temp = q.poll();
            ans.add(temp);
            for (int neighbor : adj.get(temp)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }
        if (ans.size() != V) {
            return new int[0];
        }
        int[] result = new int[V];
        for (int i = 0; i < V; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}