package DP;

import java.util.Scanner;

public class p3_2_11054 {
	 public static void main(String args[]){
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] arr = new int[n];
	    int[] dp_max = new int[n];
	    int[] dp_max_min = new int[n];
	    int[] dp_min = new int[n];
	    int[] dp_min_max = new int[n];
	    for(int i = 0; i < n; i++){
	      arr[i] = scan.nextInt();
	    }
	    
	    scan.close();
	    
	    
	    // 감소 수열로 계산
	    int min_index =0;

	    for(int i = 1; i < n; i++){
	      for(int j = 0; j < i; j++){
	        if(arr[i] < arr[j]){ // ---- 1
	          if(dp_min[j] + 1 > dp_min[i]){ // ---- 2
	          	dp_min[i] = dp_min[j] + 1;
	          }
	        }
	      }
	    }
	    int min = dp_min[0];
	    for(int i = 1; i < n; i++){
	      if(min < dp_min[i]){
	      	min_index = i;
	      	min = dp_min[i];
	      }
	    }
	    for(int i = min_index+1 ; i < n; i++){
	      for(int j = min_index; j < i; j++){
	        if(arr[i] > arr[j]){ // ---- 1
	          if(dp_min_max[j] + 1 > dp_min_max[i]){ // ---- 2
	          	dp_min_max[i] = dp_min_max[j] + 1;
	          }
	        }
	      }
	    }
	    int min_max = dp_min_max[0];
	    for(int i = 1; i < n; i++){
	      if(min_max < dp_min_max[i]){

	      	min_max = dp_min_max[i];
	      }
	    }
	    
	    
	    // 증가 수열로 계산
	    int max_index =0;
	    for(int i = 1; i < n; i++){
	      for(int j = 0; j < i; j++){
	        if(arr[i] > arr[j]){ // ---- 1
	          if(dp_max[j] + 1 > dp_max[i]){ // ---- 2
	          	dp_max[i] = dp_max[j] + 1;
	          }
	        }
	      }
	    }
	    
	    
	    int max = dp_max[0];
	    for(int i = 1; i < n; i++){
	      if(max < dp_max[i]){
	      	max_index =i;
	      	max = dp_max[i];
	      }
	    }
	    for(int i = max_index+1; i < n; i++){
	      for(int j = max_index; j < i; j++){
	        if(arr[i] < arr[j]){ // ---- 1
	          if(dp_max_min[j] + 1 > dp_max_min[i]){ // ---- 2
	          	dp_max_min[i] = dp_max_min[j] + 1;
	          }
	        }
	      }
	    }
	    int max_min = dp_max_min[0];
	    for(int i = 1; i < n; i++){
	      if(max_min < dp_max_min[i]){

	      	max_min = dp_max_min[i];
	      }
	    }
	    
	    
	    
	    System.out.println(Math.max((min+min_max)+1, (max+max_min)+1));
	    //System.out.println(min);
	    //System.out.println(min_max);
	    //System.out.println(max);
	    //System.out.println(max_min);

	 }
	
	 
}
/*
가장 긴 바이토닉 부분 수열
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	4563	2369	1945	54.897%
문제
수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.

예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만,  {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.

수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 부분 수열 중에서 가장 긴 바이토닉 수열의 길이를 출력한다.

예제 입력 1 
10
1 5 2 1 4 3 4 5 2 1
예제 출력 1 
7
힌트
예제의 경우 {1 5 2 1 4 3 4 5 2 1}이 가장 긴 바이토닉 부분 수열이다.
*/