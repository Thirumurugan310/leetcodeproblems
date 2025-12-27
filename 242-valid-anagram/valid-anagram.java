class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] chh = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chh);
        return Arrays.equals(ch, chh);
    }
}