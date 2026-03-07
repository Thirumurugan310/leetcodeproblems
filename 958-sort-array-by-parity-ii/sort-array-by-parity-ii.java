class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sort = new int[nums.length];
        int[] sorts = new int[nums.length];
        int k = 0,k1 = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]%2==0){
                sort[k] = nums[i];
                k+=2;
            }
            if(nums[i]%2!=0)sorts[k1++] = nums[i];
        }
        k = 1;
        for(int x : sorts){
            if(x!=0){
                sort[k] = x;
                k+=2;
            }
        }return sort;
    }
}