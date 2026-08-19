class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxCount = 0 ;
        int count = 0 ;
        int i = 0;
        while(i<n){
            if(nums[i]==1){
                count++;
                i++;
                if(count>maxCount) maxCount = count;
            }
            else{
                count = 0;
                i++;
            }
        }
        return maxCount ;
        
    }
}