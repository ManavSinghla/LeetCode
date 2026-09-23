class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer, Integer> ranks=new TreeMap<>(Collections.reverseOrder());
        int n=score.length;
        for(int i=0;i<n;i++){
            ranks.put(score[i],i);
        }
        String[] ans=new String[n];
        int rank=1;
        for(int key: ranks.keySet()){
            if(rank==1){
                ans[ranks.get(key)]="Gold Medal";
            }
            else if(rank==2){
                ans[ranks.get(key)]="Silver Medal";
            }
            else if(rank==3){
                ans[ranks.get(key)]="Bronze Medal";
            }
            else{
                ans[ranks.get(key)]=Integer.toString(rank);
            }
            rank++;
        }
        return ans;
    }
}