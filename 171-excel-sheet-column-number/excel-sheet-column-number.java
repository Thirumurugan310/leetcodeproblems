class Solution {
    public int titleToNumber(String columnTitle) {
        int n = 0;
        for(int i = 0;i < columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' +1;
            n = n * 26+value;
        }
        return n;
    }
}