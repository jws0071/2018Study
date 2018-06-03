package DP;

import java.util.Scanner;  // 파도반 수열 (삼각형 빙글빙글도는문제)

public class p3_7_9461 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); // 테스트 케이스 값
		long[] result = new long [n+1];
		for(int i=0;i<n;i++) { // 초기값 구함		
			long[] arr_result = new long[101]; // 초기값
			arr_result[1] = 1;
			arr_result[2] = 1;
			arr_result[3] = 1;
			arr_result[4] = 2;
			arr_result[5] = 2;
			int check = Integer.parseInt(sc.nextLine()); // 구할값
			int j = 0;
			for(j=6;j<=check; j++) {
				arr_result[j]=arr_result[j-1] +arr_result[j-5];	
			}
			result[i] = arr_result[check];			
		}
		sc.close();
		
		for(int x=0; x<n;x++) {
			System.out.println(result[x]);
		}
		
		
		
	}
}
