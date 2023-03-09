package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDecomposition {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		long[][] dp = new long[n+1][k+1];
		
		for(int i = 0;i<n+1;i++) {
			dp[i][1]  = 1;
			for(int j = 2;j<k+1;j++) {
				for(int l = 0;l<=i;l++) {
					dp[i][j]+=dp[i-l][j-1]%1000000000;
				}
			}
		}
		System.out.println(dp[n][k]%1000000000);
	}
}
