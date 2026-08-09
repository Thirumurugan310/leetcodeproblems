class Solution {
    public int trap(int[] h) {
        int l = 0;
        int r = h.length-1;
        int lm = Integer.MIN_VALUE;
        int rm = Integer.MIN_VALUE;
        int w = 0;
        while(l<r){
            if(h[l]<=h[r]){
                if(lm <= h[l])lm = h[l];
                else w += lm - h[l];
                l++;
            }else{
                if(rm <= h[r])rm = h[r];
                else w += rm - h[r];
                r--;
            }
        }
        return w;
    }
}