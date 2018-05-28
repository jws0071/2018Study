package DP;

// 점화식을 구하지 못함

import java.util.Arrays;
import java.util.Scanner;

public class p3_1_11722 {
  static int max =0;
  static int[] arr_check= new int[1001];
	static int[] arr_result = new int[1001];
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int arr_cnt = sc.nextInt();

		sc.nextLine();
		for(int i = 1; i<=arr_cnt; i++) { // 앞에 값을 계산해야되니 1부터
			arr_result[i] = sc.nextInt();

		}
		// arr_result 값이 증가함에 따라 변경  크면 종료 같으면 패스 작으면 카운트 
		for(int j =1; j<=arr_cnt;j++) {
			arr_check[j] = f(j, arr_cnt);


		}
		
		Arrays.sort(arr_check);
		System.out.println(arr_check[1000]+1);
		sc.close();
	
		
	}
	
	
	
	public static int f(int j, int arr_cnt) {
		int result = 1;
		int post = arr_result[j];
		for (int x = j+1; x<=arr_cnt;x++) {
		
		 if(arr_result[j] > arr_result[x] && post > arr_result[x]) {
			 		post = arr_result[x];

			 		result += 1;
			}else if(arr_result[j] < arr_result[x]) {
				break;
			}
		}
		
		return result;
	}
}

/*


가장 긴 감소하는 부분 수열
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	4583	2836	2372	65.634%
문제
수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 30, 10, 20, 20, 10} 인 경우에 가장 긴 감소하는 부분 수열은 A = {10, 30, 10, 20, 20, 10}  이고, 길이는 3이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열의 길이를 출력한다.

예제 입력 1 
6
10 30 10 20 20 10
예제 출력 1 
3


public class Main {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    int[] dp = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();
    }

    for(int i = 1; i < n; i++){
      for(int j = 0; j < i; j++){
        if(arr[i] < arr[j]){ // ---- 1
          if(dp[j] + 1 > dp[i]){ // ---- 2
            dp[i] = dp[j] + 1;
          }
        }
      }
    }

    int max = dp[0];
    for(int i = 1; i < n; i++){
      if(max < dp[i]){
        max = dp[i];
      }
    }

    System.out.println(max + 1);
  }
}


*/