class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            String t = tokens[i];
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(evaluate(second, first, t.charAt(0)));
            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.isEmpty() ? null : stack.peek();
        
    }

    public int evaluate(int first, int second, char op){
        if(op == '+'){
            return first + second;
        } else if (op == '-'){
            return first - second;
        } else if (op == '*'){
            return first * second;
        } else {
            return first / second;
        }
    }
}
