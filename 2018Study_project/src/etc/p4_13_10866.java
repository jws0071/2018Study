package etc;

import java.util.Scanner;

public class p4_13_10866 {
	static int[] deque = new int[10001]; 
	static int index_queue = 1;
	static int index_stack = 1;
	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[][] cmd = new String[num][2]; 
		
		sc.nextLine();
		
		for(int i=0; i<num;i++) {
			
			cmd[i][0] = sc.next();
			if(cmd[i][0].equals("push_back") || cmd[i][0].equals("push_front")) {
				cmd[i][1] = sc.next();

			}else {
				cmd[i][1] = "";
			}
			sc.nextLine();
		}
		
		
		for(int i=0; i<num;i++) {
			if(cmd[i][0].equals("push_back")) {
				push_back(cmd[i][1] );
				
			}else if(cmd[i][0].equals("push_front")) {
				push_front(cmd[i][1] );
				
			}
       /*
  			else if(cmd[i][0].equals("pop")) {
				pop();
			}else if(cmd[i][0].equals("size")) {
				size();
			}else if(cmd[i][0].equals("front")) {
				front();
				
			}else if(cmd[i][0].equals("back")) {
				back();
				
			}else if(cmd[i][0].equals("empty")) {
				empty();
			}
		*/
		}
		
	}
	public static void push_front(String cmd) {
		deque[index_queue] = Integer.parseInt(cmd);
		index_queue += 1;
	}
	public static void push_back(String cmd) {
		deque[index_stack] = Integer.parseInt(cmd);
		index_stack += 1;
	}

	/*
	public static void pop() {
		if(index_front == index_last)
		{
			System.out.println("-1");
		}else {
			System.out.println(queue[index_front]);
			queue[index_front] = 0;
			index_front += 1;
		}

		
	}
	public static void front() {
		if(index_front == index_last) {
			System.out.println("-1");			
		}else {
			System.out.println(queue[index_front]);
		}
	}
	public static void back() {
		if(index_front == index_last) {
			System.out.println("-1");			
		}else {
			System.out.println(queue[index_last-1]);
		}
	}
	
	public static void size() {
		System.out.println(index_last-index_front);
		
	}
	public static  void empty() {
		if(index_front == index_last) {
			System.out.println("1");			
		}else {
			System.out.println("0");
		}

	}	
	*/
	
}
