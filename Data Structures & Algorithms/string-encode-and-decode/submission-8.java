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
        List<String> res = new ArrayList<>();
        int i=0;

        while(i < str.length()) {
            int delim = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i, delim));
            String content = str.substring(delim+1,delim+1+len);
            res.add(content);
            i = delim+1+len;
        }
        

        return res;
    }
    
}
