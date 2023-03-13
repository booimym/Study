package lecture.section1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num0101 {
	
	public static void num01() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split("");
		String x = br.readLine();
		int count = 0;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i].toUpperCase().equals(x.toUpperCase())) {
				count++;
			}
		}
		
		bw.write(count+"");
		bw.close();
	}
	
	public static void num02() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//'A'의 아스키 코드 : 65 , 'a'의 아스키코드 : 97;
		
		String[] arr = br.readLine().split("");
		
		for(int i = 0; i < arr.length; i++) {
			//arr의 각각의 String을 char로 변환해서 아스키코드로 비교한 후, A~Z면 소문자화, a~z면 대문자화
			if(arr[i].charAt(0)>=97) {
				arr[i] = arr[i].toUpperCase();
				bw.write(arr[i]);
			} else {
				arr[i] = arr[i].toLowerCase();
				bw.write(arr[i]);
			}
		}
		
		bw.close();
	}
	
	public static void num08() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split("");
		
		boolean flag = true;
		
		//홀수 길이인 경우
		int mid = arr.length /2;

		
		//--------------------------------------------------------------------------------------------------------
		
		for(int i = 0; i < mid ; i++) {
			//System.out.println("i는"+ i);
			char one = arr[i].charAt(0);
			char two = arr[(arr.length-1)-i].charAt(0);
			//System.out.println("one은"+one);
			//System.out.println((one >= 65 && one<= 90 || one >=97 && one <= 122)+"입니다");
			//만약 알파벳이라면,
			
			//(1) 비교
			if(arr[i].toLowerCase().equals(arr[(arr.length-1)-i].toLowerCase())) {
				System.out.println("-------------같다면-------------");
				flag = true;
				System.out.println("flag는?"+flag);
				
			}else {
				System.out.println("------------다르다면-------------");
				if((one >= 65 && one<= 90 || one >=97 && one <= 122)||(two >= 65 && two<= 90 || two >=97 && two <= 122)) {
					System.out.println("((둘 중 하나라도 알파벳이라면))");
					flag = false;
					System.out.println("flag는?"+flag);
					break;
				} else {
					System.out.println("((알파벳x))");
					flag = true;
					System.out.println("flag는?"+flag);
				}
				
				
				
			}
			
		}
		//System.out.println("for문 나온 flag는?"+flag);
		if(flag) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	
	}

	
	public static void main(String[] args) throws IOException {
		
		//num01();
		//num02();
		num08();
	}

}
