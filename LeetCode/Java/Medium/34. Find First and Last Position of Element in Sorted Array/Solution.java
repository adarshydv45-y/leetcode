// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int n = nums.length;
//         int[] arr = {-1,-1};
        
//         for(int i = 0 ; i<n ; i++){
//             if(nums[i]==target){
//                 arr[0]=i;
//                 break;
            
//             }
//         }
        
//         for(int j = n-1 ; j>=0; j--){
//             if(nums[n-1]==target){
//                 arr[1]=j;
//                 break;
//             }
            
//         }
//         return arr;

        
        
        
//     }
// }



class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int[] arr = {-1, -1};

        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                arr[0] = i;
                break;
            }
        }

        for(int j = n - 1; j >= 0; j--) {
            if(nums[j] == target) {
                arr[1] = j;
                break;
            }
        }

        return arr;
    }
}
