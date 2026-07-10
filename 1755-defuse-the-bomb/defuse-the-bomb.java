class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if(k==0)return ans;
        int s, e;
        if(k > 0){
            s = 1;
            e = k;
        }else{
            k =-k;
            s = n-k;
            e = n-1;
        }
        int sum = 0;
        for (int i=s;i <=e;i++) {
            sum += code[i%n];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            sum -= code[s%n];
            s++;
            e++;
            sum +=code[e%n];
        }
        return ans;
    }
}