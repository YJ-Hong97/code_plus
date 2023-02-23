package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumGCD {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0) {
			String[] arr = br.readLine().split(" ");
			long sum = 0;
			for(int i = 1;i<arr.length;i++) {
				int A = Integer.parseInt(arr[i]);
				for(int j = i+1;j<arr.length;j++) {
					int B = Integer.parseInt(arr[j]);
					sum += GCD(A,B);
				}
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}

	private static int GCD(int a, int b) {
		while(b>0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
