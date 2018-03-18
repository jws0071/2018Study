

/*
 * 문제
유진이가 즐겨하는 디제이맥스 게임은 각각의 노래마다 랭킹 리스트가 있다. 이것은 매번 게임할 때 마다 얻는 점수가 비오름차순으로 저장되 있는 것이다.

이 랭킹 리스트의 등수는 보통 위에서부터 몇 번째 있는 점수인지로 결정한다. 하지만, 같은 점수가 있을 때는 그러한 점수의 등수 중에 가장 작은 등수가 된다.

예를 들어 랭킹 리스트가 100, 90, 90, 80일 때 각각의 등수는 1, 2, 2, 4등이 된다

랭킹 리스트에 올라 갈 수 있는 점수의 개수 P가 주어진다. 그리고 리스트에 있는 점수 N개가 비오름차순으로 주어지고, 송유진의 새로운 점수가 주어진다. 이 때, 송유진의 새로운 점수가 랭킹 리스트에서 몇 등 하는지 구하는 프로그램을 작성하시오. 만약 점수가 랭킹 리스트에 올라갈 수 없을 정도로 낮다면 -1을 출력한다.

만약, 랭킹 리스트가 꽉 차있을 때, 새 점수가 이전 점수보다 더 좋을 때만 점수가 바뀐다. (예제 2)

입력
첫째 줄에 N, 송유진의 새로운 점수, 그리고 P가 주어진다. P는 10보다 크거나 같고, 50보다 작거나 같고 N은 0보다 크거나 같고, P보다 작거나 같다. 그리고 모든 점수는 2000000000보다 작거나 같은 정수이다. 둘째 줄에는 현재 랭킹 리스트에 있는 점수가 비오름차순으로 주어진다.

출력
첫째 줄에 문제의 정답을 출력한다.

예제 입력 
3 90 10
100 90 80
예제 출력 
2
예제 입력 2 
10 1 10
10 9 8 7 6 5 4 3 2 1
예제 출력 2 
-1

http://hahahoho5915.tistory.com/9
 */

import java.util.Scanner;

public class study04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
		
		int num = sc.nextInt();
		int[] line2 = new int[num];
		int[] line2_result = new int[num];
		int you_point = sc.nextInt();
		int num_1 = sc.nextInt();

		int k = 1, h=1;
		
	
		for(int i=0; i<line2.length;i++) {
			line2[i] = sc.nextInt();
		}
		sc.close();
		study04 quick = new study04();
        quick.sort(line2, 0, line2.length - 1);
		
		
	    for(int i=0; i<line2.length;i++) {
	    	
	    	line2_result[i] = line2[num-1];
	    	num--;
	    	
	    }
		
		
    for(int i=0; i<line2_result.length; i++) {
    	
    	if(line2_result[i] < you_point ) {
    		
    		break;
    	}else if(line2_result[i] == you_point ) {
    		h++;

    	}else {
    		k++;
    	}
    	
    	
    	
    	
    }
    
    if(k >= num_1) {
    	System.out.println(-1);
    	
    }else if(h + k > num_1   ) {
    	 
    	 System.out.println(-1);
    }else {
    	
    	System.out.println(k);
    }
    
   

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




