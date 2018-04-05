import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class study07 {

	public static void main(String[] args)throws Exception {
		ArrayList<String> string_list = new ArrayList<String>();
		ArrayList<String> result_list = new ArrayList<String>();
		ArrayList<String> temp_list = new ArrayList<String>();
		ArrayList<String> temp_big_list = new ArrayList<String>();
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	
		String insert_string = sc.readLine();

		sc.close();

		
		for (int i=0; i<insert_string.length(); i++) {
			 String if_st= insert_string.substring(i,i+1);

			 // 연산자와 문자를 분리하고  연산자는 우선 순위를 맥임
			if(if_st.equals("/")||if_st.equals("*")||if_st.equals("+")||if_st.equals("-")||if_st.equals("(")||if_st.equals(")") ) {
				temp_list.add(if_st);
				temp_list_f(temp_list,result_list,temp_big_list,  if_st); // 연산자 스택
				
			}else {
				 if(temp_big_list.isEmpty()) {
					 result_list.add(if_st); // 문자 저장
				 }else {
					 // 현재 연산자가 값이 클때 뒤에 있는 문자를 먼저 넣기 위해서 버퍼를 둠
					 result_list.add(if_st);
						for(int x=0; x<temp_big_list.size();x++) {
							result_list.add(temp_big_list.get(x).toString());
						}
					 temp_big_list.clear();
					
				 }
			}
				
		}
		// 연산자 스택에 남은 값을 옴김
		int num = temp_list.size();	
		for(int j=num-1; j>=0;j--) {
			result_list.add(temp_list.get(j).toString());
		}
		
		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 속도 차이남 
        for(int j=0; j<result_list.size();j++) {
        	bw.write(result_list.get(j).toString());
			
		}
		
	bw.close();
		
		

	}//     A*(B+C)  A*B*C

	private static void temp_list_f(ArrayList<String> temp_list, ArrayList<String> result_list,ArrayList<String> temp_big_list,String if_st) {
		// TODO Auto-generated method stub
		int num = temp_list.size();
		String de_string = null;
		// 현재 값이 0일때 해결하기 위해서
		if(num-1 == 0) {
			de_string = temp_list.get(num-1).toString();
		}else{
			de_string = temp_list.get(num-2).toString();
		}
		
		//System.out.println(de_string);
		
		int post_num = Integer.parseInt(change(de_string));  // 현재 앞에 값
		int now_num = Integer.parseInt(change(if_st));  // 현재 값

		int index_f = 0;
		
		
	    // 현재의 연산자가 )일때
		if(now_num == 4) {
		
			
			for(int i =temp_list.size()-2; i>=0; i--) {
				
				//  '('이 연산자를 찾기 위해서 )에서 부터 내려감
				if(temp_list.get(i).toString().equals("(")) {
					index_f = i;
					//  (   )  괄호 안에 있는 값을 스택으로 이동
					for(int j=i+1; j<temp_list.size()-1;j++) {
						result_list.add(temp_list.get(j).toString());
					}
					
					//  (   )  괄호를 삭제한다
					for(int k =temp_list.size()-1; k>=index_f; k--) {
						temp_list.remove(k);
					}
					break;
				}
				
			}


		// 현재의 연산자가 앞에 연산자보다 클때
		}else if(post_num !=5 &&post_num < now_num) {
			temp_big_list.add(if_st);
			temp_list.remove(num-1);
	    // 현재의 연산자가 앞에 연산자보다 같을때
		}else if(post_num !=5 && post_num == now_num && num >1) {
			result_list.add(de_string);
			temp_list.remove(num-2);
	    // 현재의 연산자가 앞에 연산자보다 작을때
		}else if(post_num !=5 && now_num !=5 && post_num > now_num && num >1) {
			result_list.add(de_string);
			temp_list.remove(num-2);
		}

	}
	// 연산자에 우선순위를 둔다
	private static String change(String string) {

		if(string.equals("*") || string.equals("/")) {
			string = "9";
		}else if( string.equals("+") ||string.equals("-")) {
			string = "7";
		}else if( string.equals("(")) {
			string = "5";
		}else if(string.equals(")")) {
			string = "4";
		}else {
			string = "0";
		}
		
		return string;
		
		
		
	}


}
