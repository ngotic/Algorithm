class Solution {
    public int[] solution(int num, int total) {
        int [] answer = {};
        answer = new int[num];
        int sum=0;
        for(int i=0; i<num; i++)
        	sum+=i;
        int a = (total - sum)/num; 
        
        int index = 0;
        for(int i=a ; i <a+num; i++) {
        	answer[index] = i;
        	index++;
        }
        return answer;
    }
}


// 
// a a a a 
// 0 1 2 3 
// 평행이동의 개녕
// 
