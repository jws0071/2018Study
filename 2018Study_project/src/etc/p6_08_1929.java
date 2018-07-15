package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p6_08_1929 {
	 
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      st = new StringTokenizer(br.readLine());
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      
      
      for(int i=M; i<=N; i++) {
          int divide = 2;
          double root = Math.sqrt(i);
          boolean primeNumberFlag = true;
          
          if(i == 1) {
              primeNumberFlag = false;
          }
          
          while(divide <= root) {
              if(i%divide == 0) {
                  primeNumberFlag = false;
                  break;
              }
              divide++;
          }
          if(primeNumberFlag == true) {
              bw.write(String.valueOf(i));
              bw.newLine();
          }
      }
      bw.flush();
  }

}

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p6_08_1929 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     st = new StringTokenizer(br.readLine());
     int num_st = Integer.parseInt(st.nextToken());
     int num_ed = Integer.parseInt(st.nextToken());
 

		int sosuCnt = 0, cnt = 0;

		for (int i = num_st; i <= num_ed; i++) {
			int num2 =i;
			for (int j = 1; j <= num2; j++) {
				if (num2 % j == 0)
					sosuCnt++;
				if(sosuCnt>3) {
					break;
				}
			}
			if (sosuCnt == 2) {
				bw.write(String.valueOf(i));
				bw.newLine();
        
			}
			sosuCnt = 0;
			}
		bw.flush();

	}
	
}
*/
