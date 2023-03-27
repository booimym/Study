package baekJoon.b14_map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class B01_10815_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputN = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < inputN; i++) {
            int key = Integer.parseInt(st.nextToken());
            //입력받은 값을 map에 넣는다.
            map.put(key, 1);
        }

        int inputM = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[inputM];
        
        for (int i = 0; i < inputM; i++) {
           arr[i] = Integer.parseInt(st1.nextToken());
        }
        
        for (int i = 0; i < inputM; i++) {
        	// getOrDefault메소드를 이용해서 arr[i]이 map에 있는 key에 해당한다면 그 key에 해당하는 value를,
        	// map에 있는 key에 해당되지 않는다면 default값인 0을 꺼내오도록 한다. 그리고 bw.write를 이용해서 이를 출력함.
            bw.write(map.getOrDefault(arr[i], 0) + " ");
        }

        bw.close();
	}
}


