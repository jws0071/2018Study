import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class study09 {

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(sc.readLine());
		
	
		
		int[] st_arr = new int[cnt+1];
		int[] st_arr_result = new int[cnt+1];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());

		for(int x=0; x < cnt; x++) {
			st_arr[x] = Integer.parseInt(st.nextToken());
			
		}
		sc.close();
<<<<<<< HEAD
		
		for(int i =1; i<=cnt; i++) {
			st_arr_result[i] = st_arr[i];
			for(int j=1; j<i;j++) {
				if(st_arr[j] < st_arr[i] && st_arr_result[i] < st_arr_result[j]+st_arr[i]) {
					st_arr_result[i] = st_arr_result[j] + st_arr[i];
					
				}
				
			}
			if(temp<st_arr_result[i]) {
				temp = st_arr_result[i];
			}
				
			
			
		}

		System.out.println(temp+st_arr[0]);	
				
			
		//Arrays.sort(st_arr_result);

		//System.out.println(st_arr_result[st_arr_result.length-1]);
=======
 
        for (int i = 0; i < cnt; i++) {
            st_arr_result[i] = st_arr[i];
 
            for (int j = 0; j < i; j++) {
                if (st_arr[j] < st_arr[i] && st_arr_result[i] < st_arr_result[j] +st_arr[i]) {
 
                	st_arr_result[i] = st_arr_result[j] + st_arr[i];
 
                }
            }
 
 
        }
        
        int max = st_arr_result[0];
        
        for(int i = 0; i < cnt; i++) {
            if(max < st_arr_result[i]) {
                max = st_arr_result[i];
            }
        }

		System.out.println(max);
>>>>>>> 210d86f020b42afa2c847ad122a5da922a0804e8
		
	}
	
}