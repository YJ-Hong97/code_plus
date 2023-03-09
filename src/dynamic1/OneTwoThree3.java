package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		long[] dp = new long[1000001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		while(tc-->0) {
			int n= Integer.parseInt(br.readLine());
			for(int i = 4;i<n+1;i++) {
				dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
			}
			System.out.println(dp[n]%1000000009);
		}
	}
}
