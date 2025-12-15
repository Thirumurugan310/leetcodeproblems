class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        double nn = n;
        while(nn>4){
            nn/=4;
        }return nn==4;
    }
}