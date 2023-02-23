package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class EightToTwo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String string  = br.readLine();
		Stack<String> stack = new Stack<>();
		for(int i = string.length()-1;i>=0;i--) {
			int n = Integer.parseInt(string.charAt(i)+"");
			int count = 0;
			while(n>=1) {
				stack.push(n%2+"");
				n/=2;
				count++;
			}
			while(count<3) {
				stack.push("0");
				count++;
			}
		}
		while(stack.size()!=1&&stack.peek().equals("0")) {
			stack.pop();
		}
		while(!stack.empty()) {
			bw.write(stack.pop());
		}
		bw.flush();
		bw.close();
	}
}
