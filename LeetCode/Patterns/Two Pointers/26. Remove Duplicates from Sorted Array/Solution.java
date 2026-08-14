class Solution {
    public int removeDuplicates(int[] nums) {
        // int i =0;
        // int j = 1;
        // int n = nums.length;
        // while(j<n){
        //     if(nums[i]==nums[j]){
        //         j++;
                
        //     }
        //     else{
        //         i++;
        //         nums[i] = nums[j];
        //         j++;
        //     }
        // }
        // return i+1;





        // int n = nums.length;
        // int j = 1;
        // int count = 0;
        // for(int i = 0 ; i<n ; i++){
        //     if(nums[i]==nums[j]){
        //         j++;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // return count;
        
        int n = nums.length;

        if (n == 0) return 0;

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    

    }
}