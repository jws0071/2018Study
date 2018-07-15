package etc;

import java.util.Scanner;

public class p6_01_11005 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		String result ="";
		while (num > 0) {
			//System.out.println("test");
			if(num%n >= 10) {
				int temp = num%n;
				temp = temp + 55;
				result  = result + (char) temp;
			}else {
				result = result +(num%n);
			}
			num = num/n;
		}
		
		System.out.println(reverseString(result));
		sc.close();
	}
	
  public static String reverseString(String s) {
    return ( new StringBuffer(s) ).reverse().toString();
  }
	
	
}

/*

문제
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 16, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

출력
첫째 줄에 10진법 수 N을 B진법으로 출력한다.

예제 입력 1 
60466175 36
예제 출력 1 
ZZZZZ

switch (num%n) {
				case 10 : result = result +"A" ;
				      break;
				case 11 : result = result +"B";
		          break;
				case 12 : result = result +"C";
		          break;
				case 13: result = result +"D";
		          break;
				case 14: result = result +"E";
		          break;
				case 15: result = result +"F";
		          break;
				case 16: result = result +"G";
		          break;
				case 17: result = result +"H";
		          break;
				case 18: result = result +"I";
		          break;
				case 19: result = result +"J";
		          break;
				case 20: result = result +"K";
		          break;
				case 21: result = result +"L";
		          break;
				case 22: result = result +"M";
		          break;
				case 23: result = result +"N";
		          break;
				case 24: result = result +"O";
		          break;
				case 25: result = result +"P";
		          break;
				case 26: result = result +"Q";
		          break;
				case 27: result = result +"R";
		          break;
				case 28: result = result +"S";
		          break;
				case 29: result = result +"T";
		          break;
				case 30: result = result +"U";
		          break;	
				case 31: result = result +"V";
		          break;	
				case 32: result = result +"W";
		          break;
				case 33: result = result +"X";
		          break;	
				case 34: result = result +"Y";
		          break;	
				case 35: result = result +"Z";
		          break;	
		          
				}
*/