class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;
        int n = ransomNote.length();
        int nn = magazine.length();
        boolean[] st = new boolean[nn];
        for(int i = 0;i < n;i++){
            char ch = ransomNote.charAt(i);
            for(int j = 0;j < nn;j++){
                char chh = magazine.charAt(j);
                if(ch==chh && st[j]!=true){
                    count++;
                    st[j] = true;
                    break;
                }
            }
        }
        return count==n;
    }
}