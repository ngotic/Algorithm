import java.util.Scanner;

public class Main {
	
	static char[] arr = new char[36]; 
	
	public static void main(String[] args) {
		
		for(int i=0; i<36;i++) {
			if(i >= 10)
				arr[i] = (char) ('A'+i-10);
			else
				arr[i] = (char)('0'+i);
			
		}
		
		Scanner scan = new Scanner(System.in);
		// 0 ~ 35까지 있다.
		int N = scan.nextInt();
		int B = scan.nextInt();
		String result = trans(N, B);
		System.out.println(result);
		
		
	}

	private static String trans(int n, int b) {
 
		String result="";
		
		while( true ) {
			int digit = n % b;
			result = arr[digit]+ "" + result;
			int tmp = n;
			
			n /= b;
			if( n==0 || n/b == 0) { 
				String front = ((tmp / b) == 0)? "": arr[tmp / b] +"";   
				result = front+result;
				break;
			}
		}
		
		return result;
	}
	
}