package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0) {
			String[] arr = br.readLine().split(" ");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			int lcm = lcm(A,B);
			System.out.println(lcm);
		}
	}

	private static int lcm(int a, int b) {
		// TODO Auto-generated method stub
		return a*b/gcd(a,b);
	}

	private static int gcd(int a, int b) {
		while(b>0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
