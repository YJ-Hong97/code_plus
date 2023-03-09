package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfStairs {
	 public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[101][10];
		dp[1][1] = 1;
		dp[1][2] = 1;
		dp[1][3] = 1;
		dp[1][4] = 1;
		dp[1][5] = 1;
		dp[1][6] = 1;
		dp[1][7] = 1;
		dp[1][8] = 1;
		dp[1][9] = 1;
		for(int i = 2;i<=n;i++) {
			for(int j=0;j<=9;j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][j+1]%1000000000;
				}else if(j==9){
					dp[i][j] = dp[i-1][j-1]%1000000000;
				}else {
					dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
				}
				
			}
		}
		long result = 0;
		for(int j = 0;j<dp[n].length;j++) {
			result+=dp[n][j]%1000000000;
		}
		System.out.println(result%1000000000);
	}
}
