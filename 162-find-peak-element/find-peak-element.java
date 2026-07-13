class Solution {
    public int findPeakElement(int[] nums) {
        int j = 0;
        int[] n = new int[nums.length];
        for(int x : nums)n[j++] = x;
        Arrays.sort(nums);
        int p = nums[nums.length-1];
        for(int i = 0;i < nums.length;i++){
            if(p==n[i])return i;
        }return -1;
    }
}