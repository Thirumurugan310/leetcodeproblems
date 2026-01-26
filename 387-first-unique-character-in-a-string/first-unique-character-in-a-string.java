class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0;i < s.length();i++){
            char c = ch[i];
            boolean flag = true;
            for(int j = 0;j < s.length();j++){
                if(c==ch[j] && i!=j){
                    flag = false;
                    break;
                }
            }if(flag==true)return i;
        }return -1;
    }
}