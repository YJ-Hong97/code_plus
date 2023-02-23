package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	static int i = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fact(Integer.parseInt(br.readLine())));
	}

	private static int fact(int num) {
		if(num==0) {
			return i;
		}else {
			i *=num;
			num--;
			return(fact(num));
		}
	}
}
