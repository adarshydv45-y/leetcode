class Solution {
    public int maxSubArray(int[] nums) {
        // int maxSum = nums[0];
        // int currentSum = nums[0];

        // for (int i = 1; i < nums.length; i++) {
        //     currentSum = Math.max(nums[i], currentSum + nums[i]);
        //     maxSum = Math.max(maxSum, currentSum);
        // }

        // return maxSum;





        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0 ; i<nums.length; i++){
        //     int sum = 0 ;
        //     for(int j = i ; j<nums.length; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum,sum);
        //     }
        // }
        // return maxSum;


        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum =0;
            }
        }
        return maxi;
    }
}