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
		
	
		
		int[] st_arr = new int[cnt];
		int[] st_arr_result = new int[cnt];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());

		for(int x=0; x < cnt; x++) {
			st_arr[x] = Integer.parseInt(st.nextToken());
			
		}
		sc.close();
 
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
		
	}
	
}