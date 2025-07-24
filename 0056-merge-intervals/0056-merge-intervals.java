class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][0];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans =new ArrayList<>();
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=current[1]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }
            else{
                ans.add(current);
                current=intervals[i];
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);
    }
}