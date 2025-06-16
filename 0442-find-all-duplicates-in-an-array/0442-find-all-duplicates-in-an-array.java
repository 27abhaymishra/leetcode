class Solution {
public void swap(int i , int j , int arr[]){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
          // Place each element at its correct index (element x at index x-1)
        while(i<n){
            int ele = arr[i];
              // If element is already at correct position or duplicate found, move forward
            if(ele == i+1 || arr[i] == arr[ele-1]){
                i++;
            }else{
                swap(i , ele-1 , arr);
            }
        }
              // After rearrangement, indexes which don't have correct elements indicate duplicates
        for( i = 0; i<n; i++){
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}