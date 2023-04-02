package baekJoon.b14_Set_Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * [ 문자열 집합 ]
 *
 */
public class B02_14425 {

	public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	    // 문자열 갯수 N 과 M 
	    int inputN =Integer.parseInt(st.nextToken());
	    int inputM =Integer.parseInt(st.nextToken());
	    
	    // M 단어를 Set에 넣기
	    //Set<String> setWordN = new HashSet<>();
	    List<String> setWordN = new ArrayList<>();
	    //5개만큼 단어들 set에 넣는 중...
	    for (int i = 0; i < inputN; i++) {
	        setWordN.add(br.readLine());
	    }
	    
	    int result = 0;
	    
	    // SetM에서 N단어 몇개 같은지 찾기
	    for(int i=0;i<inputM;i++) {
	        String key = br.readLine();
	        // contains = Set에 key값이 있는지 없는지 확인 (true,false 반환)
	        if(setWordN.contains(key)) {
	            result++;
	        }
	    }
	    
	    bw.write(result+"");
	    bw.close();
	    br.close();
	    
	}


}
