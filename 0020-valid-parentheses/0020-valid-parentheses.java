class Solution {
    public boolean isValid(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 == 1) return false;
        if(s.charAt(s.length() -1) == '(' || s.charAt(s.length() -1) == '[' || s.charAt(s.length() -1) == '{') return false;

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        if(!stack.empty()) {
            return false;
        }

        return answer;
    }
}