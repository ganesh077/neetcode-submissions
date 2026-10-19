class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> signs = new HashMap<>();

        for(String str: strs) {
            char[] sign = new char[26];
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length(); i++) {
                int currVal = str.charAt(i) - 'a';
                sign[currVal]++;
            }
            for(int j=0; j<sign.length; j++) {
                sb.append(sign[j]);
                sb.append("#");
            }
            signs.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(signs.values());
    }
}
