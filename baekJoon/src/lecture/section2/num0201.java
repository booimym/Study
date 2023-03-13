package lecture.section2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num0201 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		
		for(int i = 0; i < length; i++) {
			if(i==0) {
				bw.write(arr[i]+" ");
			} else {
				if(Integer.parseInt(arr[i])>Integer.parseInt(arr[i-1])) {
					bw.write(arr[i]+" ");
				}
			}
		}
		bw.close();
		
	}

}
