class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int cnt = cipher.length()/code;
        char [] result= new char[cnt];
        for(int i=1;i<=cnt; i++){
            char ch = cipher.charAt(code*i-1);
            result[i-1]=ch;
        }
        return new String(result);
    }
}