import java.util.*;

public class study13_6118 {
		
	public static void main(String args[]) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //정점의 갯수
		int M = sc.nextInt(); //간선의 갯수
    int[][] arr = new int[M][2];
    // 연결관계
    for (int i = 1; i <= M; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
    }
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    sc.close();
	}
	

}

/*
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;

public class study13_6118 {
	public static ArrayList<Integer> map[]; //인접 리스트 그래프
	
	public static int n, INF = Integer.MAX_VALUE, farthest, farthestDist, sameDist;
	
	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String line[] = in.readLine().split(" ");
		int i, from, to, m = Integer.parseInt(line[1]);
		n = Integer.parseInt(line[0]);
		
		map = new ArrayList[n];
		for (i = 0; i < n; i++) map[i] = new ArrayList<>();
		
		for (i = 0; i < m; i++) {
			line = in.readLine().split(" ");
			from = Integer.parseInt(line[0]) - 1; //인덱스로 할꺼라서 -1함
			to = Integer.parseInt(line[1]) - 1;//상동
			map[from].add(to);//양방향그래프
			map[to].add(from);//상동
		}
		
		dijkstra(0);
		
		//인덱스라서 노드번호+1
		out.write(String.format("%d %d %d", farthest+1, farthestDist, sameDist));
		out.close();
		in.close();
	}
	
	private static void dijkstra(int start) {
		int i, curNode;
		
		Distance dist[] = new Distance[n];
		for (i = 0; i < n; i++) dist[i] = new Distance(i, INF);
		dist[start].dist = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(start);
		
		while (!pq.isEmpty()) {
			curNode = pq.poll();
			for (int nextNode : map[curNode])
				if (dist[nextNode].dist > 1 + dist[curNode].dist) {
					dist[nextNode].dist = dist[curNode].dist + 1;
					pq.offer(nextNode);
				}
		}
		
		Arrays.sort(dist);
		
		//정렬 후 배열의 첫번째 거리 정보가 우리가 원하는 정보
		farthest = dist[0].idx;
		farthestDist = dist[0].dist;
		
		//배열을 탐색하며 거리가 같은 노드들을 찾는다.
		for(i=0;i<n;i++){
			if(dist[i].dist==farthestDist) sameDist++;
			else break;
		}
	}
}
//거리클래스
class Distance implements Comparable<Distance> {
	int idx, dist;//각각 노드번호(인덱스), 거리
	
	public Distance(int idx, int dist) {
		this.idx = idx;//노드번호(인덱스)
		this.dist = dist;//거리
	}
	
	//정렬 기준
	public int compareTo(Distance d) {
		//거리가 같다면 인덱스 기준 오름차순
		if (dist == d.dist) return Integer.compare(idx, d.idx);
		//거리가 먼 순으로 정렬(내림차순)
		return Integer.compare(d.dist, dist);
	}
}
*/
/*

문제
재서기는 수혀니와 교외 농장에서 숨바꼭질을 하고 있다. 농장에는 헛간이 많이 널려있고 재석이는 그 중에 하나에 숨어야 한다. 헛간의 개수는 N(2 <= N <= 20,000)개이며, 1 부터 샌다고 하자.  

재서기는 수혀니가 1번 헛간부터 찾을 것을 알고 있다. 모든 헛간은 M(1<= M <= 50,000)개의 양방향 길로 이어져 있고, 그 양 끝을 A_i 와 B_i(1<= A_i <= N; 1 <= B_i <= N; A_i != B_i)로 나타낸다. 또한 어떤 헛간에서 다른 헛간으로는 언제나 도달 가능하다고 생각해도 좋다. 

재서기는 발냄새가 지독하기 때문에 최대한 냄새가 안나게 숨을 장소를 찾고자 한다. 냄새는 1번 헛간에서의 거리(여기서 거리라 함은 지나야 하는 길의 최소 개수이다)가 멀어질수록 감소한다고 한다. 재서기의 발냄새를 최대한 숨길 수 있는 헛간을 찾을 수 있게 도와주자!

입력
첫번째 줄에는 N과 M이 공백을 사이에 두고 주어진다.

이후 M줄에 걸쳐서 A_i와 B_i가 공백을 사이에 두고 주어진다.

 

출력
출력은 한줄로 이루어지며, 세 개의 값을 공백으로 구분지어 출력해야한다. 

첫번째는 숨어야 하는 헛간 번호를(만약 거리가 같은 헛간이 여러개면 가장 작은 헛간 번호를 출력한다), 두번째는 그 헛간까지의 거리를, 세번째는 그 헛간과 같은 거리를 갖는 헛간의 개수를 출력해야한다.

예제 입력 1 
6 7
3 6
4 3
3 2
1 3
1 2
2 4
5 2
예제 출력 1 
4 2 3

*/