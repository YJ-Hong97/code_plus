package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class NGF {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		String[] arr = br.readLine().split(" ");
		int[] intArr = new int[tc];
		int[] cnt = new int[1000001];
		for(int i = 0;i<tc;i++) {
			intArr[i] = Integer.parseInt(arr[i]);
			cnt[intArr[i]]++;
		}
		for(int i = 0;i<tc;i++) {
			
			while(!stack.empty()&&cnt[intArr[stack.peek()]]<cnt[intArr[i]]) {
				intArr[stack.pop()] = intArr[i];
			}
			stack.push(i);
		}
		
		while(!stack.empty()) {
			intArr[stack.pop()] = -1;
		}
		for(int i = 0;i<tc;i++) {
			bw.write(intArr[i]+" ");
		}
		bw.flush();
		bw.close();
	}
}
