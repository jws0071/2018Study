package DP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p3_9_2011 {

	static final int DIVISOR = 1_000_000;

	public static void main(String[] args) throws IOException {

		int[] dp;
		StringBuilder inputStr;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		inputStr = new StringBuilder(br.readLine());   // 객체 크기를 알기위해서 
		dp = new int[inputStr.length()];

		for (int i = 0; i < dp.length; i++) {

			dp[i] = 0;
		}

		// 예외처리 : 입력값이 0인 경우
		if (inputStr.length() == 1 && Integer.parseInt(inputStr.substring(0)) == 0) {

			dp[0] = 0;
		} else {

			dp[0] = 1;
		}
		System.out.println("inputStr = " + inputStr.length());
		for (int i = 1; i < inputStr.length(); i++) {

			int temp = Integer.parseInt(inputStr.substring(i - 1, i + 1));
			int prev = Integer.parseInt(inputStr.substring(i - 1, i));
			int curr = Integer.parseInt(inputStr.substring(i, i + 1));
			
			System.out.println("i = " + i);
			System.out.println("temp = " + temp);
			System.out.println("prev = " + prev);
			System.out.println("curr = " + curr);

			// 해석할 수 없는 경우
			if (temp == 0) {

				System.out.println(0);
				return;
			}

			// 해석할 수 있는 경우
			// 1. 두자리수로 해석할 수 있는 경우
			if (temp >= 1 && temp <= 26) {

				if (curr != 0) {

					dp[i] += dp[i - 1];
				}

				if (prev != 0) {

					dp[i] += (i - 2) >= 0 ? dp[i - 2] : 1;
				}

				dp[i] %= DIVISOR;
			}
			// 2. 한자리수로 해석할 수 있는 경우
			else {

				dp[i] = dp[i - 1];
			}
			System.out.println("dp[i] = " + dp[i]);
		}

		System.out.println(dp[inputStr.length() - 1]);
	}
}

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	static final int DIVISOR = 1_000_000;

	public static void main(String[] args) throws IOException {

		int[] dp;
		StringBuilder inputStr;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		inputStr = new StringBuilder(br.readLine());   // 객체 크기를 알기위해서 
		dp = new int[inputStr.length()];

		for (int i = 0; i < dp.length; i++) {

			dp[i] = 0;
		}

		// 예외처리 : 입력값이 0인 경우
		if (inputStr.length() == 1 && Integer.parseInt(inputStr.substring(0)) == 0) {

			dp[0] = 0;
		} else {

			dp[0] = 1;
		}

		for (int i = 1; i < inputStr.length(); i++) {

			int temp = Integer.parseInt(inputStr.substring(i - 1, i + 1));
			int prev = Integer.parseInt(inputStr.substring(i - 1, i));
			int curr = Integer.parseInt(inputStr.substring(i, i + 1));

			// 해석할 수 없는 경우
			if (temp == 0) {

				System.out.println(0);
				return;
			}

			// 해석할 수 있는 경우
			// 1. 두자리수로 해석할 수 있는 경우
			if (temp >= 1 && temp <= 26) {

				if (curr != 0) {

					dp[i] += dp[i - 1];
				}

				if (prev != 0) {

					dp[i] += (i - 2) >= 0 ? dp[i - 2] : 1;
				}

				dp[i] %= DIVISOR;
			}
			// 2. 한자리수로 해석할 수 있는 경우
			else {

				dp[i] = dp[i - 1];
			}
		}

		System.out.println(dp[inputStr.length() - 1]);
	}
}
*/