class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            int len = str.length();
            sb.append(Integer.toString(len)+"#"+str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        System.out.println(str);
        if(str.length() < 1) {
            //res.add(str);
            return res;
        }

        int idx = 0;
        while(idx < str.length()) {
            int countEnd = idx;
            while(str.charAt(countEnd) != '#') {
                countEnd++;
            }
            int len = Integer.parseInt(str.substring(idx,countEnd));
            int first = countEnd+1;
            int last = countEnd+len;
            System.out.println(idx+" "+first+" "+last);
            res.add(str.substring(first,last+1));
            System.out.println(res);
            idx = last+1;
        }
        return res;
    }
}
