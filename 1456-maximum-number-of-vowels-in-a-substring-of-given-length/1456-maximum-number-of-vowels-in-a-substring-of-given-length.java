class Solution {
    public int maxVowels(String s, int k) {
        if (k > s.length()) return 0;
        int vowelCount=0;
        int maxVowelCount=0;
        for(int i= 0; i<k; i++){
           char ch=s.charAt(i);
           if(isVowel(ch)){
             vowelCount++;
           }
        }
        maxVowelCount = vowelCount;
        for(int j=k; j<s.length(); j++){
           char left=s.charAt(j - k);
           char right=s.charAt(j);
           if(isVowel(left)){
             vowelCount--;
           }
           if(isVowel(right)){
            vowelCount++;
           }
           maxVowelCount=Math.max(maxVowelCount, vowelCount);
        }
        return maxVowelCount;
    }
    boolean isVowel(char ch){
        return ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u';
    }
}