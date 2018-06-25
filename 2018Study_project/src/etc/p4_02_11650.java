package etc;


import java.util.Arrays;
import java.util.Comparator;
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
	Arrays.sort(arr_num, new Comparator<int []>(){
		public int compare(int a[], int b[]) {
			if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
			else return Integer.compare(a[0], b[0]);
		}
	});

	
	
	for(int i=0; i<num;i++) {
		System.out.println(arr_num[i][0] +" "+arr_num[i][1]);

	}

	}

}

