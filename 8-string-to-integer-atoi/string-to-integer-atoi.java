class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, n = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            if (n > Integer.MAX_VALUE / 10 ||
               (n == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            n = n * 10 + digit;
            i++;
        }
        return n * sign;
    }
}
