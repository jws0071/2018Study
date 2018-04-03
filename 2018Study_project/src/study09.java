import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class study09 {

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(sc.readLine());
		
	
		
		int[] st_arr = new int[cnt];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());
		
		for(int x=0; x < cnt; x++) {
			st_arr[x] = Integer.parseInt(st.nextToken());
			
		}
		sc.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> sum = new ArrayList<Integer>(); //sum 하려고 만들엇는데 필요 없을듯
		ArrayList<Integer> sum_sort = new ArrayList<Integer>(); //sum 하려고 만들엇는데 필요 없을듯
		part(st_arr,list,sum,0);
		for(int i=0; i< sum.size(); i++) {
			sum_sort.add(sum.get(i).intValue());
			
		}
		Collections.sort(sum_sort);
		int frist_index = 0;
		int last_index = 0;
		int middle_sum = 0;
		for(int x=0; x< sum.size(); x++) {
			if(sum_sort.get(sum_sort.size()-1).intValue() == sum.get(x).intValue()) {
				frist_index = list.get((x*2)).intValue();
				last_index = list.get((x*2)+1).intValue();
				middle_sum = sum.get(x).intValue();
				break;
			}
		}
		
		//앞에 값계산
		int frist_sum =0;
		if(frist_index == 0) {
			frist_sum=0;
		}else {
			for(int a=0; a<frist_index; a++) {
				
				if(list.get(a).intValue()<list.get(frist_index).intValue()){
					
					frist_sum += list.get(a).intValue();
				}
			
			}
		}
		
		//뒤에 값계산
		int last_sum =0;
		if(last_index == list.size()-1) {
			last_sum=0;
		}else {
			for(int b=last_index+1; b<list.size()-1; b++) {
				
				if(list.get(b).intValue()>list.get(last_index).intValue()){
					
					last_sum += list.get(b).intValue();
				}
			
			}
		}
		System.out.println(frist_sum+middle_sum+last_sum);
	
		
		
		
		

    //  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 속도 차이남 
      //bw.write(Integer.toString(arr_num[score-1])+"\n" );

     // bw.close();
      
      
		
	}
	
	
	// 입력받은 리스트를 다음값이 작으면 part를 나눠서 이용
	public static void part(int[] st_arr, ArrayList<Integer> list,ArrayList<Integer> sum, int T) {
		list.add(T);
		int sum_result = 0;
		for(int i = T; i<st_arr.length;i++) {
			sum_result += st_arr[i];
			if(i == st_arr.length-1) {
				list.add(i);
				sum.add(sum_result);
				return;
			}else {
				if(st_arr[i]>st_arr[i+1]) {
					list.add(i);
					sum.add(sum_result);
					part(st_arr,list,sum,i+1);
					
					break;
				}	
			}
		}
	}


	
}

/*
문제
수열 A가 주어졌을 때, 그 수열의 증가 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 인 경우에 합이 가장 큰 증가 부분 수열은 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 이고, 합은 113이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 
출력
첫째 줄에 수열 A의 합이 가장 큰 증가 부분 수열의 합을 출력한다.

예제 입력 1 
10
1 100 2 50 60 3 5 6 7 8
예제 출력 1 
113

*/