class Solution {
    public int longestMountain(int[] arr) {
        int ans=0;
        int n=arr.length;
        for(int j=0;j<n;j++){
            int i=j;
            int k=i;
            int temp=1;
            while(i<n-1){
                if(arr[i]<arr[i+1]){
                    i++;
                    temp++;
                }
                else break;
            }
            if(i==k || i==n-1 || arr[i]==arr[i+1]) continue;
            while(i<n-1){
                if(arr[i]>arr[i+1]){
                    i++;
                    temp++;
                }
                else break;
            }
            if(i==k) continue;
            j=i-1;
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}