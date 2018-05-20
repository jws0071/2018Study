package in_out;

import java.util.Scanner;

public class p1_6_10952 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);  
						
			while(sc.hasNextInt()) {
				 int input_1 = sc.nextInt();
				 int input_2 = sc.nextInt();
				 
				 if(input_1 == 0 && input_2 == 0) {
					 break;
				 }else {
					 System.out.println(input_1+input_2);	 
				 }
				 
			}
			sc.close();


			
	
	}
}
/*
1 1
2 3
3 4
9 8
5 2
*/