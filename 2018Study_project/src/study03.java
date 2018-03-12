
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class study03 {
	

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(sc.readLine());
		
		int[] arr_num = new int[num];

		for (int i=0; i<arr_num.length; i++) {

			arr_num[i] = Integer.parseInt(sc.readLine());
			
		}
		sc.close();

			study03 quick = new study03();
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
 

        printArray(arr);
        while (lowIdx <= highIdx) {
        
            while (lowIdx <= right && arr[lowIdx] <= pivot) {
            	
            	System.out.println("pivot  " + pivot );
            	System.out.println("arr[lowIdx]  " + arr[lowIdx] );
            	
            	System.out.println("test  " + lowIdx );
            	System.out.println("++++++++++++++++++++++++++");
            	
            	
                lowIdx++;
            }
 
            while (left + 1 <= highIdx && pivot <= arr[highIdx]) {
            	System.out.println("pivot  " + pivot );
            	System.out.println("arr[highIdx]  " + arr[highIdx] );
            	
            	System.out.println("test  " + highIdx );
            	System.out.println("___________________________+");
                highIdx--;
            }
            System.out.println("lowIdx  " + lowIdx );
        	System.out.println("highIdx  " +highIdx );
 
            if (lowIdx <= highIdx) {
                int temp = arr[lowIdx];
                arr[lowIdx] = arr[highIdx];
                arr[highIdx] = temp;
            } else {
                System.out.println("left12  " + left );
                System.out.println("highIdx12  " + highIdx );
 

            	
                arr[left] = arr[highIdx]; // pivot이 자신의 자리를 찾아가는 과정
                arr[highIdx] = pivot;
            }
            
        }
        //printArray(arr);
        System.out.println("left  " + left );
        System.out.println("highIdx  " + highIdx );
        System.out.println("right  " + right );

    	
 
        sort(arr, left, highIdx - 1);
        sort(arr, highIdx + 1, right);
    }


	

}


/*
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
*/