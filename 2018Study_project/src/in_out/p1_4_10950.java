package in_out;

import java.util.Arrays;
import java.util.Scanner;

public class p1_4_10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
		int a = sc.nextInt();
		int[] result = new int[a];
		
		
		for(int i =0 ; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			result[i]  = b+c;	
		}
		sc.close();
		for(int i =0 ; i<a; i++) {
		
			System.out.println(result[i]);	
		}		
		

	}
}


/*


5
1 1
2 3
3 4
9 8
5 2

*/