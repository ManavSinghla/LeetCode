class Solution {
public:
    int compress(vector<char>& chars) {
        int i=0;
        int index=0;
        int n=chars.size();
        while(i<n){
            int j=i+1;

            while(j<n && chars[i]==chars[j]){
                j++;
            }

            chars[index++]=chars[i];

            int count=j-i;
            if(count>1){
                string c=to_string(count);
                for(char ch:c){
                    chars[index++]=ch;
                }
            }
            i=j;
        }
        return index;
    }
};