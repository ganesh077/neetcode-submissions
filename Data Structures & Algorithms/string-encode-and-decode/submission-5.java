class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            int len = str.length();
            sb.append(len).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        
        int idx = 0;
        while(idx < str.length()) {
            int countEnd = idx;
            while(str.charAt(countEnd) != '#') {
                countEnd++;
            }
            int len = Integer.parseInt(str.substring(idx,countEnd));
            int first = countEnd+1;
            int last = first+len;
            
            res.add(str.substring(first,last));
            
            idx = last;
        }
        return res;
    }
}
