class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans={0,numbers.length-1};
        while(ans[0]<ans[1]){
            if(numbers[ans[0]]+numbers[ans[1]]==target){
                ans[0]++;
                ans[1]++;
                return ans;
            }
            if(numbers[ans[0]]+numbers[ans[1]]>target){
                ans[1]--;
            }
            else{
                ans[0]++;
            }
        }
        return ans;
    }
}