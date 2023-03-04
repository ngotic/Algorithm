class Solution {
    public String solution(String my_string) {
        //String answer = "";
        char[] chs = my_string.toCharArray();
        for(int i=0; i<chs.length; i++){
            char ch=chs[i];
            if(ch >= 'a' && ch <='z')
                ch -= 32;
            else 
                ch +=32;
            chs[i] = ch;
        }
        return new String(chs);
    }
}