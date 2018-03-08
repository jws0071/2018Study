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

		Scanner sc = new Scanner(System.in);  
		
		int num = sc.nextInt();
		int[] arr_num = new int[num];
		int[] arr_num_re = new int[num];
	 //System.out.println(arr_num.length);
		for (int i=0; i<arr_num.length; i++) {
			arr_num[i] = sc.nextInt();
			
		}
		sc.close();

			
			//arr_num_re=ArrayPrint(arr_num);
			study03 quick = new study03();
      quick.sort(arr_num, 0, arr_num.length - 1);
			//arr_num_re=sort(arr_num, 0, arr_num.length - 1);
			
			for(int y=0;y<arr_num.length; y++) {
				System.out.println(arr_num[y]);
			}
			
			
			//System.out.println("test");
			
		
		
	}
	public void sort(int[] data, int l, int r){
    int left = l;
    int right = r;
    int pivot = data[(l+r)/2];
    
    do{
        while(data[left] < pivot) left++;
        while(data[right] > pivot) right--;
        if(left <= right){    
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
    }while (left <= right);
    
    if(l < right) sort(data, l, right);
    if(r > left) sort(data, left, r);
}
	
	

}
