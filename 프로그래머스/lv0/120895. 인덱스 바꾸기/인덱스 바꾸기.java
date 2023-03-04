class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char [] chs = my_string.toCharArray();
        char temp  = chs[num1];
        chs[num1] = chs[num2];
        chs[num2] = temp;
        return  new String(chs);
    }
}