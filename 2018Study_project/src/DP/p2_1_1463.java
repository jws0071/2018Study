package DP;

import java.util.Scanner;

public class p2_1_1463 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();
		

		sc.close();

		int result = 0;
		while (num > 0 ) {
			if(num % 3 == 0) {
				num = num / 3;
				result += 1;
				System.out.println("t3");
			}else if(num % 2 == 0) {
				num = num / 2;
				result += 1;
				System.out.println("t2");
			}else {
				num = num -1;
				result += 1;
				System.out.println("t1");
			}
		}
		System.out.println(result);


	}
}


/*
import java.util.Scanner;

 

class Main{

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        int dp[] = new int[n+1];

        

        for(int i=2;i<=n;i++){

            dp[i] = dp[i-1]+1;

            if(i%2==0 && dp[i]>dp[i/2]+1)

                dp[i] = dp[i/2]+1;

            if(i%3==0 && dp[i]>dp[i/3]+1)

                dp[i] = dp[i/3]+1;

        }

        System.out.println(dp[n]);

    }

    public static int min(int a,int b){

        return a>b?b:a;

    }

}
*/