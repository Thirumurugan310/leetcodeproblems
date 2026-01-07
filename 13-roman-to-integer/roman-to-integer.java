class Solution {
    public int romanToInt(String s) {
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int nn = 0;
        int j = 0;
        for (int i = 0; i < str.length; i++) {
                while (j < s.length() && s.startsWith(str[i], j)) {
                nn += n[i];
                j += str[i].length();
             }
            }
            return nn;
    }
}