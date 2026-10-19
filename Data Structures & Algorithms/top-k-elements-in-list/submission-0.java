class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int key: freq.keySet()) {
            pq.add(new int[]{key, freq.get(key)});
        }


        int[] res = new int[k];

        for(int i=0; i<k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;


    }
}
