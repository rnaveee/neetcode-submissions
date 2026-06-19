
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashSet<String> op = new HashSet<>();

        op.add("+");
        op.add("-");
        op.add("*");
        op.add("/");

        for (int i = 0; i < tokens.length; i++) {
            if (op.contains(tokens[i])) {
                char operation = tokens[i].charAt(0);
                int n2 = stack.pop();
                int n1 = stack.pop();
                int res;
                if (operation == '+') {
                    res = n1 + n2;
                } else if (operation == '-') {
                    res = n1 - n2;
                } else if (operation == '*') {
                    res = n1 * n2;
                } else {
                    res = n1 / n2;
                }
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
    }
}