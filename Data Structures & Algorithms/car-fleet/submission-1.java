class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < position.length; i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        
        for(int i = 0; i < position.length; i++){
            double currTime = ((double) target - pairs[i][0])/pairs[i][1];
            stack.push(currTime);

            if(stack.size() >= 2 && stack.get(stack.size() - 2) >= stack.peek()){
                stack.pop();
            }


            //
            //
            //  4.5
            //  4.5
        }

        return stack.size();
    }
}
