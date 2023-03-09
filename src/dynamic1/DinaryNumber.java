package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DinaryNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] arr = new long[91][2];
		arr[1][0] = 0;
		arr[1][1] = 1;
		arr[2][0] = 1;
		arr[2][1] = 0;
		arr[3][0] = 1;
		arr[3][1] = 1;
		arr[4][0] = 2;
		arr[4][1] = 1;
		for(int i =5;i<=n;i++) {
			arr[i][0] = arr[i-1][1]+arr[i-1][0];
			arr[i][1] = arr[i-1][0];
		}
		System.out.println(arr[n][0]+arr[n][1]);
	}
}
