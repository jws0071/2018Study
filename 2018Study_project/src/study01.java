public class study01 {

	public static void main(String[] args) {
		
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
			
			/*
			fin_result_10 = Integer.parseInt(new_arr(num10[y]));
			fin_result_12 = Integer.parseInt(new_arr(num12[y]));
			fin_result_16 = Integer.parseInt(new_arr(num16[y]));
			*/
			
			
			fin_result_10 = new_arr(num10[y]);
			fin_result_12 = new_arr(num12[y]);
			fin_result_16 = new_arr(num16[y]);
			
			if(fin_result_10 == fin_result_12 && fin_result_10==fin_result_16 && fin_result_12==fin_result_16) {
				
				System.out.println(num10[y]); 
				/*
				System.out.println(num12[y]);
				System.out.println(num16[y]);
				System.out.println(fin_result_10); 
				System.out.println(fin_result_12); 
				System.out.println(fin_result_16); 
			*/
			}
			
			y++;

		}

	}
	
	//12���� ��ȯ �޼���
	public static String change(int value){
		
		String returnString = "";
		int num=0,result=0;

		//System.out.println("2");
		num = value % 12; // ������
		result = value / 12; //��
		if(num == 11) {
			returnString = result +"a";
		}else if(num == 10){
			returnString = result +"b";
		}else {
			//result_1 = result * 2; // 10������ ���ָ� ������ ��
			returnString = result + Integer.toString(num);
		}
			
			
		
		return returnString;
	}
	
	
	//�迭 �ɰ��� ���ϱ� �̿ϼ� 
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
	
	
	
	
}

/*
2992
2993
2994
2995
2996
2997
2998
2999
*/



