class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(a.containsKey(t.charAt(i)) && a.get(t.charAt(i))>0){
                a.put(t.charAt(i),a.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}