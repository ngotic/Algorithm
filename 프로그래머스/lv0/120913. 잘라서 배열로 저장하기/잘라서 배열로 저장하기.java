class Solution {
    public String[] solution(String my_str, int n) {
        
        String[] answer = {};
        
        int divide =(int)Math.ceil( (double)my_str.length()/ n ); 
        
        answer = new String[divide];//
        // 16
        // 6 , 6 , 4
        // 6개로 짜름
        
        //0 ~ 6, 6 ~12 12 ~ my_str.length();
        
        for(int i=0; i<divide ; i++) {
        	
        	if ( (my_str.length()  - n * i) < n)
        		answer[i] = my_str.substring(i * n,  my_str.length() );
        	else 
        		answer[i] = my_str.substring(i * n,  (i + 1) * n);
        	
        }
        
        return answer;
    }
}