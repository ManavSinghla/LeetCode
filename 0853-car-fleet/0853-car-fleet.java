class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=position[i];
            arr[i][1]=(target-position[i])/speed[i];
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(b[0],a[0]));
        int c=1;
        int temp=arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][1]>temp){
                c++;
                temp=arr[i][1];
            }
        }
        return c;
    }
}