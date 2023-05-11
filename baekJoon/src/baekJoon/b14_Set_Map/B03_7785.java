package baekJoon.b14_Set_Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B03_7785 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < length ; i++) {
			String[] input = br.readLine().split(" ");
			if(input[1].equals("enter")) {
				list.add(input[0]);
			} else {
				list.remove(list.indexOf(input[0]));
			}
		}
		
		for(String a : list) {
			bw.write(a+"\n");
		}
		br.close();
		bw.close();
	}
	
	

}


