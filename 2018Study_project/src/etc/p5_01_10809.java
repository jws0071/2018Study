package etc;

import java.util.Scanner;

// 알파벳 찾기
public class p5_01_10809 {

	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int[] result =  new  int[26];
	
		for(int j=0; j<num.length();j++) {
			//System.out.println(num.substring(j, j+1));
			switch (num.substring(j, j+1)) {
				case "a": 
					if(result[0] == 0) {
						result [0]= j+1;
					}
				  break;
				case "b": 
					if(result[1] == 0) {
						result [1]= j+1;
					}
		      break;
				case "c": 
					if(result[2] == 0) {
						result [2]= j+1;
					}
		      break;
				case "d": 
					if(result[3] == 0) {
						result [3]= j+1;
					}
		      break;
				case "e": 
					if(result[4] == 0) {
						result [4]= j+1;
					}
		      break;
				case "f": 
					if(result[5] == 0) {
						result [5]= j+1;
					}
		      break;
				case "g":
					if(result[6] == 0) {
						result [6]= j+1;
					}
		      break;
				case "h":
					if(result[7] == 0) {
						result [7]= j+1;
					}
		      break;
				case "i": 
					if(result[8] == 0) {
						result [8]= j+1;
					}
		      break;
				case "j": 
					if(result[9] == 0) {
						result [9]= j+1;
					}
		      break;
				case "k": 
					if(result[10] == 0) {
						result [10]= j+1;
					}
		      break;
				case "l": 
					if(result[11] == 0) {
						result [11]= j+1;
					}
		      break;
				case "m": 
					if(result[12] == 0) {
						result [12]= j+1;
					}
		      break;
				case "n": 
					if(result[13] == 0) {
						result [13]= j+1;
					}
		      break;
				case "o": 
					if(result[14] == 0) {
						result [14]= j+1;
					}
		      break;
				case "p": 
					if(result[15] == 0) {
						result [15]= j+1;
					}
		      break;
				case "q": 
					if(result[16] == 0) {
						result [16]= j+1;
					}
		      break;
				case "r": 
					if(result[17] == 0) {
						result [17]= j+1;
					}
		      break;
				case "s": 
					if(result[18] == 0) {
						result [18]= j+1;
					}
		      break;
				case "t": 
					if(result[19] == 0) {
						result [19]= j+1;
					}
		      break;
				case "u": 
					if(result[20] == 0) {
						result [20]= j+1;
					}
		      break;
				case "v": 
					if(result[21] == 0) {
						result [21]= j+1;
					}
		      break;
				case "w":
					if(result[22] == 0) {
						result [22]= j+1;
					}
		      break;
				case "x": 
					if(result[23] == 0) {
						result [23]= j+1;
					}
		      break;
				case "y": 
					if(result[24] == 0) {
						result [24]= j+1;
					}
		      break;
				case "z": 
					if(result[25] == 0) {
						result [25]= j+1;
					}
		      break;
			}
		}
		for(int i=0;i<=25;i++) {
			if(result[i] == 0)
				System.out.print("-1 ");
			else {
				System.out.print((result[i]-1)+" ");
			}
				

			
			
		}
		
		sc.close();
		
	}
}


/*


문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력 1 
baekjoon
예제 출력 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

*/