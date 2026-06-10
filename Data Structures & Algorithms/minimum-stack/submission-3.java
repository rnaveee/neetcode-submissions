class MinStack {

    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    public MinStack() {
        this.minStack = new Stack<>();
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty()){
            minStack.push(val);
        } else {
            minStack.push(Math.min(minStack.peek(), val));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty() ? null : minStack.peek();
    }
}
