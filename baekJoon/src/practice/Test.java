package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

class Data3 {int x;}


public class Test {


	public static void main(String[] args) throws Exception {

	Data3 d = new Data3();
	d.x = 10;
	
	Data3 d2 = copy(d);
	System.out.println("d.x = " + d.x);
	System.out.println("d2.x = " + d2.x);
	
	}

	static Data3 copy(Data3 d) {
		
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		
		Test.staticMethod();
		
		return tmp;
	}
	
	static int staticMethod() {
		
		return 2;
	}
}
