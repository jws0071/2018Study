import java.util.Scanner;

/*
 * 
 *    수 정렬하기
  
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

10
5
2
3
1
4
2
3
5
1
7


1
1
2
2
3
3
4
5
5
7

*/


public class study03 {
	

	public static void main(String[] args) {
		
		
	
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		
		int num = sc.nextInt();
		int[] arr_num = new int[num];
		int[] arr_num_re = new int[num];
	 //System.out.println(arr_num.length);
		for (int i=0; i<arr_num.length; i++) {
			//System.out.println("test");
			int num_1 = sc.nextInt();
			arr_num[i] = num_1;
			if(i == arr_num.length-1) {

				sc.close();
				arr_num_re=ArrayPrint(arr_num);
				
				
				for(int y=0;y<arr_num_re.length; y++) {
					System.out.println(arr_num_re[y]);
				}
				
				
				//System.out.println("test");
				
			}
			
		}
		
	}
	public static int[] ArrayPrint(int[] arr_num)	{
		int j = 0;
		 do{
			 j = 0;
			for(int x=0;x<arr_num.length; x++) {
			//System.out.println(j);
				if(x < arr_num.length-1) {
					if(arr_num[x] > arr_num[x+1]) {
					  //System.out.println(arr_num[x]);
						
						int temp = 0;
						temp = arr_num[x+1];
						arr_num[x+1] = arr_num[x];
						arr_num[x] = temp;
						j++;
					}
				}
			}		
		}while(j != 0);
	 return arr_num;
	}



}
