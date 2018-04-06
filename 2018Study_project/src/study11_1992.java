import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study11_1992 {

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(sc.readLine());
		
	
		
		int[][] a = new int[cnt][cnt];
		int[] d = new int[cnt];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());

		for(int x=0; x < cnt; x++) {
			for(int y=0; y<cnt; y++) {
				a[x][y] = Integer.parseInt(st.nextToken());	
			}
		}
		sc.close();
		
		int temp =0;
		for(int x=0; x < cnt; x++) {
			for(int y=0; y<cnt; y++) {
				temp += a[x][y];	
			}
		}
		if(temp ==cnt*cnt ) {
			System.out.print("1");
		}else if(temp ==0){
			System.out.print("0");
		}else {
			// 4x4로 나눠야한다.
			// 재귀함수를 호출해서 계속저으로 값을 나누고 배열에 값을 하나씩 넣으면서 출력해야겟다
			
			
		}
		
		
		
		
		
		
        //System.out.println(d[i]+"num : "+i);
        
		
		
	}
	
}
/*
10
10 -4 3 1 5 6 -35 12 21 -1
*/
