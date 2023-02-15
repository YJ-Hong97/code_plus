package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class NGE {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] seq = new int[tc];
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<tc;i++) {
			seq[i] = Integer.parseInt(arr[i]);
		}
		for(int i =0;i<tc;i++) {
			while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
				seq[stack.pop()] = seq[i];
			}
			stack.push(i);
		}
		int max = stack.size();
		for(int i = 0;i<max;i++) {
			seq[stack.pop()] = -1;
		}
		for(int i = 0;i<seq.length;i++) {
			bw.write(seq[i]+" ");
		}
		bw.flush();
		bw.close();
	}
}
