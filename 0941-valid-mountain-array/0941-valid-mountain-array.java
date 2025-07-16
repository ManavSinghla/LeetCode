class Solution {
    public boolean validMountainArray(int[] arr) {
        int c=0;
        int c1=0;
        int f=0;
        for(int i=0;i<arr.length-1;i++){
            if(f==0 && arr[i]<arr[i+1]){
                c++;
            }
            else if(f==0 && arr[i]>arr[i+1]){
                f=1;
            }
            else if(f==1 && arr[i]>arr[i+1]){
                c1++;
            }
            else{
                return false;
            }
        }
        if(f==0 || c==0 || c==0) return false;
        return true;
    }
}