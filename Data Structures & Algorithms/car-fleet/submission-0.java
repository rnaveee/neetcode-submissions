class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        for(int j = 0; j < position.length; j++){

            double time = ((double) target - pair[j][0]) / pair[j][1];

            stack.push(time);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size()-2)){
                stack.pop();
            }
        }

        return stack.size();
        
    }
}
