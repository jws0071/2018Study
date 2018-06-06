package DP;

import java.util.Scanner;

public class p3_8_2225 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int sum = sc.nextInt();
	    
	    int[][] dp = new int[210][210];
	    for(int i =0;i<=num;i++) {
	    	dp[1][i] = 1;
	    }
	    for(int i =0;i<=num;i++) {
	    	dp[2][i] = i + 1;
	    }
	    for (int i = 3; i <= sum; i++)
	    {
	        for (int j = 0; j <= num; j++)
	            for (int k = 0; k <= j; k++){
	                dp[i][j] = (dp[i][j]+dp[i - 1][j - k])/1000000000;
	 
	            }
	        
	    }


	    
	    System.out.println(dp[sum][num]/1000000000);
	}
	
	
}
// http://mygumi.tistory.com/135