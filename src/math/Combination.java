package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination {
	static int five = 0;
	static int two = 0;
	static boolean plus = true;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M= Integer.parseInt(arr[1]);
		
		fact(N);
		plus = false;
		fact(M);
		fact(N-M);
		System.out.println(Math.min(five,two));
		
	}

	private static void fact(int m) {
		int temp = m;
		while(temp>=5) {
		
			if(plus) {
				five+=temp/5;
			}else {
				five-=temp/5;
			}
			temp/=5;
		}
		temp = m;
		while(temp>=2) {
			if(plus) {
				two+=temp/2;
			}else {
				two-=temp/2;
			}
			temp/=2;
		}
		
	}
}
