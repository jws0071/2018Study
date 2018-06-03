package DP;

import java.util.Scanner;

public class p3_6_2133 {  // 타일 채우기 3X1형태
	static int[] d = new int[1000+1];
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] dp = new int[31];
    
    dp[0] = 1;
    
    for(int i=2; i<=n; i+=2)
    {
        dp[i] = dp[i-2]*3;        // 2씩 증가 할때 3가지 경우가 기본 생기므로 x3한다 // 이해가 됨
        for(int j=4; i-j>=0; j+=2) {
        	dp[i] += dp[i-j]*2;     // 4개부터 생기는 2가지 특별 케이스 X2한다 // 이해가 좀 안됨
        }
            
    }
    dp[0] = 0;
    System.out.println(dp[n]);


    scan.close();
	    
	}

}