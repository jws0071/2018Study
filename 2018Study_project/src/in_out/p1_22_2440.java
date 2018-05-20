package in_out;

import java.util.Scanner;

public class p1_22_2440 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int x = 0; x < input-i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
