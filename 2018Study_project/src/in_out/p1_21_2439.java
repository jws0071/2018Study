package in_out;

import java.util.Scanner;

public class p1_21_2439 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int a = 0; a < n; a++) {

			for (int b = 0; b < n-a-1; b++) {

				System.out.print(" ");

			}

			for (int c=0; c<a+1; c++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}
}
