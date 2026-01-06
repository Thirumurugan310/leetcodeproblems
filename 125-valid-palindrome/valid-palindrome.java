class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9')str+=s.charAt(i);
        }
        String str1 = str.toLowerCase();
        boolean flag = true;
        int n = str1.length();
        for(int i = 0;i < n/2;i++){
            if(str1.charAt(i) != str1.charAt(n-1-i)){
                flag = false;
                break;
            }
        }
        if(flag==true)return true;
        return false;
    }
}