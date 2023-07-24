import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String total = br.readLine();
		String word = br.readLine();
		
		
		int point = total.indexOf(word);
		int cnt =0;
		while(point!=-1) {
			cnt++;
			total = total.substring(point+word.length());
			point = total.indexOf(word);
		}
		System.out.println(cnt);
	}
	
}