class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
     int minr = 0 , maxr=n-1;
        int minc =0, maxc = n-1;
            int count = 1;
        while(minr <= maxr && minc <= maxc){
             //left to right
            for(int i=minc; i<=maxc; i++){
                 arr[minr][i] = count;
                 count++;
            }
            minr++;       
        
            //top to bottom
            if(minr > maxr  || minc > maxc)  break;
            for(int i = minr;  i<=maxr; i++){
                 arr[i][maxc] = count;
                 count++;
            }
             maxc--;

        //right to left
          if(minr > maxr  || minc > maxc)  break;
          for(int i=maxc; i>=minc; i--){
                 arr[maxr][i] = count;
                 count++;
            }
            maxr--;       
        
            //bottom to top
              if(minr > maxr  || minc > maxc)  break;
            for(int i = maxr;  i>=minr; i--){
                 arr[i][minc] = count;
                 count++;
            }
       minc++;
        
        }

    return arr;

    }
}