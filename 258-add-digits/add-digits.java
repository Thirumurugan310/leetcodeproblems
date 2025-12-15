class Solution {
    public int addDigits(int num) {
        if(num<10)return num;
        int nn=0;
        while(num>9){
        int n = num/10;
        int m = num%10;
         nn = n+m;
         num=nn;
        }
        return nn;
    }
}