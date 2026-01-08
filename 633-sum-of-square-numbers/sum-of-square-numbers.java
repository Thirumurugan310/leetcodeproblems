class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left<=right){
            long l = left*left + right*right;

            if(l==c){
                return true;
            }else if(c>l){
                left++;
            }else{
                right--;
            }
        }return false;
    }
}