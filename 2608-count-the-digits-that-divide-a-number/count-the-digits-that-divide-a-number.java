class Solution {
    public int countDigits(int num) {
        int m = num,step=0;
        if(num<10){
            step++;
            return step;
        }
       while(num!=0){
        int temp = num%10;
        if(m%temp==0){
            step++;
        } num/=10;
       }
       return step;
    }
}