class Solution {
    public int singleNumber(int[] nums) {

        // ----------Approach 1-----------

        // int n = nums.length;

        // for (int i = 0; i < n; i++) {

        //     int count = 0;

        //     for (int j = 0; j < n; j++) {

        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }

        //     if (count == 1) {
        //         return nums[i];
        //     }
        // }

        // return -1;


        // ------------Approach 2 -----------

        int sing = nums[0] ;
        int n = nums.length;
        for(int i = 1; i<n ; i++){
            sing = sing^nums[i];
        }
        return sing;

    }
}