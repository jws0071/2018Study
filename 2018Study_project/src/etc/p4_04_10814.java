package etc;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p4_04_10814 {
	public static void main(String args[]) {
	
	Scanner  sc = new Scanner(System.in);
	int num  = sc.nextInt();
	String[][] arr_num = new String[num][2];
	sc.nextLine();
	for(int i=0; i<num;i++) {
		arr_num[i][0] = sc.next();
		arr_num[i][1] = sc.next();
		sc.nextLine();
	}
	sc.close();
	Arrays.sort(arr_num, new Comparator<String []>(){
		 public int compare(String[] one, String[] two){
       return Integer.compare(Integer.parseInt(one[0]),Integer.parseInt(two[0]));
   }
	});

	
	
	for(int i=0; i<num;i++) {
		System.out.println(arr_num[i][0] +" "+arr_num[i][1]);

	}

	}

}



/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p4_04_10814 {
	public static void main(String args[]) {
	
	Scanner  sc = new Scanner(System.in);
	int num  = sc.nextInt();
	String[][] arr_str = new String[num][3];
	String[][] result = new String[num][3];
	int[][] arr_num = new int[num][2];
	sc.nextLine();
	for(int i=0; i<num;i++) {
		arr_str[i][0] = sc.next();
		arr_str[i][1] = sc.next();
		arr_str[i][2] = String.valueOf(i);
		sc.nextLine();
	}
	for (int j=0; j<num; j++) {
		arr_num[j][0] = Integer.parseInt(arr_str[j][0]);
		arr_num[j][1] = Integer.parseInt(arr_str[j][2]);
	}
	
	sc.close();
	Arrays.sort(arr_num, new Comparator<int []>(){
		public int compare(int a[], int b[]) {
			if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
			else return Integer.compare(a[0], b[0]);
		}
	});
	for(int x=0; x<num; x++) {
		for(int y=0; y<num; y++) {
			if(arr_num[x][0] == Integer.parseInt(arr_str[y][0]) && arr_num[x][1] == Integer.parseInt(arr_str[y][2]) ) {
				result[x][0] = arr_str[y][0];
			  result[x][1] = arr_str[y][1];
			}
		}
	}
	
	
	for(int i=0; i<num;i++) {
		System.out.println(result[i][0] +" "+result[i][1]);

	}

	}

}
*/

