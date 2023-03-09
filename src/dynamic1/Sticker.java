package dynamic1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sticker {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-->0) {
			int n = Integer.parseInt(br.readLine());
			long[][] dp = new long[n+1][3];
			int[][] arr = new int[n+1][3];
			for(int i = 1;i<3;i++) {
				String[] strings = br.readLine().split(" ");
				for(int j = 0;j<strings.length;j++) {
					arr[j+1][i] = Integer.parseInt(strings[j]);
				}
			}
			
			for(int i  = 1;i<n+1;i++) {
				dp[i][0] = Math.max(dp[i-1][0]+arr[i][0],Math.max(dp[i-1][1]+arr[i][0],dp[i-1][2]+arr[i][0]));
				dp[i][1] = Math.max(dp[i-1][0]+arr[i][1],dp[i-1][2]+arr[i][1]);
				dp[i][2] = Math.max(dp[i-1][0]+arr[i][2],dp[i-1][1]+arr[i][2]);
			}
			bw.write(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2]))+"\n");
		}
		bw.flush();
		bw.close();
	}
}
