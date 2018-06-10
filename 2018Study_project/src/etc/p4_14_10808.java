package etc;

import java.util.Scanner;


public class p4_14_10808 {

	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int[] result =  new  int[26];
	
		for(int j=0; j<num.length();j++) {
			//System.out.println(num.substring(j, j+1));
			switch (num.substring(j, j+1)) {
				case "a": result[0] +=1;
				  break;
				case "b": result[1] +=1;
		          break;
				case "c": result[2] +=1;
		          break;
				case "d": result[3] +=1;
		          break;
				case "e": result[4] +=1;
		          break;
				case "f": result[5] +=1;
		          break;
				case "g": result[6] +=1;
		          break;
				case "h": result[7] +=1;
		          break;
				case "i": result[8] +=1;
		          break;
				case "j": result[9] +=1;
		          break;
				case "k": result[10] +=1;
		          break;
				case "l": result[11] +=1;
		          break;
				case "m": result[12] +=1;
		          break;
				case "n": result[13] +=1;
		          break;
				case "o": result[14] +=1;
		          break;
				case "p": result[15] +=1;
		          break;
				case "q": result[16] +=1;
		          break;
				case "r": result[17] +=1;
		          break;
				case "s": result[18] +=1;
		          break;
				case "t": result[19] +=1;
		          break;
				case "u": result[20] +=1;
		          break;	
				case "v": result[21] +=1;
		          break;	
				case "w": result[22] +=1;
		          break;
				case "x": result[23] +=1;
		          break;	
				case "y": result[24] +=1;
		          break;	
				case "z": result[25] +=1;
		          break;	
			}
		}
		for(int i=0;i<=25;i++) {
			

				System.out.print(result[i]+" ");

			
			
		}
		
		sc.close();
		
	}
}


