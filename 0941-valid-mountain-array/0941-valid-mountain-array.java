class Solution {
    public boolean validMountainArray(int[] arr) {
        int f=0;
        int c=0;
        if(arr.length<3){
            return false;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && f!=0){
                return false;
            }
            else if(arr[i]>arr[i-1]){
                c++;
            }
            else if(arr[i]<arr[i-1]){
                f=1;
            }
            else{
                return false;
            }
        }
        if(f==0 || c==0){
            return false;
        }
        return true;
    }
}