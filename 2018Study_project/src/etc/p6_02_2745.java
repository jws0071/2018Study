package etc;

import java.util.Scanner;

public class p6_02_2745 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int n = sc.nextInt();
		long result = 0;
		
		
		for(int i =1; i <= num.length();i++) {
			int ac_num = (int) num.charAt(i-1);
			//System.out.println(n^(num.length()-i));
			if(ac_num > 64) {
				result = (long) (result + ((ac_num - 55) * Math.pow(n, (num.length()-i))));
			}else {
				result = (long) (result + ((ac_num - 48) * Math.pow(n, (num.length()-i))));
			}

		}

			System.out.println(result);

		sc.close();
	}
	
  
}
