class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,n = 0;
        for(int x : nums){
            if(x==1){
                count++;
                if(n<count)n = count;
            }
            else count = 0;
        }
        return n;
    }
}