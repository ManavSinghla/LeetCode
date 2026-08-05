class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int n=s.length();
        int ans=0;
        int temp=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))==2){
                while(map.get(s.charAt(i))==2){
                    map.put(s.charAt(j),map.get(s.charAt(j))-1);
                    j++;
                }
            }
            temp=i-j+1;
            ans=Math.max(temp,ans);
        }
        return ans;
    }
}