	import java.util.*;

	public class study14_2580 {
		static int[][] main_pan = new  int[9][9]; // 1~9까지 들어가야하는 판이니까
    static boolean stop; 
		static boolean impossible(int num, int x, int y) {  // 1. 행 , 2.열 , 3. 3X3정사각형에서 같은 값이 있으면 안됨 유망성 테스트
      int rx = x / 3 * 3, ry = y / 3 * 3;   
      for (int i = 0; i < 9; i++) 
          if (main_pan[x][i] == num || main_pan[i][y] == num) return false;  // 행 & 열에서 같은 값이 있는 지 확인
      for (int i = rx; i < rx + 3; i++)       // 몫에 3을 곱하고하고 3을 더해서 각 구역별 3X3정사각형을 만듬
          for (int j = ry; j < ry + 3; j++)  
              if (main_pan[i][j] == num) return false;
      return true;
  }
		
		static void temp() {
			if (stop) return;
			int x = -1, y = -1; // 0으로 초기화시에는 (0,0)와 같은 부분에서 오류 
			
			
			find:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (main_pan[i][j] == 0) {  // 열에서 0인 값을 찾음
                    x = i; 
                    y = j; 
                    break find; // 찾은 위치 저장하고 루프종료
                }
            }
        }
      if (x==-1) {
        stop = true;  // 더이상 호출할 값이 없는 경우 종료
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(main_pan[i][j]+" ");
            System.out.println();
            }
        }
        return;
    }
			
			
      for (int i = 1; i < 10; i++) {  // 1부터 9까지 넣을수 있는 값을 찾아야함
        if (impossible(i,x,y)) {
        	  main_pan[x][y] = i;
            temp();
            main_pan[x][y] = 0;
        }
    }
			
			
			
			
		}
		

		
		public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
      for(int i=0; i<9; i++) {
          for(int j=0; j<9; j++) {
          	main_pan[i][j] = in.nextInt();
          }
      }
      temp();  
      in.close();
      
      
		}
		
		
	}

	/*
	public class study14_2580 {
	    static int[][] a = new int[9][9];
	    static boolean stop;
	    static boolean impossible(int num, int x, int y) {
	        int rx = x / 3 * 3, ry = y / 3 * 3;
	        for (int i = 0; i < 9; i++) 
	            if (a[x][i] == num || a[i][y] == num) return false;
	        for (int i = rx; i < rx + 3; i++)
	            for (int j = ry; j < ry + 3; j++) 
	                if (a[i][j] == num) return false;
	        return true;
	    }
	    static void go() {
	        if (stop) return;
	        int x = -1, y = -1;
	         
	        find:
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                if (a[i][j] == 0) {
	                    x = i; 
	                    y = j;
	                    break find;
	                }
	            }
	        }
	         
	        if (x==-1) {
	            stop = true;
	            for (int i = 0; i < 9; i++) {
	                for (int j = 0; j < 9; j++) 
	                    System.out.print(a[i][j]+" ");
	                System.out.println();
	            }
	            return;
	        }
	         
	        for (int i = 1; i < 10; i++) {
	            if (impossible(i,x,y)) {
	                a[x][y] = i;
	                go();
	                a[x][y] = 0;
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        for(int i=0; i<9; i++)
	            for(int j=0; j<9; j++)
	                a[i][j] = in.nextInt();
	        go();
	        in.close();
	    }
	}


/*
0 3 5 4 6 9 2 7 8
7 8 2 1 0 5 6 0 9
0 6 0 2 7 8 1 3 5
3 2 1 0 4 6 8 9 7
8 0 4 9 1 3 5 0 6
5 9 6 8 2 0 4 1 3
9 1 7 6 5 2 0 8 0
6 0 3 7 0 1 9 5 2
2 5 8 3 9 4 7 6 0



1 3 5 4 6 9 2 7 8
7 8 2 1 3 5 6 4 9
4 6 9 2 7 8 1 3 5
3 2 1 5 4 6 8 9 7
8 7 4 9 1 3 5 2 6
5 9 6 8 2 7 4 1 3
9 1 7 6 5 2 3 8 4
6 4 3 7 8 1 9 5 2
2 5 8 3 9 4 7 6 1
*/