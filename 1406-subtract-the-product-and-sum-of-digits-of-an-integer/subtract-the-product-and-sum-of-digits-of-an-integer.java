class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1,add=0;
        int m = n;
        while(n!=0){
            int temp = n%10;
            mul*=temp;
            n/=10;
        }
        while(m!=0){
            int temp = m%10;
            add+=temp;
            m/=10;
        }
        return mul-add;
    }
}