package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		int[] dp = new int[n];
		dp[0] = arr[0];
		for(int i = 1;i<n;i++) {
			dp[i] = arr[i];
			for(int j = i-1;j>=0;j--) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i],dp[j]+arr[i]);
				}
			}
			
		}
		int max =0;
		for(int i = 0;i<n;i++) {
			if(max<dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}
