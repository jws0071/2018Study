package DP;

import java.util.Scanner;

public class p3_4_2579 {

 public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   scan.nextLine();
   int[] arr = new int[302];
   int result_1 = 0;
   int result_2 = 0;
   int result_3 = 0;
   for(int i = 0; i < n; i++){
     arr[i] = Integer.parseInt(scan.nextLine());
   }
   scan.close();

   for(int j=1; j<=n;j+=3) { 
  	 result_1 = arr[j+1]+arr[j+2]+result_1;
  	 result_2 = arr[j]+arr[j+2]+result_2;
  	 result_3 = arr[j]+arr[j+1]+result_3;
  	 /*
  	 System.out.println("j"+j+ ">>>>>>>>>>>>");
  	 System.out.println("result_1"+result_1);
  	 System.out.println("result_2"+result_2);
  	 System.out.println("result_3"+result_3);
  	 */
   }
   
   int last = (n-1)%3; // 마지막값 구분
  	 if(last == 1) {
  		 result_1 = 0;
  	 }else if(last == 2) {
  		 result_2 = 0;
  	 }else {
  		 result_3 = 0;
  	 }
  	 
  	 System.out.println(Math.max(Math.max(result_1, result_2), result_3)+arr[0]);

 }

}


/*


계단 오르는 데는 다음과 같은 규칙이 있다.

1.계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
2.연속된 세 개의 계단을 모두 밟아서는 안된다. 단, 시작점은 계단에 포함되지 않는다.
3.마지막 도착 계단은 반드시 밟아야 한다.



따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다. 하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세번째 계단을 연속해서 모두 밟을 수는 없다.

각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최대값을 구하는 프로그램을 작성하시오.

입력
입력의 첫째 줄에 계단의 개수가 주어진다.

둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다. 계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.

출력
첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최대값을 출력한다.

예제 입력 1 
6
10
20
15
25
10
20
예제 출력 1 
75

*/