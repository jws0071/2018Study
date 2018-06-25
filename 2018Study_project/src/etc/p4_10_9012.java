package etc;

import java.util.Scanner;
import java.util.Stack;

public class p4_10_9012 {

	static int[] stack = new int[10001]; 
	static int index = 1;
	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] cmd = new String[num]; 
		String[] result = new String[num]; 
		sc.nextLine();
		
		for(int i=0; i<num;i++) {
			Stack<String> s = new Stack<String>();
			int check_null = 0;
			int left = 0;
			int right = 0;
			cmd[i] = sc.nextLine();
			for(int j=0; j<cmd[i].length();j++) {
				if(cmd[i].substring(j, j+1).equals("(")) {
					check_null +=1;
					s.push("(");
				}else if(!cmd[i].substring(j, j+1).equals("(") && s.empty()){
					check_null -=1;
					
				}else if(!cmd[i].substring(j, j+1).equals("(") && !s.empty()){
					s.pop();
					check_null -=1;
					
				}
			
			}
			if(s.empty() && check_null==0) {
				result[i] = "YES";
			}else 
				result[i] = "NO";
			}
		
		
		for(int x=0; x<num;x++) {
			
			System.out.println(result[x]);
		}
		sc.close();

		
		
	}
	
}


/*

if(cmd[i].substring(j, j+1).equals("(")) {
	left += 1;
}else{
	right += 1;
}
}
if(left==0 && right==0) {
result[i] = "NO";
}else if(left==right ){
result[i] = "YES";

}else {
result[i] = "NO";
}*/