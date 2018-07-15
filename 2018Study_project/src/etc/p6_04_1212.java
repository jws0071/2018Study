package etc;

import java.util.Scanner;

public class p6_04_1212 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String result = "";
	   for (int i = 0; i < num.length(); i++) {
	  	 String result_1 = "";
	  	 int ac =  num.charAt(i) - 48;
	  	System.out.println(ac);
	  	if(ac==3) {
	  		result_1 = "011";
	  	}else if(ac==2) {
	  		result_1 = "010";
	  	}else if(ac==1) {
	  		result_1 = "001";
	  		
	  	}else if(ac==0) {
	  		result_1 = "000";
	  		
	  	}else {
		  	while(ac > 0) {
		  		
		  		result_1 = (ac%2) + result_1;
		  		
		  		//System.out.println("ac = " +ac);
		  		ac = ac/2;
		  	}
		  	//System.out.println(result_1);
	  	}
	  	System.out.println(result_1);
	  	result = result + result_1;
	   }
	   if(result.substring(0,1).equals("0") && result.substring(1,2).equals("0") && result.substring(2,3).equals("0")) {
	  	 System.out.println(result.substring(1));
	   }else if(result.substring(0,1).equals("0") && result.substring(1,2).equals("0")) {
	  	 System.out.println(result.substring(2));
	   }else if(result.substring(0,1).equals("0")) {
	  	 System.out.println(result.substring(3));
	   }
	   
	   
	   //System.out.println(result);
		sc.close();
	}
		
	



}
