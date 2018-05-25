package DP;

import java.util.Scanner;

public class p2_3_11727 {
	static int[] d = new int[1000+1];
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(f(n));
    scan.close();
    
}
	public static int f(int n) {
	    if(n<2) return d[n] = 1;
	    if(d[n]>0) {  // 한번 계산해서 값이 있으면 그걸 이용려고
	        return d[n];
	    }else {
	        d[n] = (f(n-1) + f(n-2)*2)%10007; //2부터 3 = 2+1, 4 = 3+2,  5 = 5+3 자기 자리에서  앞에 두개의 값을 합치면 자기것이 나옴
	        return d[n];
	    }
	}
}
  /*

2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×17 직사각형을 채운 한가지 예이다.



입력
첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

출력
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.


*/