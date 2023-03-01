import java.util.*;

class Solution {
    public String solution(String s) {
        int [] cnt = new int[32]; 
		char [] chs = new char[32]; // char[] 도 정렬할 수 있다. Arrays.sort(); 사용
		// String s = new String(); // char[]로 담을 수 있다.
		for (int i=0; i<s.length(); i++) {
			cnt[s.charAt(i)-'a']++; // ch도 연산하면 int형이 되니까 배열 인덱스로 담는다.
		}
		for(int i=0; i<32; i++) {
			if(cnt[i]==1) {
				char ch = (char)(i+'a');
				chs[i]=ch;
			}
		}
		Arrays.sort(chs);
		return new String(chs).trim(); 
    }
}