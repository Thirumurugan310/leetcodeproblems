class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int b = nums[nums.length-2];
        int c = nums[nums.length-3];
        int x = nums[0];
        int y = nums[1];

        int product1 = a*b*c;
        int product2 = x*y*a;
        return (product1 < product2) ? product2 : product1;
    }
}