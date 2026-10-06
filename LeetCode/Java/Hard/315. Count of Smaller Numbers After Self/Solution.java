class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length ;
        int count = 0;
        List<Integer> list = new ArrayList<>(n);
        for(int i = 0 ; i<nums.length-1; i++){
            count = 0;
            for(int j = i+1 ; j<nums.length;j++){
                if(nums[i]>nums[j]){
                    
                    count++;
                }
            }
            list.add(count);
            
        }

        list.add(0);
        return list;   
    }
}