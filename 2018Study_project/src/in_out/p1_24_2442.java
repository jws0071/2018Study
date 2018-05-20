package in_out;

import java.util.Scanner;

public class p1_24_2442 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int new_cnt = (input*2)-1;
		String[] arr_input = new String[new_cnt];
		
		for(int i =0; i<input; i++) {
			
			for (int x=0;x<(input-i)-1;x++ ) {
				System.out.print(" ");
				
			}
			for (int x=(input-i)-1;x<((input-i)-1)+((i*2)+1);x++ ) {
				System.out.print("*");
				
			}
			
		
			System.out.println();
			
		}
			

		sc.close();
	}
}
