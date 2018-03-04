public class study01 {

	public static void main(String[] args) {
		
		String[] num10 = new String[10000]; //10진수 배열
		String[] num12 = new String[10000]; //12진수 배열
		String[] num16 = new String[10000]; //16진수 배열
		
		int fin_result_10,fin_result_12,fin_result_16 = 0;
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
			
			if(fin_result_10 == fin_result_12 && fin_result_10==fin_result_16) {
				System.out.println(num10[y]); // 10진수와 12진수 // 10진수와 16진수 비교후 동일하면 10진수 리턴
				System.out.println(num12[y]);
				System.out.println(num16[y]);
				System.out.println(fin_result_10); 
				System.out.println(fin_result_12); 
				System.out.println(fin_result_16); 
			
			}
			
			y++;

		}

	}
	
	//12진법 변환 메서드
	public static String change(int value){
		
		String returnString = "";
		int num,result,result_1 =0;

		//System.out.println("2");
		num = value % 12; // 나머지
		result = value / 12; //몫
		if(num == 11) {
			returnString = result +"A";
		}else if(num == 10){
			returnString = result +"B";
		}else {
			//result_1 = result * 2; // 10진수에 빼주면 나오는 값
			returnString = result + Integer.toString(num);
		}
			
			
		
		return returnString;
	}
	
	
	//배열 쪼개서 더하기 미완성 
	public static int new_arr(String value) {
		int sum = 0;
		char re_sum;
		for (int i = 0; i < value.length(); i++) {
			re_sum = value.charAt(i);
			
			switch (re_sum) {
            case 'A': re_sum = 10;
            		  sum += re_sum;
                     break;
            case 'B': re_sum = 11;
            		  sum += re_sum;
                     break;
            case 'C':  re_sum = 12;
  		               sum += re_sum;
                     break;
            case 'D':  re_sum = 13;
              	       sum += re_sum;
                     break;
            case 'E': re_sum = 14;
                      sum += re_sum;
                     break;
            case 'F': re_sum = 15;
                      sum += re_sum;
                     break;
            default:  sum += re_sum;
                     break; 
			
			}
			
			
			
		      
		      
		    }

		
		
		return sum;
		
		
		
		
		
	}
	
	
	
	
}

/*
싱기한 네자리 숫자란, [1000,9999]인 10진수 숫자중에서,  다음의 조건을 만족하는 숫자를 말한다.

숫자를 10진수, 12진수, 16진수로 나타낸 다음, 각각의 숫자에 대해, 각 숫자의 자리수를 더했을 때, 세 값이 모두 같아야 한다.
여러분은 싱기한 네자리 숫자를 모두 출력해야 한다.

*/



