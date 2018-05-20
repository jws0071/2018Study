package in_out;

import java.util.Scanner;

public class p1_26_2522 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	
		for(int i =0; i<input-1; i++) {
			for(int x=0; x<input-i-1;x++) {
				System.out.print(" ");
			}
			for(int y=input-i; y <=input;y++) {
				System.out.print("*");
			}

			System.out.println();
			
		}
		for(int i =input-1; i>=0; i--) {
			for(int x=0; x<input-i-1;x++) {
				System.out.print(" ");
			}
			for(int y=input-i; y <=input;y++) {
				System.out.print("*");
			}

			System.out.println();
			
		}

		sc.close();
		
	}
}
