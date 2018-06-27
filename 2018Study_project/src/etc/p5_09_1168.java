package etc;
//틀림
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class p5_09_1168 {
	public static void main(String args[]) {
    LinkedList list = new LinkedList();
    LinkedList list_result = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp_num = num;
		int up_index = 0;
		int del = sc.nextInt();

		for(int i = 1; i<=num; i++ ) {
			list.add(i);
		}
		while(list.size() > 0) {

			
			if(list.size() <= del-1) {
			  for (int i =0; i<list.size();i++) {
			  	list_result.add(list.get(i));
			  }
			  for (int j =0; j<list.size();j++) {
			  	list.remove(j);
			  }
			break;
	
			}else if((up_index+del)-1 > list.size()) {
				int temp = (up_index+del)-1 - list.size();
				up_index = temp;
				list_result.add(list.get(up_index));
				list.remove(up_index);

			}else {
				up_index += del-1;
				list_result.add(list.get(up_index));
				list.remove(up_index);

			}

			
		}
		
		for(int x=0;x<list_result.size();x++) {
			if(x == 0) {
				System.out.print("<"+list_result.get(x)+", ");	
			}else if(x==list_result.size()-1) {
				System.out.print(list_result.get(x)+">");
			}else {
				System.out.print(list_result.get(x)+", ");	
			}
			
			
		}
		
		sc.close();
	 
 }
}
