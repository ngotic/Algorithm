import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> ar = new  ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if( (n % i) == 0  )
                ar.add(i);
        }
        
        return ar.stream().mapToInt(i->i).toArray();
    }
}