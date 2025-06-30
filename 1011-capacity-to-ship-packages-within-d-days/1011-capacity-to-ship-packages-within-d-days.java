class Solution {
    boolean check(int[] weights,int days,int mid){
        int c=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>mid){
                c++;
                sum=weights[i];
            }
            else{
                sum+=weights[i];
            }
        }
        if(c<=days){
            return true;
        }
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=weights[0];
        int high=0;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
            if(low<weights[i]){
                low=weights[i];
            }
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}