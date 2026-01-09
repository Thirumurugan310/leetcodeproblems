class Solution {
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");
        String st = "";
        for(int i = ss.length-1;i >= 0;i--){
            st+=ss[i];
            if(i!=0){
                st+=" ";
            }
        }return st;
    }
}