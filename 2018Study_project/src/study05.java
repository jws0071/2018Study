
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;


	public class study05 {
		

		public static void main(String[] args)throws Exception {

			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

			int num = Integer.parseInt(sc.readLine());
			
			int[] arr_num = new int[num];

			for (int i=0; i<arr_num.length; i++) {

				arr_num[i] = Integer.parseInt(sc.readLine());
				
			}
			sc.close();

				study05 quick = new study05();
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
					study05 swap_f = new study05();
			    swap_f.swap(arr, 0, arr.length - 1);

			    /*
			    
	         if (left >= right) {
	        	 
	            return;
	        }

	 
	        int lowIdx = left + 1;
	        int highIdx = right;
	        int pivot = arr[left];
	 

	        printArray(arr);
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
	        sort(arr, highIdx + 1, right);*/
	    }
		
		public void swap(int[] arr, int left, int right) {
			 
      int lowIdx = left + 1;
      int highIdx = right - 1;
      int first_pivot = arr[left];
      int last_pivot = arr[right];
 
	       while (arr[lowIdx] <= first_pivot) {           	
          	  lowIdx++;
              
          }

          while (last_pivot <= arr[highIdx]) {
              highIdx--;
          }
          

          if (arr[lowIdx] > first_pivot) {
              int temp = arr[lowIdx-1];
              arr[lowIdx-1] = arr[left];
              arr[left] = temp;
          } 
          if (arr[highIdx] < last_pivot) {
            int temp = arr[highIdx+1];
            arr[highIdx+1] = arr[right];
            arr[right] = temp;
        } 
          
          
          
      }

      

			
			
			
		}
/*
11
50
30
20
51
70
80
60
85
100
90
80


	*/





/*
 * http://gwpark.tistory.com/1743
 * 
 * 시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
 
1.5 초	256 MB	10396	2970	1932	29.668%
문제
수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다.

둘째에는 A1, A2, ..., AN이 주어진다. (-109 ≤ Ai ≤ 109)

출력
A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.

예제 입력 
5 2
4 1 2 3 5
예제 출력 
2
*/