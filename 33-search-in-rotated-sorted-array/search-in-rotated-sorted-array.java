class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for(int num : nums){
            if(num==target){
                return count;
            }count++;
        }
        return -1;
    }
}