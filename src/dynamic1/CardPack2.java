package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardPack2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] result = new int[n+1];
		String[] arr = br.readLine().split(" ");
		int[] prices = new int[n+1];
		for(int i = 0;i<arr.length;i++) {
			prices[i+1] = Integer.parseInt(arr[i]);
		}
		
		for(int i = 1;i<=n;i++) {
			result[i] = prices[1]*i;
			for(int j = 1;j<=prices.length;j++) {
				
				if(i>=j) {
					int p = prices[j];
					result[i]=Math.min(result[i],result[i-j]+p);
				}
			}
		}
		System.out.println(result[n]);
	}
}
