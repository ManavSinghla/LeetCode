class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=101;
            }
        }
        List<Integer> a=new ArrayList<>();
        int i=0;
        int j=0;
        while(a.size() < n*m){
            while(j<m){
                if(ans[i][j]!=101){
                    break;
                }
                a.add(matrix[i][j]);
                ans[i][j]=matrix[i][j];
                j++;
            }
            i++;
            j--;
            while(i<n){
                if(ans[i][j]!=101){
                    break;
                }
                a.add(matrix[i][j]);
                ans[i][j]=matrix[i][j];
                i++;
            }
            i--;
            j--;
            while(j>=0){
                if(ans[i][j]!=101){
                    break;
                }
                a.add(matrix[i][j]);
                ans[i][j]=matrix[i][j];
                j--;
            }
            i--;
            j++;
            while(i>=0){
                if(ans[i][j]!=101){
                    break;
                }
                a.add(matrix[i][j]);
                ans[i][j]=matrix[i][j];
                i--;
            }
            i++;
            j++;
        }
        return a;
    }
}