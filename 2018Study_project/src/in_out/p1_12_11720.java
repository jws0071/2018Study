package in_out;

import java.util.Scanner;

public class p1_12_11720 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	
	int a = sc.nextInt();
	int result =0;
	sc.nextLine();
	String[] spilt = new String[a];
	String input = sc.nextLine();
	spilt = input.split("");
	for(int i =0 ; i<spilt.length; i++) {
		result += Integer.parseInt(spilt[i]);
			
	}
	System.out.println(result);
	sc.close();
	}

}
