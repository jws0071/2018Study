package etc;

import java.util.Arrays;
import java.util.Scanner;

public class p4_08_11004 {

	
	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int check = sc.nextInt();
		int arr_num[] = new int[num];
		sc.nextLine();
		
		for(int i=0; i<num;i++) {
			arr_num[i] = sc.nextInt();
		}
		
		Arrays.sort(arr_num);
		
		System.out.println(arr_num[check-1]);
		sc.close();
		
	}
	
}
