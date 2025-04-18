class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int x : asteroids){
            System.out.print(x + " ");
        }
        for(int x : asteroids){
            if(sum < x){
               return false;
            }else{
              sum +=x;
            }
        }
        return true;
    }
}