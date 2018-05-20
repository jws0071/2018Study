package in_out;

import java.util.Scanner;

public class p1_28_10991 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	

		for(int i =1; i<=input; i++) {
			for(int y=input-i; y>0;y--) {
				System.out.print(" ");
			}
			for(int x=2*i-1; x>0;x--) {
				if(x % 2 == 0) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}	
			}
			

			
			System.out.println();
			
		}
	

		sc.close();
		
	}
}
