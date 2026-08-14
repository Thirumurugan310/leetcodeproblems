class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1||s.length()<=numRows)
            return s;
        StringBuilder[] r1 = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            r1[i] = new StringBuilder();
        int r = 0;
        boolean d = true;
        for (int i = 0; i < s.length(); i++) {
            r1[r].append(s.charAt(i));
            if(r == 0)
                d = true;
            else if(r==numRows-1)
                d = false;

            if(d)
                r++;
            else
                r--;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : r1)
            ans.append(sb);
        return ans.toString();
    }
}