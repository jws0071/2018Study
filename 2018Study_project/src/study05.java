
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.StringTokenizer;


	public class study05 {
		

		public static void main(String[] args)throws Exception {

			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = null;
			StringTokenizer st_1 = null;
			
			int[] st_arr = new int[2];
			
			st = new StringTokenizer(sc.readLine());
			
			for(int x=0; x<=1; x++) {
				st_arr[x] = Integer.parseInt(st.nextToken());
			}
			
			int num = st_arr[0];
			int score = st_arr[1];
			int result = 1;

			
			int[] arr_num = new int[num];
				
			st_1 = new StringTokenizer(sc.readLine());
			for (int i=0; i<arr_num.length; i++) {

				arr_num[i] = Integer.parseInt(st_1.nextToken());
				
			}

			sc.close();

				study05 quick = new study05();
	      quick.sort(arr_num, 0, arr_num.length - 1);

				

	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 속도 차이남 
				
	      for(int y=0;y<arr_num.length; y++) {
	      	bw.write(Integer.toString(arr_num[y])+"\n" );
	      	if(arr_num[y] == score) {
	      		bw.write(Integer.toString(result)+"\n" );
	      	}else {
	      		result ++;
	      	}
					
					
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
			 	int lo = left + 1;
	      int gt = right - 1;
	      int lt = arr[left];
	      int ht = arr[right];
	      study05 swap_f = new study05();
	      study05 qu = new study05();

	      
	      
	       while (arr[lo] <= lt) {           	
	      	 lo++;
          }
          while (ht <= arr[gt]) {
          	gt--;
          }
          if (arr[lo] > lt) {
          	lo = lo - 1;
          	swap_f.swap(arr, left, lo);
	        } 
	        if (arr[gt] < ht) {
	        	gt = gt + 1;
	        	swap_f.swap(arr, right, gt);
	        } 
	        qu.quick(arr, left, lo-1);
	        qu.quick(arr, lo+1, gt-1);
	        qu.quick(arr, gt+1, right);

	        
	       
	        
		}

	    public void quick(int[] arr, int left, int right) { 

        
        if (left >= right) {
       	 
          return;
      }
        

	        int lowIdx = left + 1;
	        int highIdx = right;
	        int pivot = arr[left];
	        
	        
        
	        //printArray(arr);
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
					
	        
	        
	        /*
	        
	        sort(arr, left, highIdx - 1);
	        sort(arr, highIdx + 1, right);
	        
	        quick(arr, left, lowIdx-1);
	        quick(arr, lowIdx+1, highIdx-1);
	        quick(arr, highIdx+1, right);

	        */
	        sort(arr, left, right);
	        

	    }

		public void swap(int[] arr, int pi, int Idx) {
    int temp = arr[Idx];
    arr[Idx] = arr[pi];
    arr[pi] = temp;
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