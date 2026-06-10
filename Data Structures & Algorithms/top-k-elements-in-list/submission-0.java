class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.get(num) != null){ 
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int num : map.keySet()){
            int n = map.get(num);
            if(buckets[n] == null) buckets[n] = new ArrayList<>();
            buckets[n].add(num);
        }

        int[] result = new int[k];
        int i = buckets.length-1;
        int resIDX = 0;

        while(i >= 0 && resIDX < k){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[resIDX] = num;
                    resIDX++;
                }
            }
            i--;
        }

        return result;

    }
}
