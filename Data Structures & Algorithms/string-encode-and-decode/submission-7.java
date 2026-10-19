class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            int len = str.length();
            sb.append(len).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int start = 0;
        int idx = 0;
        System.out.println(str);
        List<String> res = new ArrayList<>();
        while(idx < str.length()) {
            while(str.charAt(idx) != '#') {
                idx++;
            }
    
            int len = Integer.parseInt(str.substring(start,idx));
            start = idx+1;
            idx = start + len;
            res.add(str.substring(start,idx));
            start = idx;
        }

        return res;
    }
}
