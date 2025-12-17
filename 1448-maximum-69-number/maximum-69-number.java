class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int sum = 0;
        while(n!=0){
            int temp = n%10;
            sum = sum*10 + temp;
            n/=10;
        }n = sum;
         int sum1 = 0,count=0;
        while(n!=0){
            int temp = n%10;
            if(temp==6 && count==0){
                sum1 = sum1*10+9;
                count++;
            }else{
                sum1 = sum1*10+temp;
            }n/=10;
        }return sum1;
    }
}