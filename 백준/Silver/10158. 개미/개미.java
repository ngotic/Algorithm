import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] args)  throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int xdir = 1;
		int ydir = 1;
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int maxX=Integer.parseInt(st.nextToken());
		int maxY=Integer.parseInt(st.nextToken());
		
		
		int min = 0;
		// currPoint
		st=new StringTokenizer(br.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
        	// 대칭이 아니다. >> 그래서 따로 구하는 게 맞다. 
		int xN=n%(2*maxX);
		while(xN-- >0){
			if( x==maxX ) xdir = -1;
			else if (x == min) xdir = 1;
			x += xdir;
		}
		
		int yN=n%(2*maxY);
		//for( int i=0; i<yN; i++ ) {
        while(yN-- >0){
			if( y==maxY ) ydir = -1;
			else if (y == min) ydir = 1;
			y += ydir;
		}
	
		System.out.println(x +" "+y);
		
	}
	
}