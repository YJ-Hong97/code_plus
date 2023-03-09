package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[501][501];
		for(int i = 1;i<n+1;i++) {
			String[] strs = br.readLine().split(" ");
			for(int j = 1;j<strs.length+1;j++) {
				arr[i][j] = Integer.parseInt(strs[j-1]);
			}
		}
		int[][] dp = new int[501][501];
		for(int i = 1;i<n+1;i++) {
			for(int j =1;j<=i;j++) {
				dp[i][j] = Math.max(dp[i-1][j-1]+arr[i][j],dp[i-1][j]+arr[i][j]);
				
			}
		}
		
		int max = 0;
		for(int i = 1;i<n+1;i++) {
			if(max<dp[n][i]) {
				max = dp[n][i];
			}
		}
		System.out.println(max);
	}
}
