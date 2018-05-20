package in_out;

import java.util.Scanner;

public class p1_20_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String result = "";
		for(int i=1; i<=input; i++) {
			result += "*";
			System.out.println(result);
		}
		
	}

}
