package in_out;


import java.util.Scanner;

public class p1_7_10953 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);  
			int len = sc.nextInt();

			sc.nextLine();
			for (int i =0; i < len; i++) {
				String input = sc.nextLine();
				String[] result = input.split(",");
				
				System.out.println(Integer.parseInt(result[0])+Integer.parseInt(result[1]));
				
			}
			
			
			
			sc.close();


			
	
	}
}

/*  5
1,1
2,3
3,4
9,8
5,2
*/