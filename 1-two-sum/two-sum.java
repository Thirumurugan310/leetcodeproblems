class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] n = new int[2];
        for(int i = 0;i < nums.length;i++){
            int t = target - nums[i];
            if(map.containsKey(t)){
                n[0]=map.get(t);
                n[1]=i;
            }map.put(nums[i],i);
        }return n;
    }
}