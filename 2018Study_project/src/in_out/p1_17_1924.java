package in_out;

import java.util.Scanner;
// 문제 확인 필요함
public class p1_17_1924 {
	public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         
        int m = sc.nextInt();
        int d = sc.nextInt();
         
        int[] mdays = new int[13];
        mdays[1] = mdays[3] = mdays[5] = mdays[7] = mdays[8] = mdays[10] = mdays[12] = 31;
        mdays[4] = mdays[6] = mdays[9] = mdays[11] = 30;
        mdays[2] = 28;
         
        int sum = 0;
         
        for(int i = 1; i <= 12; i++) {
            if(i == m)  {
                break;
            }
             
            sum = sum + mdays[i];
        }
         
        sum = sum + d;
         
        switch(sum % 7) {
        case 0 :
            System.out.println("SUN");
            break;
        case 1 :
            System.out.println("MON");
            break;
        case 2 :
            System.out.println("TUE");
            break;
        case 3 :
            System.out.println("WED");
            break;
        case 4 :
            System.out.println("THU");
            break;
        case 5 :
            System.out.println("FRI");
            break;
        case 6 :
            System.out.println("SAT");
            break;
        }
 
    }


}
