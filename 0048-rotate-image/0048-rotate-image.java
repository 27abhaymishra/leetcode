class Solution {
    public void rotate(int[][] matrix) {
   int m = matrix.length;
   int n = matrix[0].length;
          for(int i = 0; i<m; i++){
            for(int j =0; j<i; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
            }
        }

       for(int k = 0;  k<m; k++){
        int i = 0 , j=matrix[k].length-1;
        while(i < j){
            int temp = matrix[k][i];
            matrix[k][i] = matrix[k][j];
            matrix[k][j] = temp;
            i++;
            j--;
        }
       }


    }
}