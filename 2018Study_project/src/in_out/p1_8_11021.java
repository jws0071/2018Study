package in_out;


import java.util.Scanner;

public class p1_8_11021 {
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
		
			System.out.println("Case #"+(i+1)+": "+result[i]);	
		}		
		

	}
}