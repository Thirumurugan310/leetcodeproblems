class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        if(letters[0]>target)return letters[0];
        if(letters[letters.length-1]==target)return letters[0];
        if(letters[letters.length-1]<target)return letters[0];
        char ch = 'a';
        for(int i = 0;i < letters.length-1;i++){
            if(letters[i]==target)ch = letters[i+1];
            else if(letters[i] < target && letters[i+1] > target)ch = letters[i+1];
        }return ch;
    }
}