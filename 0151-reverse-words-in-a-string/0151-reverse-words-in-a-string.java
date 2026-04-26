class Solution {
    public String reverseWords(String s) {
        char[] arr = s.trim().replaceAll("\\s+", " ").toCharArray();
        
        // Step 1: Reverse whole string
        reverse(arr, 0, arr.length - 1);
        
        // Step 2: Reverse each word
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        
        return new String(arr);
    }
    
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}