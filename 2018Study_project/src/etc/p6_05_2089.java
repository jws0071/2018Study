package etc;
// 공부 예정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p6_05_2089 {
	public static void main(String[] args) throws IOException {

		int N;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		if (N == 0) {

			System.out.println(N);
			return;
		}

		StringBuilder outputStr = new StringBuilder();

		while (N != 1) {

			outputStr.append(Math.abs(N % (-2)));
			N = (int) Math.ceil((double) N / (-2));
		}
		outputStr.append(N);

		System.out.println(outputStr.reverse());
	}
	

}
