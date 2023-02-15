package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Bracket {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(tc-->0) {
			bw.write(yesOrNo(br.readLine()));
			
		}
		bw.flush();
		bw.close();
	}

	private static String yesOrNo(String brackets) {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0;i<brackets.length();i++) {
			if(brackets.charAt(i)=='(') {
				stack.push(i);
			}else {
				if(stack.empty()) {
					return "NO\n";
				}else {
					stack.pop();
				}
			}
				
		}
		if(stack.empty()) {
			return "YES\n";
		}else {
			return "NO\n";
		}
	}
}
