package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGBStreet {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dp  = new int[n][3];
		int[][] result = new int[n][3];
		for(int j = 0;j<n;j++) {
			String[] arr = br.readLine().split(" ");
			for(int i = 0;i<3;i++){
				dp[j][i] = Integer.parseInt(arr[i]);
			}
		}
		result[1][0] = Math.min(dp[0][1]+dp[1][0],dp[0][2]+dp[1][0]);
		result[1][1] = Math.min(dp[0][0]+dp[1][1],dp[0][2]+dp[1][1]);
		result[1][2] = Math.min(dp[0][1]+dp[1][2],dp[0][0]+dp[1][2]);
		for(int i =2;i<n;i++) {
			result[i][0] = Math.min(result[i-1][1]+dp[i][0],result[i-1][2]+dp[i][0]);
			result[i][1] = Math.min(result[i-1][0]+dp[i][1],result[i-1][2]+dp[i][1]);
			result[i][2] = Math.min(result[i-1][1]+dp[i][2],result[i-1][0]+dp[i][2]);
			
		}
		System.out.println(Math.min(result[n-1][0],Math.min(result[n-1][1],result[n-1][2])));
	}
}
