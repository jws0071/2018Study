package in_out;


import java.util.Scanner;

public class p1_9_11022 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
		int a = sc.nextInt();
		int[] result = new int[a];
		
		
		for(int i =0 ; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			result[i]  = b+c;	
			System.out.println("Case #"+(i+1)+": "+ b + " + " + c + " = " + result[i]);	
			
		}
		sc.close();
		
	}
}