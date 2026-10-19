class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sign = new HashMap<>();

        for(String str: strs)  {
            int[] sig = new int[26];
            for(char a: str.toCharArray()) {
                int idx = a - 'a';
                sig[idx]++;
            }
            String tmp = Arrays.toString(sig);
            sign.computeIfAbsent(tmp, k->new ArrayList<>()).add(str);
        }

        return new ArrayList(sign.values());
        
    }
}
