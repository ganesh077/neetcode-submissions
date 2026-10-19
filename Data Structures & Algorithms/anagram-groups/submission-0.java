class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            int[] charCount = new int[26];
            for(int i=0; i<str.length(); i++) {
                int idx = str.charAt(i) - 'a';
                charCount[idx]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int count: charCount) {
                sb.append('#');
                sb.append(count);
            }
            String key = sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
