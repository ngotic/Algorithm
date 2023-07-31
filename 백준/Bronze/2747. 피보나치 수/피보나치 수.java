import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int [] F = new int[46];
		
		F[0] = 0;
		F[1] = 1;
		
		for(int i=2; i<= 45 ;i++) {
			F[i] = F[i-2] + F[i-1];
		}
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		System.out.println(F[N]);
		
	}
	
}