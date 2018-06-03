package DP;
import java.util.Scanner; // 계단 오르기 문제

public class p3_4_2579 {
 
    static int[] list;
    static int[][] result;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        list = new int[n+1];
        result = new int[n+1][2];
        for (int i = 1; i <= n; i++) {
            list[i] = sc.nextInt();
 
        }
        sc.close();
        result[1][0] = result[1][1] = list[1];
        for (int i = 2; i <= n; i++) {
            result[i][0] = result[i - 1][1] + list[i];
            result[i][1] = Math.max(result[i - 2][0], result[i - 2][1]) + list[i];
            
            //System.out.println(result[i][0]+ " "+ result[i][1]);
        }
 
        System.out.println(Math.max(result[n][0], result[n][1]));
    }
}


/*
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
*/
