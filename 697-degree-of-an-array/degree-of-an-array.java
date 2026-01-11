class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int last = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    last = j;
                }
            }
            int len = last - i + 1;
            if (count > degree) {
                degree = count;
                min = len;
            } else if (count == degree) {
                min = Math.min(min, len);
            }
        }
        return min;
    }
}
