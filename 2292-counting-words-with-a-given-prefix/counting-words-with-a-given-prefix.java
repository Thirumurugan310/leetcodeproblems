class Solution {
    public int prefixCount(String[] words, String pref) {
        int f = pref.length();
        int c = 0;
        for(int i = 0;i < words.length;i++){
            int count = 0;
            for(int j = 0;j < pref.length();j++){
                if(words[i].length()<pref.length())break;
                if(words[i].charAt(j)==pref.charAt(j))count++;
            }if(count==f)c++;
        }
        return c;
    }
}