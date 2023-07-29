
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		// N(5 ≤ N ≤ 1,000)개의 자연수들로 이루어진 집합 U가 있다. 이 중에서 적당히 세 수를 골랐을 때,
		// 그 세 수의 합 d도 U안에 포함되는 경우가 있을 수 있다. 이러한 경우들 중에서, 가장 큰 d를 찾으라.
		// 주어진 U는 집합이 되므로 입력되는 두 수가 같아서는 안된다. 
		
		// A + B + C = X
		// A, B, C는 모두 U에 속한다. 
		// A + B = X - C >> 가장큰 X가 d다. 
		// max인 X를 찾는 것이 목적이다.
		// 자연수에 대한 조합을 찾는 것이 목적이다.
		int []arr = new int[N];
		
		for(int i=0; i< N; i++) {
			arr[i] = scan.nextInt();
		}
		
		// 이 문제는 x, y, z, k가 중복이 발생할 수 있다. 
		Set se = new HashSet();
		
		for(int i=0; i< N; i++) {
			for(int j=i ; j<N; j++){
				se.add(arr[i] + arr[j]);		
			}
		}
		
		int max = -1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int target = arr[i]-arr[j];
				if(se.contains(target)) {
					max = Math.max(max, arr[i]);
				}
			}
		}
		
		System.out.println(max);
		
		
	}
	
}