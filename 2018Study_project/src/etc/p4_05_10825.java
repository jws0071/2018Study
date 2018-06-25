package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class p4_05_10825 {
	public static void main(String args[]) throws Exception {
		// 버퍼를 통해 입력 값을 받음
		// (이유 : Scanner를 이용 할 경우 매우 느림)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<User> userArrayList = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			// 사용자 정보를 받아와서 배열 리스트 형태로 만듬
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			userArrayList.add(new User(st.nextToken(), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		br.close();

		// 사용자 배열 리스트 정렬
		Collections.sort(userArrayList, User.comparator);

		// 버퍼를 통해 출력 값을 만듬
		// (이유 : System.out.println을 여러번 호출 할 경우 매우 느림)
		StringBuilder sb = new StringBuilder();

		for (User user : userArrayList) {
			sb.append(user.name).append("\n");
		}

		// 출력 값 한꺼번에 출력
		System.out.println(sb.toString());
	}

	/**
	 * 사용자 이너 클래스
	 * 
	 * @author devetude
	 */
	private static class User {
		public String name;
		public int korean;
		public int english;
		public int math;

		/**
		 * 생성자
		 * 
		 * @param name
		 * @param korean
		 * @param english
		 * @param math
		 */
		public User(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}

		/**
		 * 사용자 객체 비교 이너 클래스
		 */
		private static Comparator<User> comparator = new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				// 국어 점수는 내림차순으로
				if (u1.korean > u2.korean) {
					return -1;
				}

				else if (u1.korean == u2.korean) {
					// 영어 점수는 오름차순으로
					if (u1.english > u2.english) {
						return 1;
					}

					else if (u1.english == u2.english) {
						// 수학 점수는 내림차순으로
						if (u1.math > u2.math) {
							return -1;
						}

						else if (u1.math == u2.math) {
							// 이름은 사전순으로
							return u1.name.compareTo(u2.name);
						}

						else {
							return 1;
						}
					}

					else {
						return -1;
					}
				}

				else {
					return 1;
				}
			}
		};
	}
}
/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p4_05_10825 {
	public static void main(String args[]) {
	
	Scanner  sc = new Scanner(System.in);
	int num  = sc.nextInt();
	String[][] arr_num = new String[num][4];
	sc.nextLine();
	for(int i=0; i<num;i++) {
		arr_num[i][0] = sc.next();
		arr_num[i][1] = sc.next();
		arr_num[i][2] = sc.next();
		arr_num[i][3] = sc.next();

		sc.nextLine();
	}
	sc.close();
	Arrays.sort(arr_num, new Comparator<String []>(){
		 public int compare(String[] a, String[] b){
				if(Integer.parseInt(a[1]) == Integer.parseInt(b[1])) {
					if(Integer.parseInt(a[2]) == Integer.parseInt(b[2])) {
						if(Integer.parseInt(a[3]) == Integer.parseInt(b[3])) {
							//return compare(a[0], b[0]);
							return 0; // 현재 오류중
						}
						else return Integer.compare(Integer.parseInt(a[3]), Integer.parseInt(b[3]));
					}
					else return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
				}
				else return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
			 
   }
	});

	
	
	for(int i=0; i<num;i++) {
		System.out.println(arr_num[i][0]);

	}

	}

}
*/
