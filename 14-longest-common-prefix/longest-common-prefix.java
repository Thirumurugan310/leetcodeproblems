class Solution {
    public String longestCommonPrefix(String[] strs) {
        String dump = "";
        String str = "";
        for(int i = 0;i < strs[0].length();i++){
             str += strs[0].charAt(i);
             boolean flag = true;
            for(int j = 0;j < strs.length;j++){
                if(i>=strs[j].length() || !str.equals(strs[j].substring(0,i+1))){
                    flag = false;
                }
            } 
            if (flag) dump = str;
            else break;
        }
         return dump;
    }
}