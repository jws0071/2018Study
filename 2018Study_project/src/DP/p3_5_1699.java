package DP;

import java.util.Scanner;


// 최고 큰 제곱근으로 계산했지만 틀림 ㅋㅋㅋ
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


	
	
	
	
	/*
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

}


/*
 
 어떤 자연수 N은 그보다 작거나 같은 제곱수들의 합으로 나타낼 수 있다. 
 예를 들어 11=32+12+12(3개 항)이다. 
 이런 표현방법은 여러 가지가 될 수 있는데, 11의 경우 11=22+22+12+12+12(5개 항)도 가능하다. 이 경우, 수학자 숌크라테스는 “11은 3개 항의 제곱수 합으로 표현할 수 있다.”라고 말한다. 
 또한 11은 그보다 적은 항의 제곱수 합으로 표현할 수 없으므로, 11을 그 합으로써 표현할 수 있는 제곱수 항의 최소 개수는 3이다.
 
주어진 자연수 N을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000)

출력
주어진 자연수를 제곱수의 합으로 나타낼 때에 그 제곱수 항의 최소 개수를 출력한다.

예제 입력 1 
7
예제 출력 1 
4
*/