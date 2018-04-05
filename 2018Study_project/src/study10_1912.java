import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study10_1912 {

	public static void main(String[] args)throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(sc.readLine());
		
	
		
		int[] a = new int[cnt];
		int[] d = new int[cnt];
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());

		for(int x=0; x < cnt; x++) {
			a[x] = Integer.parseInt(st.nextToken());
			
		}
		sc.close();
		
		int max = a[0]; // -1 부들부들
		
        for (int i = 0; i < cnt; i++) {
            d[i] = a[i];
            if(i==0) {
               	d[i] = d[i];
            }else {
            	if(d[i-1]<0) {
            		d[i] = d[i]+ 0;
            	}else {
            		d[i] = d[i]+d[i-1];	
            	}
            	
            }
            if(max<d[i]) {
            	max = d[i];
            }
                
          
             
        }
        System.out.println(max);
        //System.out.println(d[i]+"num : "+i);
        
		
		
	}
	
}
/*
10
10 -4 3 1 5 6 -35 12 21 -1
*/
