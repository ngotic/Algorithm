import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int M = scan.nextInt();
		
		String [] arr = new String[N];
		while(N--> 0 ) {
			arr[N] = scan.next();
		}
		
		Arrays.sort(arr);
		
//		for(String a : arr) {
//			System.out.println(a);
//		}
		int ans=0;
		while(M--> 0 ) {
			String Mstr = scan.next();
			if( isExist(arr, Mstr))
				ans++;
		}	
		System.out.println(ans);
	}

	private static boolean isExist(String[] arr, String mstr) {
		int L=0, R = arr.length-1;
		while(L <= R) {
			int m = (L+R)/2;
			if( arr[m].compareTo(mstr) < 0 ) {
				L=m+1;
			} else if( arr[m].compareTo(mstr) > 0) {
				R=m-1;
			}  else
				return true;
		}
		return false;
	}
	
}