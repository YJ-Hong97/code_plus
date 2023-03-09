package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tiling2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int[] arr = new int[1001];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 3;
		for(int i = 3;i<=n;i++) {
			arr[i] = (arr[i-1]+arr[i-2]+arr[i-2])%10007;
		}
		System.out.println(arr[n]);
	}
}
