class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Integer> opening = new HashMap<>();
        opening.put('(', 1);
        opening.put('[', 2);
        opening.put('{', 3);
        HashMap<Character, Integer> closing = new HashMap<>();
        closing.put(')', 1);
        closing.put(']', 2);
        closing.put('}', 3);
        Stack<Character> stack = new Stack<>();
        
        boolean state = false;

        char[] arr = s.toCharArray();
        if(arr.length == 1) return false;

        for(char c : arr){
            if(opening.containsKey(c)){
                stack.push(c);
            }
            if(closing.containsKey(c)){
                if(stack.isEmpty() || !closing.get(c).equals(opening.get(stack.peek()))){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
}
