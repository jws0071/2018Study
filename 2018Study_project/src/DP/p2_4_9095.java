package DP;

import java.util.Scanner;

public class p2_4_9095 {
	static int[] d = new int[1000+1];
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    System.out.println(f(n));
		    scan.close();
		
	}
	public static int f(int n) {
	    if(n<4) {
	    	d[1]=1;
	    	d[2]=2;
	    	d[3]=4;
	    	return d[n];
	    }
	    if(d[n]>0) {  // 한번 계산해서 값이 있으면 그걸 이용려고
	        return d[n];
	    }else {
	        d[n] = f(n-1) + f(n-2) + f(n-3); //2부터 3 = 2+1, 4 = 3+2,  5 = 5+3 자기 자리에서  앞에 두개의 값을 합치면 자기것이 나옴
	        return d[n];
	    }
	}
	
	
}
