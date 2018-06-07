package etc;


// 예전 퀵소트 문제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


	public class p4_06_10989 {
		

		public static void main(String[] args)throws Exception {

			//Scanner sc = new Scanner(System.in);  
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

			int num = Integer.parseInt(sc.readLine());
			
			int[] arr_num = new int[num];


			for (int i=0; i<arr_num.length; i++) {

				arr_num[i] = Integer.parseInt(sc.readLine());
				
			}
			sc.close();

			p4_06_10989 quick = new p4_06_10989();

	            quick.sort(arr_num, 0, arr_num.length - 1);
			


	           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
	            for(int y=0;y<arr_num.length; y++) {
					bw.write(Integer.toString(arr_num[y])+ "\n" );
					//System.out.println(arr_num[y]);
				}

			bw.close();

			
		}

		
		public void sort(int[] arr, int left, int right) {
			 
	        if (arr == null || arr.length < 0)
	            return;
	 
	        if (left < 0 || right < 0)
	            return;

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
