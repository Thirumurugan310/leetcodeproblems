class Solution {
    public int dominantIndex(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0, max = 0,k = -1,l = 0;
        for(int x : nums){
            arr[i++] = x;
            k++;
            if(max < x){
                max = x;
                l = k;
            }
        }
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        int m = nums[nums.length-2];
        if(n >= m+m)return l ;
        else return -1;
    }
}