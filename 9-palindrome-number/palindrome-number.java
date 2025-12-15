class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n=0;
        int m=x;
        while(x!=0){
            int dig = x%10;
            n = n*10+dig;
            x=x/10;
        }
        return n==m;
        
    }
}