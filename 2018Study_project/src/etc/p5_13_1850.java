package etc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//런타임 에러
import java.util.Scanner;
import java.util.StringTokenizer;

public class p5_13_1850 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );

		long a = Long.parseLong( st.nextToken() );
		long b= Long.parseLong( st.nextToken() );

		 String result ="";
   
    long aa = a;
    long bb = b;
    while(a>0){ 
      if(a<b){ 
      	long temp = a; 
        a = b; 
        b = temp; 
      } 
      a = a%b; 
    } 

    for(int i=0;i<b;i++){
    		System.out.print(1);
    	//result = result + "1";
    	
    }
    /*
    BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    bw.write( Long.toString(b));
    bw.flush();
    bw.close(); 1000000000000000000 1000000000000000000
    */
}
	
}
/*

문제
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이 때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.

예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

입력
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 19자리를 넘지 않는 자연수이다.

출력
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.

예제 입력 1 
3 4
예제 출력 1 
1
예제 입력 2 
3 6
예제 출력 2 
111
*/