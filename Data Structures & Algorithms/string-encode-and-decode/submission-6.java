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
        int i = 0;
        int n = str.length();
        while(i < n) {
            int delim = i;
            while(str.charAt(delim) != '#') {
                delim++;
            }
            int len = Integer.parseInt(str.substring(i,delim));
            int start = delim+1;
            int end = start + len;
            String sub = str.substring(start, end);
            res.add(sub);
            i = end;
        }
        return res;

    }
}
