class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length && i<g.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                ans++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}