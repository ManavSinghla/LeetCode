class Solution {
    boolean check(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int n=s.length();
        int k=p.length();
        List<Integer> ans=new ArrayList<>();
        if(k>n) return ans;
        for(int i=0;i<k;i++){
            int a=p.charAt(i)-'a';
            freq2[a]++;
        }
        for(int i=0;i<k;i++){
            int a=s.charAt(i)-'a';
            freq1[a]++;
        }
        if(check(freq1,freq2)) ans.add(0);
        for(int i=k;i<n;i++){
            int a=s.charAt(i)-'a';
            int b=s.charAt(i-k)-'a';
            freq1[a]++;
            freq1[b]--;
            if(check(freq1,freq2)) ans.add(i-k+1);
        }
        return ans;
    }
}