package in_out;
import java.util.Scanner;

public class p1_25_2445 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		//int new_cnt = (input*2)-1;
	
		for(int i =0; i<input-1; i++) {
			for(int x=0; x<=i;x++) {
				System.out.print("*");
			}
			for(int y=i+1; y <(input*2)-i-1;y++) {
				System.out.print(" ");
			}
			for(int z=(input*2)-i; z <=(input*2);z++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i =input-1; i>=0; i--) {
			for(int x=0; x<=i;x++) {
				System.out.print("*");
			}
			for(int y=i+1; y <(input*2)-i-1;y++) {
				System.out.print(" ");
			}
			for(int z=(input*2)-i; z <=(input*2);z++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
			

		sc.close();
		
	}
}
