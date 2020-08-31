
class Solution {
    public String reverseWords(String s) {
        StringBuffer strbuf = new StringBuffer();
        int len = s.length();
        int i = 0;
        int p = -1;
        while(i<len){
            char c = s.charAt(i);
            // 识别空格
            if(c == ' '){
                for(int j=i-1;j>p;j--){
                    strbuf.append(s.charAt(j));
                }
                p = i;
                strbuf.append(' ');
            // 判断是否是最后一位
            }else if(i == len-1){
                for(int j=i;j>p;j--){
                    strbuf.append(s.charAt(j));
                }
            }
            i++;
        }
        return strbuf.toString();
    }
}

