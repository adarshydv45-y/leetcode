class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;  // found index
            }
        }
        return -1;  // not found


        // int lo = 0, hi = nums.length - 1;

        // while (lo <= hi) {
        //     int mid = lo + (hi - lo) / 2;

            
        //     if (nums[mid] == target) {
        //         return mid;
        //     }

            
        //     if (nums[lo] <= nums[mid]) {
        //         if (nums[lo] <= target && target < nums[mid]) {
        //             hi = mid - 1;  
        //         } else {
        //             lo = mid + 1;  
        //         }
        //     } 
            
        //     else {
        //         if (nums[mid] < target && target <= nums[hi]) {
        //             lo = mid + 1;  
        //         } else {
        //             hi = mid - 1; 
        //         }
        //     }
        // }
        // return -1;  
        
        
    }
}