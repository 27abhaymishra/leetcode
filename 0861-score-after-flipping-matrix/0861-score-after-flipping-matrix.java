class Solution {
    public int matrixScore(int[][] arr) {
    int m = arr.length;
    int n = arr[0].length;

//Putting 1 in 0th postion of every row
    for(int i = 0; i<m; i++){
        if(arr[i][0] == 0){
            //filp that row
            for(int j = 0 ; j<n; j++){
                  if(arr[i][j] == 0)  arr[i][j] = 1;
                  else arr[i][j] = 0;
            }
        }
    }

    //filping the column where noOfZeros > noOfOnes

    for(int j = 1; j<n; j++){
        int noOfZeros = 0 , noOfOnes = 0;
        for(int i = 0; i<m; i++){
            if(arr[i][j] == 0) noOfZeros++;
            else noOfOnes++;
        }
        if(noOfZeros > noOfOnes){
            for(int i = 0; i<m; i++){
                if(arr[i][j] == 0)  arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
    }

    //Calculating Scores 
    int score = 0;
    int y = 1;

    for(int j = n-1; j>=0; j--){
        for(int i = 0; i<m; i++){
            score += arr[i][j] * y;
        }
        y *=2;
    }

    return score;

    }
}