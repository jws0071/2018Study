
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class study06 {
	

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(sc.readLine());
		
		int[] arr_num = new int[num];

		for (int i=0; i<arr_num.length; i++) {

			arr_num[i] = Integer.parseInt(sc.readLine());
			
		}
		sc.close();

		study06 quick = new study06();
            quick.sort(arr_num, 0, arr_num.length - 1);

           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 속도 차이남 
			
            for(int y=0;y<arr_num.length; y++) {
				bw.write(Integer.toString(arr_num[y])+"\n" );
				
			}

		bw.close();
		
	}
    public void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println("");
    }

	
	public void sort(int[] arr, int left, int right) {
		 
         if (left >= right) {
        	 
            return;
        }

 
        int lowIdx = left + 1;
        int highIdx = right;
        int pivot = arr[left];
 

     
        while (lowIdx <= highIdx) {
        
            while (lowIdx <= right && arr[lowIdx] <= pivot) {
            	
            	
                lowIdx++;
            }
 
            while (left + 1 <= highIdx && pivot <= arr[highIdx]) {

                highIdx--;
            }

            if (lowIdx <= highIdx) {
                int temp = arr[lowIdx];
                arr[lowIdx] = arr[highIdx];
                arr[highIdx] = temp;
            } else {


            	
                arr[left] = arr[highIdx]; // pivot이 자신의 자리를 찾아가는 과정
                arr[highIdx] = pivot;
            }
            
        }

 
        sort(arr, left, highIdx - 1);
        sort(arr, highIdx + 1, right);
    }


	

}


/*
 문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1<=N<=1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절대값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 
5
5
4
3
2
1
예제 출력 
1
2
3
4
5
*/
