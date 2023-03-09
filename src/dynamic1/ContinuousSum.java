package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		long[] dp = new long[n];
		dp[0] = Integer.parseInt(arr[0]);
		long max = dp[0];
		for(int i = 1;i<n;i++) {
			long sum = Integer.parseInt(arr[i])+dp[i-1];
			if(Integer.parseInt(arr[i])<sum) {
				dp[i] = sum;
			}else {
				dp[i] = Integer.parseInt(arr[i]);
			}
			if(max<dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}
