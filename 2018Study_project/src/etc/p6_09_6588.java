package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p6_09_6588 {
	 
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      st = new StringTokenizer(br.readLine());
      int M = Integer.parseInt(st.nextToken());
      String[] result = new String[100001];
      
      check(M);
      
      bw.write(String.valueOf(i));
      bw.newLine();
      bw.flush();
  }
  
  public static void check(int M) {
  	 for(int i=0; i<=M; i++) {
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
        
       }
   }

  }

}