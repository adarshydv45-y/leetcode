class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<nums1.length;i++){
            int diff = Math.abs(nums1[i]-nums2[i]);
            pq.offer(diff);

        }
        long k = (long)k1+k2;
        while(k>0 && pq.peek()>0){
            int max = pq.poll();
            pq.offer(max-1);
            k--;

        }
        long ans = 0;
        while(!pq.isEmpty()){
            long d=pq.poll();
            ans += d*d;
        }
        return ans ;

        
    }
}