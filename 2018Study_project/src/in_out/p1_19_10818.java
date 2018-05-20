package in_out;

import java.util.Arrays;
import java.util.Scanner;

public class p1_19_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int input = sc.nextInt();
		int[] result = new int[input];
		sc.nextLine();
		for(int i=0; i<input; i++) {
			result[i] = sc.nextInt();
			
		}
		Arrays.sort(result);
		
		System.out.println(result[0]+ " " + result[input-1]);
	}

}
