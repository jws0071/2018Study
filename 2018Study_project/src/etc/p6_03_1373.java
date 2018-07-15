package etc;

import java.util.Scanner;

public class p6_03_1373 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int n = 2;
		int result = 0;
		String[] new_arr = new String[num.length()/3+1];
		int[] result_arr = new int[num.length()/3+1];
		if(num.equals("0")) {
			System.out.println("0");
		}
		if(num.length()%3 == 1) {
				num = "00"+ num;
		}else if((num.length()%3 == 2)){
			num = "0"+ num;
			
		}

		for(int j=0; j < new_arr.length; j++) {
			

				String temp = "";
				temp = temp + num.substring((num.length()-j*3)-3, (num.length()-j*3)-2);
				temp = temp + num.substring((num.length()-j*3)-2, (num.length()-j*3)-1);
				temp = temp + num.substring((num.length()-j*3)-1, (num.length()-j*3));
				new_arr[j] = temp;


			//System.out.println(new_arr[j]);
			sc.close();
		}
		for(int i=new_arr.length-1; i >=0; i--) {
			int temp_1 = 0;
			//System.out.println(new_arr[i]);
			//System.out.println(Integer.parseInt(new_arr[i].substring(1, 2)));
			//System.out.println(Integer.parseInt(new_arr[i].substring(2, 3)));
			temp_1 = (int) ( temp_1 + Integer.parseInt(new_arr[i].substring(0, 1)) * 4);
		  //System.out.println(Math.pow(2, i));
			temp_1 = (int) ( temp_1 + Integer.parseInt(new_arr[i].substring(1, 2)) * 2);
			//System.out.println(Math.pow(2, i-1));
			temp_1 = (int) ( temp_1 + Integer.parseInt(new_arr[i].substring(2, 3))* 1);
			//System.out.println(Math.pow(2, i-2));
			System.out.print(temp_1);
		
		sc.close();
	}
		
		
		
		
		
	}
	



	
}
