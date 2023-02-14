package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * [분류] 정렬
 * 수 정렬하기 3
 */
public class B10989 {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정렬되기 전 배열 arr을 만들기
		int arrLength = Integer.parseInt(br.readLine());
		int[] arr = new int[arrLength];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] =  Integer.parseInt(br.readLine());
		}
		
		//--------------------------------------------------------

		//최댓값 구하기
		int num = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(num<arr[i]) {
				num = arr[i];
			}
		}
		
		//--------------------------------------------------------
		
		//최댓값을 최대 인덱스로 한 새로운 배열을 만든다.
		//counting 배열 : arr배열의 각 값이 몇 개인지를 보여주는 배열.
		int[] counting = new int[num+1];
		for(int i = 0 ; i < arr.length ; i++) {
			counting[arr[i]]++;
		}
		
		//--------------------------------------------------------
		
        for (int i = 0; i < counting.length; i++) {
        	
        	// 0개 이상일 때만 출력한다.
        	// 출력할 때마다 개수를 줄여나간다. 
        	// 0이되면 while문에 해당되지 않게 되므로, 다음 arr의 값으로 넘어감
            while (counting[i] > 0) {
            	//System.out.println(i);
            	bw.write(i+"\n");
                counting[i]--;
            }
        }
        bw.close();
        
    }
}
