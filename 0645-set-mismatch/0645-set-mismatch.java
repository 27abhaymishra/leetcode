class Solution {
    public void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] findErrorNums(int[] arr) {
        int ans[] = new int[2];
        int n = arr.length;
        int i = 0;
        while(i<n){
            int ele = arr[i];
            if(ele == i+1  || arr[i] == arr[ele-1]){
             i++;
            }else{
                swap(i,ele-1 , arr);
            }
        }
        for( i = 0; i<n; i++){
            if(arr[i] != i+1){
                ans[0] = arr[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }
}