package DP; 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3_3_1912 {  // 연속합 

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(sc.readLine());
		
	
		
		int[] a = new int[cnt];
		int[] d = new int[cnt];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());

		for(int x=0; x < cnt; x++) {
			a[x] = Integer.parseInt(st.nextToken());
			
		}
		sc.close();
		
		int max = a[0]; // -1 부들부들
		
        for (int i = 0; i < cnt; i++) {
            d[i] = a[i];
            if(i==0) {
               	d[i] = d[i];
            }else {
            	if(d[i-1]<0) {
            		d[i] = d[i]+ 0;
            	}else {
            		d[i] = d[i]+d[i-1];	
            	}
            	
            }
            if(max<d[i]) {
            	max = d[i];
            }
                
          
             
        }
        System.out.println(max);
        //System.out.println(d[i]+"num : "+i);
        
		
		
	}
	
}
/*
푼 문제

문제
n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 숫자는 한 개 이상 선택해야 한다.

예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.

입력
첫째 줄에 정수 n(1≤n≤100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

출력
첫째 줄에 답을 출력한다.

예제 입력 1 
10
10 -4 3 1 5 6 -35 12 21 -1
예제 출력 1 
33

*/