class Solution {
    boolean display(char ch){
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            return true;
        }return false;
    } 
    public String reverseOnlyLetters(String s) {
        char[] ch = new char[s.length()];
        for(int i = 0;i < s.length();i++){
            ch[i]=s.charAt(i);
        }
        int left = 0;
        int rigth = s.length()-1;
        while(left<rigth){
            if(display(s.charAt(left))==true && display(s.charAt(rigth))==true){
                ch[left] = s.charAt(rigth);
                ch[rigth] = s.charAt(left);
            }
            if(display(s.charAt(left))==true && display(s.charAt(rigth))==true){
                left++;
                rigth--;
            }else if(display(s.charAt(left))==true){
                rigth--;
            }else left++;

        }String ss = "";
        for(int i = 0;i < ch.length;i++){
            ss+=ch[i];
        }return ss;
    }
}