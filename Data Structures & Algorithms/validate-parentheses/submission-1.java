

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hash = new HashMap<>();

        hash.put(')', '(');
        hash.put('}', '{');
        hash.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!hash.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                char topElement = stack.pop();

                if (topElement != hash.get(c)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}

