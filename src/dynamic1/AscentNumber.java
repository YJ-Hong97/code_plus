package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AscentNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[n+1][10];
		for(int i =0;i<10;i++) {
			dp[1][i] = 1;
		}
		for(int i = 2;i<n+1;i++) {
			for(int j = 0;j<10;j++) {
				for(int k = 0;k<=j;k++) {
					dp[i][j] +=dp[i-1][k]%10007;
				}
			}
		}
		long sum = 0;
		for(int i = 0;i<dp[n].length;i++) {
			sum+=dp[n][i]%10007;
		}
		System.out.println(sum%10007);
	}
}
