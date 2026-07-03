class Solution {
    public int countPrimes(int n) {
        boolean[] a=new boolean[n];
        if(n<=1) return 0;
        for(int i=0;i<n;i++){
            a[i]=true;
        }
        a[0]=false;
        a[1]=false;
        int c=0;
        for(int i=2;i<n;i++){
            if(a[i]==true){
                c++;
                for(int j=i;j<n;j+=i){
                    a[j]=false;
                }
            }
        }
        return c;
    }
}