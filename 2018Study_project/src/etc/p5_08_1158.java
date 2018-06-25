package etc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class p5_08_1158 {
	public static void main(String args[]) {
    LinkedList list = new LinkedList();
    LinkedList list_result = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp_num = num;
		int up_index = 0;
		int del = sc.nextInt();

		for(int i = 1; i<=num; i++ ) {
			list.add(i);
		}
		while(list.size() > 0) {

			
			if(list.size() <= del-1) {
			  for (int i =0; i<list.size();i++) {
			  	list_result.add(list.get(i));
			  }
			  for (int j =0; j<list.size();j++) {
			  	list.remove(j);
			  }
			break;
	
			}else if((up_index+del)-1 > list.size()) {
				int temp = (up_index+del)-1 - list.size();
				up_index = temp;
				list_result.add(list.get(up_index));
				list.remove(up_index);

			}else {
				up_index += del-1;
				list_result.add(list.get(up_index));
				list.remove(up_index);

			}

			
		}
		
		for(int x=0;x<list_result.size();x++) {
			if(x == 0) {
				System.out.print("<"+list_result.get(x)+", ");	
			}else if(x==list_result.size()-1) {
				System.out.print(list_result.get(x)+">");
			}else {
				System.out.print(list_result.get(x)+", ");	
			}
			
			
		}
		
		sc.close();
	 
 }
}


/*
문제
조세퍼스 문제는 다음과 같다.

1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다. 이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다. 예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 M이 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ M ≤ N ≤ 5,000)

출력
예제와 같이 조세퍼스 순열을 출력한다.

예제 입력 1 
7 3
예제 출력 1 
<3, 6, 2, 7, 5, 1, 4>

*/