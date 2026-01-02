class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false;
        char[] temp = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                temp[++top] = c;
            } else {
                if (top == -1) return false;
                char open = temp[top--];
                if (c == ')' && open != '(') return false;
                if (c == '}' && open != '{') return false;
                if (c == ']' && open != '[') return false;
            }
        }
        return top == -1;
    }
}
