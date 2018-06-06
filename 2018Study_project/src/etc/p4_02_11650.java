package etc;


import java.util.Arrays;
import java.util.Scanner;

public class p4_02_11650 {
	public static void main(String args[]) {
	
	Scanner  sc = new Scanner(System.in);
	int num  = sc.nextInt();
	int[][] arr_num = new int[num][2];
	sc.nextLine();
	for(int i=0; i<num;i++) {
		arr_num[i][0] = sc.nextInt();
		arr_num[i][1] = sc.nextInt();
		sc.nextLine();
	}
	sc.close();
	Arrays.sort(arr_num);
	
	
	for(int i=0; i<num;i++) {
		System.out.println(arr_num[i]);
	}
			
	}
}
