class Solution {
    public int maximumCount(int[] nums) {
        int maxp = 0;
        int maxn = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]>0)maxp++;
            if(nums[i]<0)maxn++;
        }
        return (maxp >= maxn) ? maxp : maxn;
    }
}