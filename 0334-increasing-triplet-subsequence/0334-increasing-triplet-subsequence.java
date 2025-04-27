class Solution {
    public boolean increasingTriplet(int[] nums) {
     int fNum = Integer.MAX_VALUE;
     int sNum = Integer.MAX_VALUE;

     for(int i = 0;  i<nums.length; i++){
        if(fNum >= nums[i]){
            fNum = nums[i];
        }else if(sNum > nums[i]){
            sNum = nums[i];
        }else{
            return true;
        }
     }
     return false;
     
    }
}