class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // common의 길이 3부터 
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        int diff;
        if(a == b) {
          diff = a;
          answer = common[common.length-1] + diff;
        }
        else {
            diff = b / a;
            answer = common[common.length-1] * diff;
        }
        return answer;
    }
}