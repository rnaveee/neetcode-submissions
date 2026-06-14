class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> num : freq.entrySet()){
            buckets[num.getValue()].add(num.getKey());
        }

        ArrayList<Integer> sorted = new ArrayList<>();
        for(int b = buckets.length-1; b >= 0; b--){
            for(int n : buckets[b]){
                sorted.add(n);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sorted.get(i);
        }
        return result;
    }
}
