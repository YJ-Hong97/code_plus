package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardPack {
	static int[] result = new int[1001];
	static int[] prices = new int[10001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		for(int i =0;i<arr.length;i++) {
			prices[i+1] = Integer.parseInt(arr[i]);
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=arr.length;j++) {
				if(i>=j) {
					result[i] = Math.max(result[i-j]+prices[j],result[i]);
				}
			}
		}
		System.out.println(result[n]);
		
	}

	
}
