class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int rigth = height.length-1;
        int sum = 0;
        while(left<rigth){
            int a = rigth - left;
            int low = Math.min(height[left],height[rigth]);
            int b = a * low;
            if(sum<b){
                sum = b;
            }
            if(height[left] < height[rigth]){
                left++;
            }else{
                rigth--;
            }
        }
        return sum;
    }
}