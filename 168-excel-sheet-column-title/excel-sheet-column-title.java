class Solution {
    public String convertToTitle(int columnNumber) {
        String str = "";
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch =(char)('A' + rem);
            str = ch + str;
            columnNumber/=26;
        }
        return str;
    }
}