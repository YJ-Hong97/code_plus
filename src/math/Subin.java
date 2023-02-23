package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int S = Integer.parseInt(arr[1]);
		String[] bros = br.readLine().split(" ");
		int[] ds = new int[N];
		for(int i = 0;i<N;i++) {
			int B = Integer.parseInt(bros[i]);
			int d = Math.abs(S-B);
			ds[i] = d;
		}
		int gcd = ds[0];
		for(int i = 0;i<ds.length;i++) {
			gcd = Math.min(gcd,GCD(gcd,ds[i]));
			
		}
		System.out.println(gcd);
	}

	private static int GCD(int gcd, int i) {
		while(i>0) {
			int r = gcd%i;
			gcd = i;
			i = r;
		}
		return gcd;
	}
}
