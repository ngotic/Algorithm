class Solution {
    public int solution(int n) {
        int answer = 1;
        int index=1;
        for(int i=1; answer <n ;i++){
              answer*=i; 
              index=i;
        }

        if(answer == n)
            return index;
        else return index-1;        
    }
    
}