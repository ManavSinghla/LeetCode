class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int c=0;
        int start=meetings[0][0];
        int end=meetings[0][1];
        for(int i=0;i<meetings.length;i++){
            int s=meetings[i][0];
            int e=meetings[i][1];

            if(s<=end){
                end=Math.max(end,e);
            }
            else{
                c+=end-start+1;
                start=s;
                end=e;
            }
        }
        c+=end-start+1;
        return days-c;
    }
}