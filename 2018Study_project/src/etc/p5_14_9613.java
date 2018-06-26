package etc;

import java.util.Scanner;

public class p5_14_9613 {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int test_case = sc.nextInt();
		 sc.nextLine();
		 for (int i =0; i<test_case; i++) {
			 String temp_str = sc.nextLine();
			 String[] input_array = temp_str.split(" ");
			 int cnt = input_array.length;
			 int result = 0;
			 
			 for(int j=1;j<cnt;j++) {
				 System.out.println(input_array[j-1]);
				 System.out.println(input_array[j]);
				  int a = Integer.parseInt(input_array[j-1]);
				  int b = Integer.parseInt(input_array[j]);
				  
				 	int aa = a;
			    int bb = b;
			    while(a>0){ 
			      if(a<b){ 
			        int temp = a; 
			        a = b; 
			        b = temp; 
			      } 
			      a = a%b; 
			    } 
			    System.out.println(b);
			    result = result+b;
				 
			 }

		    System.out.println(result);
		 }
		  sc.close();
  
	}
}
/*
문제
양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 t (1 < t < 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 첫째 줄에는 수의 개수 n (1 < n < 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1000000을 넘지 않는다.

출력
각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.

예제 입력 1 
3
4 10 20 30 40
3 7 5 12
3 125 15 25
예제 출력 1 
70
3
35

*/