class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int lsum=0;
        int rsum=sum-nums[0];
        int j=1;
        int index=-1;
        while(j<n){
            if(lsum==rsum){
                index=j-1;
                break;
            }
            else{
                rsum-=nums[j];
                lsum+=nums[j-1];
                j++;
            }
        }
        if(lsum==rsum){
            index=j-1;
        }
        return index;

    }
};