class Solution {
    public int countEven(int num) {
        
        
        int count = 0;
        for(int i=2;i<=num;i++){
            int nn = i;
            int temp = 0;
            while(nn>0){
               temp+=nn%10;
               nn/=10; 
            }
            if(temp%2==0)count++;
        }
        return count;
    }
}