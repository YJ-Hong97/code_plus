package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LIS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] dp = new int[n];
		dp[0] = 1;
		for(int i = 1;i<n;i++) {
			dp[i] = 1;
			int max = 0;
			for(int j =0;j<i;j++) {
				if(Integer.parseInt(arr[i])>Integer.parseInt(arr[j])) {
					if(max<dp[j]) {
						max = dp[j];
					}
				}
			}
			dp[i]+=max;
		}
		Arrays.sort(dp);
		
		System.out.println(dp[n-1]);
	}
}
