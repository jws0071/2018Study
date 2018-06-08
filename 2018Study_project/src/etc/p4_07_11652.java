package etc;

import java.util.Arrays;
import java.util.Scanner;


public class p4_07_11652 {
	public static void main(String args[]) {
	
	Scanner  sc = new Scanner(System.in);
	int num  = sc.nextInt();
	int max = 0;
	int[] arr_num = new int[num];
	int[] result = new int[num];
	sc.nextLine();
	
	
	for(int i=0; i<num;i++) {
		arr_num[i] = sc.nextInt();

	}
	
	sc.close();
	Arrays.sort(arr_num);
	
	for(int j=0; j<num; j++) {
		
		arr_num[i]
		
		
		
	}
	
	
	
	
	
	
	
	
	for(int i=0; i<num;i++) {
		System.out.println(arr_num[i]);
	}
			
	}
}


/*


준규는 숫자 카드 N장을 가지고 있다. 숫자 카드에는 정수가 하나 적혀있는데, 적혀있는 수는 -262보다 크거나 같고, 262보다 작거나 같다.

준규가 가지고 있는 카드가 주어졌을 때, 가장 많이 가지고 있는 정수를 구하는 프로그램을 작성하시오. 만약, 가장 많이 가지고 있는 정수가 여러가지라면, 작은 것을 출력한다.

입력
첫째 줄에 준규가 가지고 있는 숫자 카드의 개수 N (1 <= N <= 1000000)이 주어진다. 둘째 줄부터 N개 줄에는 숫자 카드에 적혀있는 정수가 주어진다.

출력
첫째 줄에 준규가 가장 많이 가지고 있는 정수를 출력한다.

예제 입력 1 
5
1
2
1
2
1
예제 출력 1 
1


예제 입력 2 
6
1
2
1
2
1
2
예제 출력 2 
1


*/