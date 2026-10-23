class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        double sum=0;
        double mod=Math.pow(10,9)+7;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=i+1;
            }
            else{
                left[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                right[i]=n-i;
            }
            else{
                right[i]=st1.peek()-i;
            }
            st1.push(i);
        }
        for(int i=0;i<n;i++){
            long cont=(long) arr[i]*left[i]*right[i];
            sum=(sum+cont)%mod;
        }
        return (int) sum;
    }
}