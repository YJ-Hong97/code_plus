package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LIS4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] arr = br.readLine().split(" ");
		int[] dp = new int[n];
		int[] indexs = new int[n];
		dp[0] = 1;
		indexs[0] = 0;
		String finalString = "";
		int finalIndex = 0;
		for(int i = 1;i<n;i++) {
			dp[i] = 1;
			indexs[i] =9999;
			int max = 0;
			for(int j = 0;j<i;j++) {
				if(Integer.parseInt(arr[i])>Integer.parseInt(arr[j])) {
					if(max<dp[j]) {
						max = dp[j];
						indexs[i] = j;
						finalString = arr[i];
					}
				}
			}
			dp[i]+=max;
		}
		int max= 0;
		for(int i =0;i<n;i++) {
			if(max<dp[i]) {
				max = dp[i];
				finalString = arr[i];
				finalIndex = i;
			}
		}
		System.out.println(max);
		Stack<String> stack = new Stack<>();
		stack.push(finalString);
		for(int i = finalIndex;i>=0;i--) {
			if(i==0||indexs[i]==9999) {
				break;
			}
			stack.push(arr[indexs[i]]);
			i = indexs[i]+1;
			
		}
		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");
		}
	}
}
