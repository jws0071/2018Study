package DP;

import java.util.Scanner;


public class p3_5_1699 {

	public static void main(String[] args)   {
    Scanner sc = new Scanner(System.in);  
		int N = sc.nextInt();
		int[] dp = new int[N + 1];
		sc.close();
		
		dp[0] = 0;
		for (int i = 1; i <= N; i++) {
			dp[i] = i;
			for (int j = 1; j * j <= i; j++) {

				int temp = dp[i - j * j] + 1;
        
				dp[i] = dp[i] > temp ? temp : dp[i];
				System.out.println("i  " +i);
				System.out.println("j  " +j);
				System.out.println("dp[i]  " +dp[i]);
				System.out.println("temp  " +temp);
				
				
			}

		}

		System.out.println(dp[N]);
	}
}

	/*  최고 큰 제곱근으로 계산함 
	static int result = 0;
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    sc.close();
    
    f(n);
    System.out.println(result);  
		
	}
 public static void f(int num) {
	 System.out.println("num"+num);
	 int i = 0;
	 int mux = i * i;
	 
	 if(i >= num) { // num이 0이 되면 종료
		 return; 
	 }

	 while (num >= mux) {
		 System.out.println(num);
		 System.out.println(mux);
		 mux = 0;
		 mux = i * i;
		 i++;
	 }
	 
	 
	 if(num < mux) {
		 result +=1;
		
		 System.out.println("result"+result);
		 System.out.println("i   "+i);
		 System.out.println("result-numn   "+(num - ((i-2)*(i-2))));
		 
		 f(num - ((i-2)*(i-2)) );
	 }else if(num == mux) {
		 result +=1;
	 }
	 
	 
	 
 }
   */



