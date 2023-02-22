class Solution {
    public int solution(String[] babbling) {
        
    
	   	 	int answer = 0;
	        String [] pron = {"aya", "ye", "woo", "ma"};
	        for( int i=0; i<babbling.length; i++ ){
	        int mask = 0; // 마스킹 횟수
	        	String temp = babbling[i];
	            for(int j=0 ; j<pron.length ;j++){
	                if(temp.contains(pron[j])) {
	                	temp = temp.replace(pron[j],"x"); 
	                	mask++;
	                }
	                if(temp.equals("x".repeat(mask))) { // 마스킹 개수만큼 된 결과값과 마스킹된 값과 비교
	                	answer++;
	                	break;
	                }
	            }
	        }
	        return answer;
    }
}