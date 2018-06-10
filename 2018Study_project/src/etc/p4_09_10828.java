package etc;

import java.util.Arrays;
import java.util.Scanner;

public class p4_09_10828 {
	static int[] stack = new int[10001]; 
	static int index = 1;
	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[][] cmd = new String[num][2]; 
		
		sc.nextLine();
		
		for(int i=0; i<num;i++) {
			
			cmd[i][0] = sc.next();
			if(cmd[i][0].equals("push")) {
				cmd[i][1] = sc.next();

			}else {
				cmd[i][1] = "";
			}
			sc.nextLine();
		}
		
		
		for(int i=0; i<num;i++) {
			if(cmd[i][0].equals("push")) {
				push(cmd[i][1] );
				
			}else if(cmd[i][0].equals("pop")) {
				pop();
			}else if(cmd[i][0].equals("size")) {
				size();
			}else if(cmd[i][0].equals("top")) {
				top();
				
			}else if(cmd[i][0].equals("empty")) {
				empty();
			}
		
		}
		
	}
	
	public static void push(String cmd) {
		stack[index] = Integer.parseInt(cmd);
		index += 1;
	}
	public static void pop() {
		if(index-1 <= 0) {
			System.out.println("-1");			
		}else {
			System.out.println(stack[index-1]);
			index -= 1;
			stack[index] = 0;
			
		}
		
		
	}
	public static void top() {
		if(index-1 <= 0) {
			System.out.println("-1");			
		}else {
			System.out.println(stack[index-1]);
		}
	}
	public static void size() {
		System.out.println(index-1);
		
	}
	public static  void empty() {
		if(index-1 <= 0) {
			System.out.println("1");			
		}else {
			System.out.println("0");
		}

	}	
	
	
}
