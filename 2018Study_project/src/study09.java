import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class study09 {

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(sc.readLine());
		
	
		
		int[] st_arr = new int[cnt];
		int[] st_arr_result = new int[cnt];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());
		int temp = 0;
		for(int x=0; x < cnt; x++) {
			st_arr[x] = Integer.parseInt(st.nextToken());
			
		}
		sc.close();
		
		for(int i =0; i<=st_arr.length; i++) {
			st_arr_result[i] = st_arr[i];
			for(int j=0; j<=i;j++)
			
		}
		
		
		for(int j=0; j <st_arr_result.length;  j++) {
			
			System.out.println(st_arr_result[j]);		
				
			
		}
		Arrays.sort(st_arr_result);

		//System.out.println(st_arr_result[st_arr_result.length-1]);
		
	}
	
}

/*
문제

10
1 100 55 50 60 3 5 6 7 8
8
3 10 2 7 11 5 13 8

10
1 100 2 50 60 3 5 6 7 8

10
100 110 90 80 70 80 90 1 2 3

수열 A가 주어졌을 때, 그 수열의 증가 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 인 경우에 합이 가장 큰 증가 부분 수열은 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 이고, 합은 113이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 
출력
첫째 줄에 수열 A의 합이 가장 큰 증가 부분 수열의 합을 출력한다.

예제 입력 1 
10
1 100 2 50 60 3 5 6 7 8
예제 출력 1 
113

*/