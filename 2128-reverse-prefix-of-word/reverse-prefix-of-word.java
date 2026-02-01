class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch)))return word;
        String f = "";
        String b = "";
        int t = 0;
        for(int i = 0;i < word.length();i++){
            if(ch==word.charAt(i)){
                t = i;
                break;
            }
        }
        for(int i = t;i >=0;i-- )f+=word.charAt(i);
        for(int i = t+1;i < word.length();i++)b+=word.charAt(i);
        return f+b;
    }
}