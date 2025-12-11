class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int c=0;
        int s=nums.size();
        for(int i=0;i<s;i++){
            if(nums[i]==val){
                c++;
            }
        }
        remove(nums.begin(),nums.end(),val);
        cout<<nums.size()-c;
        return nums.size()-c;
    }
};