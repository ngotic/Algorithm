import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] tmp = {"zero", "one" ,"two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tempstr=numbers;
        for(int i=0 ; i<tmp.length; i++){
            if(tempstr.contains(tmp[i]))
                tempstr = tempstr.replace(tmp[i],i+"");
        }
        
        return Long.parseLong(tempstr);
    }
}