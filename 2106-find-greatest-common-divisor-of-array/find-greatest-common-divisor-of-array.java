class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        int last = nums[nums.length-1];
        for(int i = last;i >= 1;i--){
            if(first%i==0 && last%i==0)return i;
        }return -1;
    }
}