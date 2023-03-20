class Solution {
    public int solution(int n, int k) {
        
        int addDrink = n / 10;
        int answer = n*12000 + (k-addDrink)*2000;
        return answer;
    }
}