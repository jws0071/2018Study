import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class study11_1992 {
  static	ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args)throws Exception {

	
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = null;
	    int index_x =0;
	    int index_y =0;
	    int cnt_x = Integer.parseInt(br.readLine());
	    int cnt_y =cnt_x;
	    char[] low = null;
			int[][] a = new int[cnt_x][cnt_y];
			
	    for(int i = 0; i < cnt_x; i++){
	      st = new StringTokenizer(br.readLine());
	      low = st.nextToken().toCharArray();
	      for(int j = 0; j < cnt_y; j++){
	        a[i][j] = Integer.parseInt(low[j]+"");
	        
	      }
	    }

	    br.close();
	    
	    shard(a,index_x,cnt_x,index_y,cnt_y);
	    for(int a1 = 0; a1 < list.size(); a1++){
	      System.out.println(list.get(a1).toString());
	    }
	    
	    
	}
	public static void shard(int[][] a, int index_x, int cnt_x, int index_y, int cnt_y) {
		
		int temp =0;
		int x =0;
		int y =0;
		int sum=0;
		//System.out.print("index_x "+index_x+"\n");
		//System.out.print("index_y "+index_y+"\n");
		//System.out.print("cnt_x "+cnt_x +"\n");
		//System.out.print("cnt_y "+cnt_y+"\n");
		for(x=index_x; x < cnt_x; x++) {
			for(y=index_y; y< cnt_y; y++) {
				temp += a[x][y];	
			}
			sum++;
		}
		
		//System.out.print("sum "+sum+"\n");
		if(temp == sum*sum ) {
			//System.out.print("test=1"+"\n");
			list.add("1");
			return;
		}else if(temp == 0){
			//System.out.print("test=2"+"\n");
			list.add("0");
			return;
		}
		else if(temp !=0  && temp < sum*sum  && sum>2) {
			//System.out.print("test3");
			list.add("(");
			shard(a,index_x,cnt_x/2,index_y,cnt_y/2);
		  shard(a,index_x,cnt_x/2,cnt_y/2,cnt_y );
			shard(a,cnt_x/2,cnt_x,index_y,cnt_y/2);
			shard(a,cnt_x/2,cnt_x,cnt_y/2,cnt_y);
			list.add(")");
	}	else if(sum<=2) {
		//System.out.print("test4");
		list.add("(");

		list.add( Integer.toString(a[index_x][index_y]));
		list.add( Integer.toString(a[index_x][index_y+1]));
		list.add( Integer.toString(a[index_x+1][index_y]));
		list.add( Integer.toString(a[index_x+1][index_y+1]));
		list.add(")");
}
	
}
}

//4x4로 나눠야한다.
// 재귀함수를 호출해서 계속저으로 값을 나누고 배열에 값을 하나씩 넣으면서 출력해야겟다			

/*
8
11110000
11110000
00011100
00011100
11110000
11110000
11110011
11110011

4
1111
1111
0001
0001


*/



/*
for(int x=0; x < cnt/2; x++) {
	for(int y=0; y<cnt/2; y++) {
		System.out.println("1");
	}
}
for(int x=cnt/2; x < cnt; x++) {
	for(int y=0; y<cnt/2; y++) {
		System.out.println("2");	
	}
}
for(int x=0; x < cnt/2; x++) {
	for(int y=cnt/2; y<cnt; y++) {
		System.out.println("3");
	}
}
for(int x=cnt/2; x < cnt; x++) {
	for(int y=cnt/2; y<cnt; y++) {
		System.out.println("4");
	}
}*/