package etc;
//런타임 에러
import java.util.Scanner;

public class p5_13_1850 {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in); 
    int a = sc.nextInt(); 
    int b = sc.nextInt(); 
    
    
    String a_temp ="";
    String b_temp ="";
    
    for(int i=0;i<a;i++){

    	a_temp = a_temp + "1";
    	
    }
    for(int i=0;i<b;i++){
    	b_temp = b_temp + "1";
    }

    a = Integer.parseInt(a_temp);
    b = Integer.parseInt(b_temp);
    int aa = a;
    int bb = b;
    while(a>0){ 
      if(a<b){ 
        int temp = a; 
        a = b; 
        b = temp; 
      } 
      a = a%b; 
    } 
    System.out.println(b);
    sc.close();
}
	
}
/*

문제
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이 때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.

예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

입력
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 19자리를 넘지 않는 자연수이다.

출력
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.

예제 입력 1 
3 4
예제 출력 1 
1
예제 입력 2 
3 6
예제 출력 2 
111
*/