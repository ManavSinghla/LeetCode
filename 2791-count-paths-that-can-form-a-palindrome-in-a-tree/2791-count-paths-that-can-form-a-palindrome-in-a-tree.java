class Solution {

    public long countPalindromePaths(List<Integer> parent, String s) {

        int n = parent.size();
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=1;i<n;i++){
            graph.get(parent.get(i)).add(i);
        }

        Map<Integer, Long> map = new HashMap<>();
        return dfs(0, 0, graph, s, map);
    }

    private long dfs(int node, int mask, List<List<Integer>> graph, String s, Map<Integer, Long> map){

        mask ^= (1 << (s.charAt(node) - 'a'));

        long ans = map.getOrDefault(mask, 0L);

        for(int i=0;i<26;i++){
            ans += map.getOrDefault(mask ^ (1<<i), 0L);
        }

        map.put(mask, map.getOrDefault(mask, 0L) + 1);

        for(int child : graph.get(node)){
            ans += dfs(child, mask, graph, s, map);
        }

        return ans;
    }
}