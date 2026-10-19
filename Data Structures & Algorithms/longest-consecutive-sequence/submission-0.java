class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        int maxseq = 0;

        for(int num: nums) {
            seen.add(num);
        }

        for(int num: nums) {
            int seq = 0;
            int curr = num;
            while(seen.contains(curr)) {
                seq++;
                curr++;
            }
            maxseq = Math.max(seq,maxseq);
        }

        return maxseq;
    }
}
