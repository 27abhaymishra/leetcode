
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                
                char top = st.peek();
                if (ch == ')' && top == '(') {
                    st.pop();
                } else if (ch == '}' && top == '{') {
                    st.pop();
                } else if (ch == ']' && top == '[') {
                    st.pop();
                } else {
                    return false; // mismatched closing bracket
                }
            }
        }
        
        return st.isEmpty();
    }
}