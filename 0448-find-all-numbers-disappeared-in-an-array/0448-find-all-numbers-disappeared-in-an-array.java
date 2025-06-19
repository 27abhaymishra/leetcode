class Solution {
    public void swap(int i , int j , int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>();
         int n = nums.length;
       int i = 0; 
       while(i<n){
        int ele = nums[i];    //element should be at ele-1 index
        if(nums[i] == i+1  || nums[i] == nums[ele-1]) i++;
        else{
            swap(i , ele-1, nums);
        }
       } 
      for( i = 0; i<n; i++){
        if(nums[i] != i+1){
            ans.add(i+1);
        }
      }
    return ans;
    }
}