class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            int count1 = 0,count = 0;
            for(int j = i;j < nums.length;j++){
                if (nums[j] == 0) count++;
                if (count > k) break;
                count1++;
            }if(max<count1)max = count1;
        }return max;
    }
}