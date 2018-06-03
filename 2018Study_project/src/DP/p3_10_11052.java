package DP;


import java.util.*; 

public class p3_10_11052 {  // 붕어빵 판매하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int [n+1]; // 최대값을 넣을 아이
		int p[] = new int [n+1]; // 값을 넣을 아이
		for(int i=1;i<=n;i++) {
			p[i] = sc.nextInt();
		}
			
		for(int i=1;i<=n;i++){
			d[i] = 0;
			for(int j=1;j<=i;j++) {
				d[i] = Math.max(d[i], d[i - j] + p[j]);  
				
				// 갯수를 넘기지 않은 한도내에서 전에 최대값을 가져와서 값을 구함 
				//3-1 2-2 1-3 0-4 이런식으로 값을 넘기지 않고 사용 
				
			}
		}
		System.out.println(d[n]);
		sc.close();
	}
}