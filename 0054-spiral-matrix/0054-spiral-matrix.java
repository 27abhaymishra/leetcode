class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         int m = arr.length , n = arr[0].length;
          int minr = 0 , maxr=m-1;
        int minc =0, maxc = n-1;

        ArrayList<Integer>li =new ArrayList<>();

        while(minr <= maxr && minc <= maxc){
           //left to right
             for(int i=minc; i<=maxc; i++){
               li.add(arr[minr][i]);
            }
            minr++;       
        
            //top to bottom
            if(minr > maxr  || minc > maxc)  break;
            for(int i = minr;  i<=maxr; i++){
               li.add(arr[i][maxc]);
            }
             maxc--;

        //right to left
          if(minr > maxr  || minc > maxc)  break;
          for(int i=maxc; i>=minc; i--){
               li.add(arr[maxr][i]);
            }
            maxr--;       
        
            //bottom to top
              if(minr > maxr  || minc > maxc)  break;
            for(int i = maxr;  i>=minr; i--){
                li.add(arr[i][minc]);
            }
       minc++;
        
        }

        return li;
    }
}