import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class study08 {

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(sc.readLine());
		int[] result = new int[num];
		for (int i=0; i<num; i++) {
			
			result[i] = main_f(sc);

			
		}
		sc.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 속도 차이남 
		
    for(int y=0;y<result.length; y++) {
      bw.write(Integer.toString(result[y])+"\n" );
		}
		bw.close();
		

		
	}


	
	public static int main_f(BufferedReader sc) throws Exception {
		
		StringTokenizer st = null;
		StringTokenizer st_1 = null;
		
		int[] total_num = new int[2];
		st = new StringTokenizer(sc.readLine());
		for (int i=0; i<total_num.length; i++) {
			total_num[i] = Integer.parseInt(st.nextToken());
			//System.out.println(total_num[i]);
		}
	
		
		int[] insert_num = new int[total_num[0]];
		int[] result_num = new int[total_num[0]];
		st_1 = new StringTokenizer(sc.readLine());
		for (int i=0; i<insert_num.length; i++) {

			insert_num[i] = Integer.parseInt(st_1.nextToken());
			//System.out.println(insert_num[i]);
		}
		
		int[] sort_arr = sort_data(insert_num);
		reverseArrayInt(sort_arr);
		result_num = result(sort_arr, insert_num, 0);
		int result=result_num[total_num[1]];

		
		return result;
		
		
	
	}
	
	
	// 역정렬된 값을 넣어서 비교
	public static int[] result (int[] sort_arr, int[] insert_num, int index) throws Exception {
		
		if(index >= sort_arr.length) {

		}else {
		int num = sort_arr[index];
		pop(sort_arr, insert_num, num, index);
		}
		return sort_arr;
	}
	

  
	public static void pop(int[] sort_arr, int[] insert_num, int num,int index ) throws Exception {
		int i = index;

		int[] insert_num_result = new int[insert_num.length];

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int temp : insert_num){
			list.add(temp);
		  //System.out.println(list.get(i).intValue());
		}
		

		//System.out.println("num"+num);	
		while(list.get(i).intValue() < num) {
			if(list.get(i).intValue() == num) {
				return;
			}
			//System.out.println(list.get(i).intValue());	
			list.add(list.get(i).intValue());
			//System.out.println("add"+list.get(i).intValue());	
			list.remove(i);
			//System.out.println("i"+i);	
			
			
		}
		
		//System.out.println("start-1");	
		for(int y=0; y<list.size(); y++) {
			//insert_num_result[i] = list.get(y).intValue();
		  //System.out.println(list.get(y).intValue());	
		}
		//System.out.println("end-1");
	 
		
		for(int x=0; x<list.size(); x++) {
			insert_num_result[x] = list.get(x).intValue();
			//System.out.println(insert_num_result[x]);			
		}
		//System.out.println("end-2");
		index++;
		result(sort_arr, insert_num_result, index);
		
		
	
	}
	
	
	// 들어 값 소팅
	public static int[] sort_data(int[] insert_num ) {
		int[] sort_arr = new int[insert_num.length];
		for (int i=0; i<sort_arr.length; i++) {
			sort_arr[i] = insert_num[i];
		}
		Arrays.sort(sort_arr);

		return sort_arr;
		
	
	}
  //소팅값 역소팅
  public static void reverseArrayInt(int[] array) {
    int temp;

    for (int i = 0; i < array.length / 2; i++) {
      temp = array[i];
      array[i] = array[(array.length - 1) - i];
      array[(array.length - 1) - i] = temp;
    }
  }
  
<<<<<<< HEAD
=======
	public static int[] pop(int[] insert_num, int num ) {
		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int j=0; j<insert_num.length; j++) {
			list.add(insert_num[i]);
		}
		
		
		int last_index = list.size();
		while(list.get(i) >= num) {
			list.add(last_index+1,list.get(i));
			
			last_index++;
			i++;
		}
		
		insert_num = null;
		for(int x=0; x<list.size(); x++) {
			insert_num[i] = list.get(i);
					
		}
		
		return insert_num;

		
	
	}
  
>>>>>>> ff6e4995e0a97e64fe4664a8e557e1bccb182413
  
	
}


/*

문제
여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다. 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.

현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.

여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다. 예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.

입력
첫 줄에 test case의 수가 주어진다. 각 test case에 대해서 문서의 수 N(100이하)와 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue의 어떤 위치에 있는지를 알려주는 M(0이상 N미만)이 주어진다. 다음줄에 N개 문서의 중요도가 주어지는데, 중요도는 적절한 범위의 int형으로 주어진다. 중요도가 같은 문서가 여러 개 있을 수도 있다. 위의 예는 N=4, M=0(A문서가 궁금하다면), 중요도는 2 1 4 3이 된다.

출력
각 test case에 대해 문서가 몇 번째로 인쇄되는지 출력한다.

예제 입력 1 
3  test case

1 0
5

4 2
1 2 3 4

6 0
1 1 9 1 1 1

예제 출력 1 
1
2
5
*/