public class study01 {

	public static void main(String[] args) {
		String[] num = new String[10000]; 
		int y = 0;
		int result10 = 0;
		int result12 = 0;
		int result16 = 0;
		for (int i=1000; i <= 9999; i++) {
			num[y] = Integer.toString(i);
			result10 = sum_arr(num[y]);
			result12 = mod12(num[y]);
			result16 = mod16(num[y]);
			
			if(result10 == result12 && result10 == result16 && result12==result16) {
				System.out.println(num[y]);
			}
			y++;
		}


	}
	public static int sum_arr(String value) {
		int sum = 0,num_t= 0, result_sum=0;
		
		char[] array_word = new char[value.length()];
		char re_sum;
		for (int i = 0; i < array_word.length; i++) {
			array_word[i] = (value.charAt(i));
   }
		for (int i =0; i < array_word.length; i++ ) {
			num_t = (int) array_word[i] - 48;
			sum += num_t;
		}
		
		return sum;

		
	}
	
	public static int mod12(String value) {
		int num10 = 0, num =0, result = 0 ,test=0;
		num10 = Integer.parseInt(value);
		result = num10 / 12;
		num = num10 % 12; 
		//System.out.println(num);
		while( result > 0 ) {
			test = result % 12;
			result = result / 12;
			//System.out.println(test);
			
			//System.out.println(test);
			num = num + test; 
			
		}

		
		return num;

		
	}
	public static int mod16(String value) {
		int num10 = 0, num =0, result = 0 ,test=0;
		num10 = Integer.parseInt(value);
		result = num10 / 16;
		num = num10 % 16; 
		//System.out.println(num);
		while( result > 0 ) {
			test = result % 16;
			result = result / 16;
			//System.out.println(test);
			
			//System.out.println(test);
			num = num + test; 
			
		}

		
		return num;

		
	}
	
	
	
	
	
}

/*

 싱기한 네자리 숫자란, [1000,9999]인 10진수 숫자중에서,  다음의 조건을 만족하는 숫자를 말한다.

숫자를 10진수, 12진수, 16진수로 나타낸 다음, 각각의 숫자에 대해, 각 숫자의 자리수를 더했을 때, 세 값이 모두 같아야 한다.
여러분은 싱기한 네자리 숫자를 모두 출력해야 한다.
 
 
 
2992
2993
2994
2995
2996
2997
2998
2999



	String[] num10 = new String[10000]; //10���� �迭
		String[] num12 = new String[10000]; //12���� �迭
		String[] num16 = new String[10000]; //16���� �迭
		
		int fin_result_10 = 0,fin_result_12 = 0,fin_result_16 = 0;
		int y = 0;
		for (int i=1000; i <= 9999; i++) {
			

			
			num10[y]=Integer.toString(i);
			num12[y] = change(i);
			num16[y] = Integer.toHexString(i);
			
			//System.out.println(num10[y]);
			
	
			
			
			fin_result_10 = new_arr(num10[y]);
			fin_result_12 = new_arr(num12[y]);
			fin_result_16 = new_arr(num16[y]);
			
			if(fin_result_10 == fin_result_12 && fin_result_10==fin_result_16 && fin_result_12==fin_result_16) {
				
				System.out.println(num10[y]); 

			}
			
			y++;

		}

	}
	

	public static String change(int value){
		
		String returnString = "";
		int num=0,result=0;


		num = value % 12; 
		result = value / 12;
		if(num == 11) {
			returnString = result +"a";
		}else if(num == 10){
			returnString = result +"b";
		}else {

			returnString = result + Integer.toString(num);
		}
			
			
		
		return returnString;
	}
	

	public static int new_arr(String value) {
		int sum = 0,num_t= 0;
		char[] array_word = new char[value.length()];
		char re_sum;
		for (int i = 0; i < array_word.length; i++) {
			array_word[i] = (value.charAt(i));
   }
		
		
		
		for (int i =0; i < array_word.length; i++ ) {
			re_sum = array_word[i];
			
			
			if(re_sum == 'a') {
				num_t = 10;
				
			}else if(re_sum == 'b') {
				num_t = 11;

				
			}else if(re_sum == 'c') {
				num_t = 12;

				
			}else if(re_sum == 'd') {
				num_t = 13;

				
			}else if(re_sum == 'e') {
				num_t = 14;

				
			}else if(re_sum == 'f') {
				num_t = 15;

				
			}else {
				num_t = (int)re_sum - 48 ;
				
			}
			//System.out.println(num_t); 
			sum += num_t;
		}
		
		return sum;
		
		
		
		
		
	}
	

*/



