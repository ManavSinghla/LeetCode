class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd=0;
        int even=1;
        int sum=0;
        int mod=1000000007;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==0){
                ans=(ans+odd)%mod;
                even++;
            }
            else{
                ans=(ans+even)%mod;
                odd++;
            }
        }
        return ans;
    }
}