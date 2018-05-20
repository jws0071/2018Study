package in_out;

import java.util.Scanner;

public class p1_29_10992 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	

		for(int i =1; i<=input-1; i++) {
			for(int y=input-i; y>0;y--) {
				System.out.print(" ");
			}
			for(int x=2*i-1; x>0;x--) {
				if(x==2*i-1 || x==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			

			
			System.out.println();
			
		}
		for(int i=0; i<(input*2)-1; i++) {

					System.out.print("*");
			}
			

			
			System.out.println();
			
	

		sc.close();
		
	}
}
