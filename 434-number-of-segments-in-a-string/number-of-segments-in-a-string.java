class Solution {
    public int countSegments(String s) {
        String ss = s.trim();
        if(ss.equals(""))return 0;
        String[] words = ss.trim().split("\\s+");
        int count = 0;
        for(String word : words)count++;
        return count;
    }
}