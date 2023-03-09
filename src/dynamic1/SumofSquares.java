package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofSquares {
	static int[] dp = new int[100001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] pows  = new int[(int)Math.sqrt(n)+1];
		for(int i = 0;i<pows.length;i++) {
			pows[i] = (int) Math.pow(i,2);
		}
		
		for(int i = 1;i<n+1;i++) {
			dp[i] = dp[i-1]+1;
			for(int j = 1;j<pows.length;j++) {
				if(i-pows[j]>=0) {
					dp[i] = Math.min(dp[i],dp[i-pows[j]]+1);
				}
				
			}
		}
		System.out.println(dp[n]);
		
	}
}
