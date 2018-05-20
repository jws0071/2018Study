package in_out;

import java.util.Scanner;

public class p1_27_2446 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	

		for(int i =0; i<input-1; i++) {
			for(int x=0; x<i;x++) {
				System.out.print(" ");
			}
			for(int y=i+1; y <=(input*2)-i-1;y++) {
				System.out.print("*");
			}

			
			System.out.println();
			
		}
		for(int i =input-1; i>=0; i--) {
			for(int x=0; x<i;x++) {
				System.out.print(" ");
			}
			for(int y=i+1; y <=(input*2)-i-1;y++) {
				System.out.print("*");
			}

			System.out.println();
			
		}

		sc.close();
		
	}
}
