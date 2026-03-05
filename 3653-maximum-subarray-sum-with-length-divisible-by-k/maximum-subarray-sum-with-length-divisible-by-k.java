class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long prefix = 0;
        long ans = Long.MIN_VALUE;
        long[] minPrefix = new long[k];
        for(int i = 0; i < k; i++){
            minPrefix[i] = Long.MAX_VALUE;
        }
        minPrefix[k-1] = 0;
        for(int i = 0; i < n; i++){
            prefix += nums[i];
            int r = i % k;
            if(minPrefix[r] != Long.MAX_VALUE){
                ans = Math.max(ans, prefix - minPrefix[r]);
            }
            minPrefix[r] = Math.min(minPrefix[r], prefix);
        }
        return ans;
    }
}