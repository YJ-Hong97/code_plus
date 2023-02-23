package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialZero {
	static int i = 1;
	static int five = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		fact(N);
		System.out.println(five);
		
	}

	private static int fact(int n) {
		if(n==0) {
			return i;
		}else {
			i *= n;
			int temp = n;
			while(temp>1&&temp%5==0) {
				temp/=5;
				five++;
			}
			return fact(--n);
		}
		
	}
}
